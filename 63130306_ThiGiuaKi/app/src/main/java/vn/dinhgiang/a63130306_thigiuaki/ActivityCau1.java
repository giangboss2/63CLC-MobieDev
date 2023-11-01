package vn.dinhgiang.a63130306_thigiuaki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityCau1 extends AppCompatActivity {

    EditText edtA, edtB;
    TextView textViewKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau1);

        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        Button btnKetQua = findViewById(R.id.btnkq);
        textViewKetQua = findViewById(R.id.textViewKetQua);

        btnKetQua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!edtA.getText().toString().isEmpty() && !edtB.getText().toString().isEmpty()) {
                    int a = Integer.parseInt(edtA.getText().toString());
                    int b = Integer.parseInt(edtB.getText().toString());

                    int sum = a + b;
                    textViewKetQua.setText("Tổng hai số là: " + String.valueOf(sum));
                } else {
                    textViewKetQua.setText("Vui lòng nhập cả hai số A và B");
                }
            }
        });
        Button btnBack = findViewById(R.id.buttonback);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}