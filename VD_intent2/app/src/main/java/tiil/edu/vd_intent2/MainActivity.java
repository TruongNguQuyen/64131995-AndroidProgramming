// Author info:
// Name: Truong Ngu Quyen
// MSSV: 64131995

package tiil.edu.vd_intent2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnlogin, btnregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.imgviewcg);

        // Tải và xử lý bitmap
        Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cutegirlwelcome);
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
        // Tìm id cho 2 btn login và register
        btnlogin = findViewById(R.id.btnlogin);
        btnregister = findViewById(R.id.btnregister);

        // Khởi tạo bộ lắng nghe chuyển trang
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Register.class));
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}