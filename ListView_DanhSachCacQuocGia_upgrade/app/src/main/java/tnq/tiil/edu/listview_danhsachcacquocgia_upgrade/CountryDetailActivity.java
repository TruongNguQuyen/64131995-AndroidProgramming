package tnq.tiil.edu.listview_danhsachcacquocgia_upgrade;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CountryDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_detail);

        ImageView imageViewFlag = findViewById(R.id.imageViewFlag);
        TextView textViewNationName = findViewById(R.id.textViewNationName);
        TextView textViewPopulation = findViewById(R.id.textViewPopulation);

        Intent intent = getIntent();
        String tenQG = intent.getStringExtra("tenQG");
        int danSo = intent.getIntExtra("danSo", 0);
        String tenFile = intent.getStringExtra("tenFile");

        textViewNationName.setText(tenQG);
        textViewPopulation.setText("Dân số: " + danSo);
        int idFlag = getResources().getIdentifier(tenFile, "mipmap", getPackageName());
        imageViewFlag.setImageResource(idFlag);
    }
}