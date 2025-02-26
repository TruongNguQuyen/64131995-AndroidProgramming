// Name: Truong Ngu Quyen
// MSSV: 64131995

package tiil.edu.appcongtrunhanchia_var;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Hàm TimView
        TimView();
        //--------------------------------
        // Tạo các bộ lắng nghe và xử lý sự kiện
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
    // Các hàm xử lý
    void XuLyCong(){
        // Chuyển dữ liệu tìm kiếm được sang dạng chuỗi
        String strSoA = edtsoA.getText().toString();
        String strSoB = edtsoB.getText().toString();

        // Chuyển dữ liệu từ chuỗi sang dạng số thực để thực hiện tính toán
        double soA = Double.parseDouble(strSoA);
        double soB = Double.parseDouble(strSoB);

        // Tính toán kết quả + - * /
        double kq = soA + soB;

        // Chuyển kết quả tính được sang dạng chuỗi và gán cho edtkq
        String strKQ = String.valueOf(kq);
        edtKQ.setText(strKQ);
    }
    void XuLyTru(){
        // Chuyển dữ liệu tìm kiếm được sang dạng chuỗi
        String strSoA = edtsoA.getText().toString();
        String strSoB = edtsoB.getText().toString();

        // Chuyển dữ liệu từ chuỗi sang dạng số thực để thực hiện tính toán
        double soA = Double.parseDouble(strSoA);
        double soB = Double.parseDouble(strSoB);

        // Tính toán kết quả + - * /
        double kq = soA - soB;

        // Chuyển kết quả tính được sang dạng chuỗi và gán cho edtkq
        String strKQ = String.valueOf(kq);
        edtKQ.setText(strKQ);
    }
    void XuLyNhan(){
        // Chuyển dữ liệu tìm kiếm được sang dạng chuỗi
        String strSoA = edtsoA.getText().toString();
        String strSoB = edtsoB.getText().toString();

        // Chuyển dữ liệu từ chuỗi sang dạng số thực để thực hiện tính toán
        double soA = Double.parseDouble(strSoA);
        double soB = Double.parseDouble(strSoB);

        // Tính toán kết quả + - * /
        double kq = soA * soB;

        // Chuyển kết quả tính được sang dạng chuỗi và gán cho edtkq
        String strKQ = String.valueOf(kq);
        edtKQ.setText(strKQ);
    }
    void XuLyChia(){
        // Chuyển dữ liệu tìm kiếm được sang dạng chuỗi
        String strSoA = edtsoA.getText().toString();
        String strSoB = edtsoB.getText().toString();

        // Chuyển dữ liệu từ chuỗi sang dạng số thực để thực hiện tính toán
        double soA = Double.parseDouble(strSoA);
        double soB = Double.parseDouble(strSoB);

        // Tính toán kết quả + - * /
        double kq = soA / soB;

        // Chuyển kết quả tính được sang dạng chuỗi và gán cho edtkq
        String strKQ = String.valueOf(kq);
        edtKQ.setText(strKQ);
    }

    //-----------------------------------
    void TimView(){
        edtsoA = findViewById(R.id.edtA);
        edtsoB = findViewById(R.id.edtB);
        edtKQ = findViewById(R.id.edtkq);
        nutCong = findViewById(R.id.btncong);
        nutTru = findViewById(R.id.btntru);
        nutNhan = findViewById(R.id.btnnhan);
        nutChia = findViewById(R.id.btnchia);
    }
    // Khai báo các đối tượng tương ứng với các điều khiển (view) cần thao tác
    EditText edtsoA, edtsoB, edtKQ;
    Button nutCong, nutTru, nutNhan, nutChia;
}