package tnq.tiil.edu.listview_danhsachcacquocgia_upgrade;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Country> dsQG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        dsQG = new ArrayList<>();
        dsQG.add(new Country("Việt Nam", 96000000, "vietnam_100"));
        dsQG.add(new Country("Russia", 140000000, "russia_100"));
        dsQG.add(new Country("United States", 80000000, "usa_100"));

        ListView listView = findViewById(R.id.lvCacQuocGia);
        CountryAdapter adapter = new CountryAdapter(dsQG, this);
        listView.setAdapter(adapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}