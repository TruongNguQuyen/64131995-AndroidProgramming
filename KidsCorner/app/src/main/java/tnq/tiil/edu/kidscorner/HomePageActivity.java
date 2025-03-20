package tnq.tiil.edu.kidscorner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_homepage);
        // Tạo hàm chuyển hướng đến landing page, dùng intent
        // Sử dụng cardview ngầu nhiên để tạo hàm chuyển hướng: mình chọn cardview chứa Maths
        CardView cardView2 = findViewById(R.id.cardview2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Trong hàm này
                // Tạo intent
                Intent chuyenSangLandingPage = new Intent(HomePageActivity.this, LandingPageActivity.class);
                startActivity(chuyenSangLandingPage);
                Toast.makeText(HomePageActivity.this, "Thành công", Toast.LENGTH_SHORT).show();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}