package tnq.tiil.edu.baithi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Lấy dữ liệu từ Intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String image = intent.getStringExtra("image");
        String description = intent.getStringExtra("description");

        // Ánh xạ và đặt dữ liệu lên giao diện
        TextView nameTextView = findViewById(R.id.detailName);
        ImageView imageView = findViewById(R.id.detailImage);
        TextView descriptionTextView = findViewById(R.id.detailDescription);

        nameTextView.setText(name);
        String packageName = getPackageName();
        int imageID = getResources().getIdentifier(image, "mipmap", packageName);
        imageView.setImageResource(imageID);
        descriptionTextView.setText(description);

        CardView cardViewQL = findViewById(R.id.cardViewQL_RCV);
        cardViewQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentQL = new Intent(DetailActivity.this, MainActivity.class);
                Toast.makeText(DetailActivity.this, "OK", Toast.LENGTH_SHORT).show();
                startActivity(intentQL);
            }
        });
    }
}