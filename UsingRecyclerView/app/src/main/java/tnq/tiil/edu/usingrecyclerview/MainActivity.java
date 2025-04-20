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
    LandScapeAdapter adapter;
    ArrayList<LandScape> list;
    RecyclerView recyclerViewLandScape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        list = new ArrayList<>();
        list.add(new LandScape("Cột cờ Hà Nội", "hanoi_flag_tower", "Cột cờ Hà Nội là một trong những biểu tượng của Thủ đô Hà Nội."));
        list.add(new LandScape("Tháp Eiffel", "eiffel_tower", "Tháp Eiffel là một công trình kiến trúc nổi tiếng của nước Pháp."));
        list.add(new LandScape("Cung điện Buckingham", "buckingham_palace", "Cung điện Buckingham là nơi ở chính thức của Hoàng gia Anh."));
        list.add(new LandScape("Tượng nữ thần tự do", "nu_than_tu_do", "Tượng nữ thần tự do là một biểu tượng của nước Mỹ."));
        list.add(new LandScape("Vạn Lý Trường Thành", "vanlytruongthanh", "Vạn lý trường thành là một công trình lâu đời ở Trung Quốc"));
        list.add(new LandScape("Chùa Wat Arun", "wat_arun_thailand", "Ngôi chùa nổi tiếng wat arun ở Thái Lan với vẻ đẹp huyền bí bên cạnh dòng sông"));
        list.add(new LandScape("Tượng đá megalith cổ", "tuongda_daonias_indonesia", "Những pho tượng cổ từ thời tiền sử trên đảo Nias ở Indonesia"));
        list.add(new LandScape("Lâu đài Himeji", "laudai_himeji_nhatban", "Lâu đài Himeji hay còn gọi là Hạc Trắng là một trong những lâu đài đẹp nhất của Nhật Bản"));

        recyclerViewLandScape = findViewById(R.id.rVLandScape);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        adapter = new LandScapeAdapter(this, list);
        recyclerViewLandScape.setAdapter(adapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}