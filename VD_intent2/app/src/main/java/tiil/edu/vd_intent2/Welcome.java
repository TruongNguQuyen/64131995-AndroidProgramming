package tiil.edu.vd_intent2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_welcome);
        ImageView imageView = findViewById(R.id.imgviewckg);

        // Tải và xử lý bitmap
        Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.girlkoreancutestickers);
        int width = originalBitmap.getWidth();
        int height = originalBitmap.getHeight();
        int maxSize = 1024;

        if (width > maxSize || height > maxSize) {
            float scale = Math.min((float) maxSize / width, (float) maxSize / height);
            Bitmap resizedBitmap = Bitmap.createScaledBitmap(originalBitmap,
                    (int) (width * scale),
                    (int) (height * scale),
                    true);
            originalBitmap.recycle();
            imageView.setImageBitmap(resizedBitmap);
        } else {
            imageView.setImageBitmap(originalBitmap);
        }
        String email = getIntent().getStringExtra("email");
        TextView tvWelcome = findViewById(R.id.tvWelcome);
        tvWelcome.setText("Chào mừng quay trở lại, " + email);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}