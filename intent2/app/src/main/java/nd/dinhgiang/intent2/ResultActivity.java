package nd.dinhgiang.intent2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultTextView = findViewById(R.id.resultTextView);

        // Lấy dữ liệu từ Intent
        Intent intent = getIntent();
        if (intent != null) {
            int numberA = intent.getIntExtra("numberA", 0);
            int numberB = intent.getIntExtra("numberB", 0);

            // Thực hiện tính toán
            int sum = numberA + numberB;

            // Hiển thị kết quả
            resultTextView.setText("Kết quả: " + sum);
        }
    }
}