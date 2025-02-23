package tiil.edu.appcongtrunhanchia;

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

    // khoi tao cac thuoc tinh
    EditText editTextso1;
    EditText editTextso2;
    EditText editTextkq;
    Button nutCong, nutTru, nutNhan, nutChia;


    // Tao ham nay de tranh lap lai nhieu lenh giong nhau
    void TimDieuKhien(){
        editTextso1 = findViewById(R.id.edtA);
        editTextso2 = findViewById(R.id.edtB);
        editTextkq = findViewById(R.id.edtkq);
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
        // Dua ham TimDieuKhien vao day de thuc hien dau tien
        TimDieuKhien();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // hàm xử lý cộng
    public void XuLyCong(View view){

        String stra = editTextso1.getText().toString();
        String strb = editTextso2.getText().toString();

        float soA = Float.parseFloat(stra);
        float soB = Float.parseFloat(strb);

        float Tong = soA + soB;

        String strkq = String.valueOf(Tong);

        editTextkq.setText(strkq);
    }

    // hàm xử lý trừ
    public void XuLyTru(View view){

        String stra = editTextso1.getText().toString();
        String strb = editTextso2.getText().toString();

        float soA = Float.parseFloat(stra);
        float soB = Float.parseFloat(strb);

        float Hieu = soA - soB;

        String strkq = String.valueOf(Hieu);

        editTextkq.setText(strkq);
    }

    // hàm xử lý nhân
    public void XuLyNhan(View view){

        String stra = editTextso1.getText().toString();
        String strb = editTextso2.getText().toString();

        float soA = Float.parseFloat(stra);
        float soB = Float.parseFloat(strb);

        float Tich = soA * soB;

        String strkq = String.valueOf(Tich);

        editTextkq.setText(strkq);
    }

    // hàm xử lý chia
    public void XuLyChia(View view){

        String stra = editTextso1.getText().toString();
        String strb = editTextso2.getText().toString();

        float soA = Float.parseFloat(stra);
        float soB = Float.parseFloat(strb);

        float Thuong = soA / soB;

        String strkq = String.valueOf(Thuong);

        editTextkq.setText(strkq);
    }
}