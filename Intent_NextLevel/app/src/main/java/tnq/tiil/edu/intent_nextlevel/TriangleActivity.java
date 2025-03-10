package tnq.tiil.edu.intent_nextlevel;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TriangleActivity extends AppCompatActivity {
    private EditText etBase, etHeight;
    private TextView tvResultTriangle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_triangle);
        etBase = findViewById(R.id.etBase);
        etHeight = findViewById(R.id.etHeight);
        tvResultTriangle = findViewById(R.id.tvResultTriangle);
        Button btnCalculateTriangle = findViewById(R.id.btnCalculateTriangle);
        Button btnBack = findViewById(R.id.btnBack);

        btnCalculateTriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double base = Double.parseDouble(etBase.getText().toString());
                double height = Double.parseDouble(etHeight.getText().toString());
                double area = 0.5 * base * height;
                tvResultTriangle.setText("Diện Tích: " + area);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Quay lại màn hình trước đó
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}