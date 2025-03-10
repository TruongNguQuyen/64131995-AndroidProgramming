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

public class CircleActivity extends AppCompatActivity {
    private EditText etRadius;
    private TextView tvResultCircle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_circle);
        etRadius = findViewById(R.id.etRadius);
        tvResultCircle = findViewById(R.id.tvResultCircle);
        Button btnCalculateCircle = findViewById(R.id.btnCalculateCircle);
        Button btnBack = findViewById(R.id.btnBack);

        btnCalculateCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double radius = Double.parseDouble(etRadius.getText().toString());
                double circumference = 2 * Math.PI * radius;
                double area = Math.PI * radius * radius;
                tvResultCircle.setText("Chu Vi: " + circumference + "\nDiện Tích: " + area);
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