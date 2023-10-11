package com.dinhgiang.homework123;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class Change_color extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_color);

        textView = findViewById(R.id.textView);
        Button changeSizeButton = findViewById(R.id.changeSizeButton);
        Button changeColorButton = findViewById(R.id.changeColorButton);

        changeSizeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Đổi kích thước chữ
                textView.setTextSize(32); // Ví dụ: đặt kích thước thành 32sp
            }
        });

        changeColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Đổi màu chữ
                textView.setTextColor(getResources().getColor(R.color.new_color)); // Ví dụ: đặt màu mới từ resource
            }
        });
    }
}
