// Name: Truong Ngu Quyen
// MSSV: 64131995

package tiil.edu.vd_bmi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextWeight, editTextHeight, editTextBMIResult;
    Button nuttinhBMI;

    // Hàm tìm điều khiển
    void TimDieuKhien(){
        editTextWeight = findViewById(R.id.edtWeight);
        editTextHeight = findViewById(R.id.edtHeight);
        editTextBMIResult = findViewById(R.id.edtResultBMI);
        nuttinhBMI = findViewById(R.id.btnCalBMI);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // Hàm
        TimDieuKhien();
        // Khởi tạo bộ lắng nghe
        nuttinhBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalBMI();
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    void CalBMI() {
        // Chuyển dữ liệu thu nhận được sang dạng chuỗi
        String strWeight = editTextWeight.getText().toString();
        String strHeight = editTextHeight.getText().toString();

        if (strWeight.isEmpty() || strHeight.isEmpty()) {
            editTextBMIResult.setText("Vui lòng nhập đầy đủ thông tin!");
            return;
        }

        // Chuyển dữ liệu sang dạng số để tính toán
        try {
            double weight = Double.parseDouble(strWeight);
            double height = Double.parseDouble(strHeight)/100.0;

            if (height == 0) {
                editTextBMIResult.setText("Chiều cao phải lớn hơn 0!");
                return;
            }

            // Tính BMI
            double BMI = weight / (height * height);

            // Chuyển kết quả BMI vừa tính được sang dạng chuỗi
            String strBMI = String.format("%.2f", BMI); // Làm tròn 2 chữ số thập phân

            // Gán chuỗi kết quả cho edtResultBMI
            editTextBMIResult.setText(strBMI);
        } catch (NumberFormatException e) {
            editTextBMIResult.setText("Dữ liệu không hợp lệ!");
        }
    }
}