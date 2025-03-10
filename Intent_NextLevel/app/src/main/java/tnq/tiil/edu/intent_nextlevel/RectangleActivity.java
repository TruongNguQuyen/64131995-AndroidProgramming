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

public class RectangleActivity extends AppCompatActivity {
    private EditText etLength, etWidth;
    private TextView tvResultRectangle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rectangle);
        etLength = findViewById(R.id.etLength);
        etWidth = findViewById(R.id.etWidth);
        tvResultRectangle = findViewById(R.id.tvResultRectangle);
        Button btnCalculateRectangle = findViewById(R.id.btnCalculateRectangle);
        Button btnBack = findViewById(R.id.btnBack);
        btnCalculateRectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double length = Double.parseDouble(etLength.getText().toString());
                double width = Double.parseDouble(etWidth.getText().toString());
                double perimeter = 2 * (length + width);
                double area = length * width;
                tvResultRectangle.setText("Chu Vi: " + perimeter + "\nDiện Tích: " + area);
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