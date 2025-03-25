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
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewData;
    RecyclerView recyclerViewLandScape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // 3
        recyclerViewData = getDataForRecyclerView();
        // 4
        recyclerViewLandScape = findViewById(R.id.recyclerLand);
        // 5
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        // 6
        landScapeAdapter = new LandScapeAdapter(this, recyclerViewData);
        // 7
        recyclerViewLandScape.setAdapter(landScapeAdapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    ArrayList<LandScape> getDataForRecyclerView(){
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("flag_tower_of_hanoi", "Cot co Ha Noi");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(new LandScape("effel", "Thap Effel"));
        dsDuLieu.add(new LandScape("buckingham", "Cung dien Buckingham"));
        dsDuLieu.add(new LandScape("statue_of_liberty", "Tuong nu than tu do"));
        return dsDuLieu;
    }
}