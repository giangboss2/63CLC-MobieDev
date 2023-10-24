package nd.dinhgiang.intent2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        final EditText editTextNumberA = findViewById(R.id.editTextNumberA);
        final EditText editTextNumberB = findViewById(R.id.editTextNumberB);
        Button calculateButton = findViewById(R.id.calculateButton);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy số từ EditText và chuyển sang dạng số nguyên
                int numberA = Integer.parseInt(editTextNumberA.getText().toString());
                int numberB = Integer.parseInt(editTextNumberB.getText().toString());

                // Tạo Intent để chuyển sang Activity thứ hai và đính kèm dữ liệu
                Intent intent = new Intent(InputActivity.this, ResultActivity.class);
                intent.putExtra("numberA", numberA);
                intent.putExtra("numberB", numberB);

                // Chuyển đến Activity thứ hai
                startActivity(intent);
            }
        });
    }
}