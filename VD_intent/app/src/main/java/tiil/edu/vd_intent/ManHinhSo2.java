package tiil.edu.vd_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ManHinhSo2 extends AppCompatActivity {
    TextView textViewSo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_manhinhso2);
        textViewSo2 = findViewById(R.id.txt2);
        textViewSo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QuayXe();
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void QuayXe(){
        // Tạo một đối tượng Intent
        Intent iHome = new Intent(this, MainActivity.class);
        startActivity(iHome);
    }
}