// Name: Truong Ngu Quyen
// MSSV: 64131995


package tiil.edu.appcong;

import android.os.Bundle;
import android.view.View;
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
        // Gắn layout tương ứng với file này
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // Đây là bộ lắng nghe và xử lý sự kiện
    public void XuLyCong(View view){
    // Tìm, tham chiếu đến điều khiển trên tệp XML
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtKQ);

        // Lấy dữ liệu về ở điều khiển số A
        String strA = editTextSoA.getText().toString();

        // Lấy dữ liệu về ở điều khiển số B
        String strB = editTextSoB.getText().toString();

        // Chuyển dữ lieu sang dang so
        int so_A = Integer.parseInt(strA); // 2
        int so_B = Integer.parseInt(strB); // 3

        // Tính toán theo yêu cầu
        int tong = so_A + so_B; // 5

        // Chuyển kết quả sang dạng chuỗi
        String strTong = String.valueOf(tong); // sau khi chuyển "5"

        // Hiện ra màn hình
        editTextKetQua.setText(strTong);
    }
}