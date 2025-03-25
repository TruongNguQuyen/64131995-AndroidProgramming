package tnq.tiil.edu.usingrecyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // 1. Khai báo các biến toàn cục
    LandScapeAdapter adapter;
    ArrayList<LandScape> list;
    // 2. Khai báo các biến đại diện cho các view cần tương tác
    RecyclerView recyclerViewLandScape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // 3. Chuẩn bị dữ liệu cho list
        list = new ArrayList<LandScape>();
        list.add(new LandScape("Cột cờ Hà Nội", "hanoi_flag_tower"));
        list.add(new LandScape("Tháp Eiffel", "eiffel_tower"));
        list.add(new LandScape("Cung điện Buckingham", "buckingham_palace"));
        list.add(new LandScape("Tượng nữ thần tự do", "nu_than_tu_do"));
        // 4. Tìm điều khiển Recycler
        recyclerViewLandScape = findViewById(R.id.rVLandScape);
        //  5. Tạo layout manager để đặt bố cục cho Recycler
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        // 6. Tạo adapter gắn vào nguồn dữ liệu
        adapter = new LandScapeAdapter(this, list);
        // 7. Gắn adapter vào Recycler
        recyclerViewLandScape.setAdapter(adapter);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}