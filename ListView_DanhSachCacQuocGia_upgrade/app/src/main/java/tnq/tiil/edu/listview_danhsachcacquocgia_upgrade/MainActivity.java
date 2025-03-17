package tnq.tiil.edu.listview_danhsachcacquocgia_upgrade;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Tìm view
        ListView listView = findViewById(R.id.lvnation);
        // Thêm các quốc gia vào danh sách
        ArrayList<String> countryList = new ArrayList<>();
        countryList.add("Việt Nam");
        countryList.add("Mỹ");
        countryList.add("Nga");

        // Gán dữ liệu cho adapter
        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countryList);

        // Đưa dữ liệu vào listview
        listView.setAdapter(adapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}