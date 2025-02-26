// Name: Truong Ngu Quyen
// MSSV: 64131995

package tiil.edu.appcongtrunhanchia_andanh;

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
    EditText editTextSo1, editTextSo2, editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    void TimDieuKhien(){
        editTextSo1 = findViewById(R.id.edtA);
        editTextSo2 = findViewById(R.id.edtB);
        editTextKQ = findViewById(R.id.edtkq);
        nutCong = findViewById(R.id.btncong);
        nutTru = findViewById(R.id.btntru);
        nutNhan = findViewById(R.id.btnnhan);
        nutChia = findViewById(R.id.btnchia);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // Thêm vào hàm TimDieuKhien
        TimDieuKhien();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Khởi tạo các bộ lắng nghe
        nutCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyCong();
            }
        });
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyTru();
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyNhan();
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyChia();
            }
        });
    }

    void XuLyCong(){
        // Chuyển sang dạng chuỗi
        String strso1 = editTextSo1.getText().toString();
        String strso2 = editTextSo2.getText().toString();

        // Chuyển sang dạng số thực
        double so1 = Double.parseDouble(strso1);
        double so2 = Double.parseDouble(strso2);

        // Tính kết quả cho 2 số + - * /
        double kq = so1 + so2;

        // Gán kết quả vửa tính được cho edtkq
        String strkq = String.valueOf(kq);
        editTextKQ.setText(strkq);
    }
    void XuLyTru(){
        // Chuyển sang dạng chuỗi
        String strso1 = editTextSo1.getText().toString();
        String strso2 = editTextSo2.getText().toString();

        // Chuyển sang dạng số thực
        double so1 = Double.parseDouble(strso1);
        double so2 = Double.parseDouble(strso2);

        // Tính kết quả cho 2 số + - * /
        double kq = so1 - so2;

        // Gán kết quả vửa tính được cho edtkq
        String strkq = String.valueOf(kq);
        editTextKQ.setText(strkq);
    }
    void XuLyNhan(){
        // Chuyển sang dạng chuỗi
        String strso1 = editTextSo1.getText().toString();
        String strso2 = editTextSo2.getText().toString();

        // Chuyển sang dạng số thực
        double so1 = Double.parseDouble(strso1);
        double so2 = Double.parseDouble(strso2);

        // Tính kết quả cho 2 số + - * /
        double kq = so1 * so2;

        // Gán kết quả vửa tính được cho edtkq
        String strkq = String.valueOf(kq);
        editTextKQ.setText(strkq);
    }
    void XuLyChia(){
        // Chuyển sang dạng chuỗi
        String strso1 = editTextSo1.getText().toString();
        String strso2 = editTextSo2.getText().toString();

        // Chuyển sang dạng số thực
        double so1 = Double.parseDouble(strso1);
        double so2 = Double.parseDouble(strso2);

        // Tính kết quả cho 2 số + - * /
        double kq = so1 / so2;

        // Gán kết quả vửa tính được cho edtkq
        String strkq = String.valueOf(kq);
        editTextKQ.setText(strkq);
    }
}