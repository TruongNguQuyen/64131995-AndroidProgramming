// Author information:
// Name: Truong Ngu Quyen
// MSSV: 64131995

package tnq.tiil.edu.vd_listviewcacquocgia;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Khai báo các thuộc tính cần thiết
    ListView listView;
    ArrayList<String> countryList;
    ArrayAdapter<String> adapter;
    Button ThemQuocGia;
    EditText editTextCountry;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Trong hàm onCreate này:
        // Tìm id của listview đã tạo
        listView = findViewById(R.id.listviewContries);
        // Tìm id cho Editext
        editTextCountry = findViewById(R.id.edtCountry);
        // Tìm id cho button thêm quốc gia
        ThemQuocGia = findViewById(R.id.btnAdd);
        // Thêm bộ lắng nghe cho button để xử lý sự kiện thêm quốc gia
        ThemQuocGia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newCountry = editTextCountry.getText().toString().trim();
                if (!newCountry.isEmpty()){

                    countryList.add(newCountry); // Thêm vào danh sách
                    adapter.notifyDataSetChanged(); // Cập nhật listview
                    editTextCountry.setText(""); // Xóa nội dung editext
                } else {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập tên quốc gia!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Khởi tạo danh sách các quốc gia
        countryList = new ArrayList<>();
        countryList.add("Việt Nam");
        countryList.add("Mỹ");
        countryList.add("Anh");
        countryList.add("Nhật Bản");
        countryList.add("Hàn Quốc");
        countryList.add("Pháp");

        // Gán dữ liệu vào adapter
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countryList);
        listView.setAdapter(adapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}