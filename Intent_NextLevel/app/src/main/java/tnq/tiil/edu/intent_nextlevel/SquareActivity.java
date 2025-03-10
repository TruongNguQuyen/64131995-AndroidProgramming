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

public class SquareActivity extends AppCompatActivity {
    private EditText etSide;
    private TextView tvResultSquare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_square);
        etSide = findViewById(R.id.etSide);
        tvResultSquare = findViewById(R.id.tvResultSquare);
        Button btnCalculateSquare = findViewById(R.id.btnCalculateSquare);
        Button btnBack = findViewById(R.id.btnBack);
        btnCalculateSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double side = Double.parseDouble(etSide.getText().toString());
                double perimeter = 4 * side;
                double area = side * side;
                tvResultSquare.setText("Chu Vi: " + perimeter + "\nDiện Tích: " + area);
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