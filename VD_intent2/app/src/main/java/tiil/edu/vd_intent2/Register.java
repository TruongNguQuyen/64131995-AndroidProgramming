// Author info:
// Name: Truong Ngu Quyen
// MSSV: 64131995

package tiil.edu.vd_intent2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Register extends AppCompatActivity {
    private EditText etRegisterEmail, etRegisterPassword;
    private DatabaseHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        etRegisterEmail = findViewById(R.id.edtregisteremail);
        etRegisterPassword = findViewById(R.id.edtregisterpassword);
        dbHelper = new DatabaseHelper(this);

        findViewById(R.id.btnregistersubmit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etRegisterEmail.getText().toString();
                String password = etRegisterPassword.getText().toString();

                // Lưu thông tin đăng ký vào cơ sở dữ liệu
                dbHelper.addUser(email, password);
                Toast.makeText(Register.this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}