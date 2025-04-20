package tnq.tiil.edu.listview_danhsachcacquocgia_upgrade;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class CountryDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_detail);

        ImageView imageViewFlag = findViewById(R.id.imageViewFlag);
        TextView textViewNationName = findViewById(R.id.textViewNationName);
        TextView textViewPopulation = findViewById(R.id.textViewPopulation);
        TextView textViewMoTa = findViewById(R.id.textViewMoTa); // Thêm TextView để hiển thị mô tả

        Intent intent = getIntent();
        String tenQG = intent.getStringExtra("tenQG");
        int danSo = intent.getIntExtra("danSo", 0);
        String tenFile = intent.getStringExtra("tenFile");
        String moTa = intent.getStringExtra("moTa"); // Nhận thông tin mô tả

        textViewNationName.setText(tenQG);
        textViewPopulation.setText("Dân số: " + danSo);
        textViewMoTa.setText("Mô tả: " + moTa); // Hiển thị mô tả
        int idFlag = getResources().getIdentifier(tenFile, "mipmap", getPackageName());
        imageViewFlag.setImageResource(idFlag);

        CardView cardView = findViewById(R.id.cardViewQL_LV);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentQL = new Intent(CountryDetailActivity.this, MainActivity.class);
                Toast.makeText(CountryDetailActivity.this, "OK", Toast.LENGTH_SHORT).show();
                startActivity(intentQL);
            }
        });
    }
}