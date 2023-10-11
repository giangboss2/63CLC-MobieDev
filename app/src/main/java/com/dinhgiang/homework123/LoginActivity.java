package com.dinhgiang.homework123;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.dinhgiang.homework123.R;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextEmail, editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý logic đăng nhập ở đây
                // lấy được dữ liệu từ hai editext
                // b1.1 tìm điều khiển cần lấy dữ liệu
                EditText editText_UN = findViewById(R.id.editTextEmail);
                EditText editText_PW = findViewById(R.id.editTextPassword);
                //editText_UN laf biến đại diện cho edituser name ở file XML
                // b1.2 lấy dữ liệu về chưas user đã nhập vào điều khiển trên
                String tenDN= editText_UN.getText().toString();
                String mk= editText_PW.getText().toString();
                //b2 xử lí
                String ketqua;
                if(tenDN.equals("giangboss2@gmail.com") && mk.equals("giang123"))
                ketqua="dang nhap thanh cong";
                else ketqua ="dang nhap that bai";
                // b3 xem kết quả
                Toast.makeText(LoginActivity.this, ketqua, Toast.LENGTH_LONG).show();
            }
        });
    }
}
