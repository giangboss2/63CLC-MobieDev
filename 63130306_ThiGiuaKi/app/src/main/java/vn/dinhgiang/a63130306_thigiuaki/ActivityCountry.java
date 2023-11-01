package vn.dinhgiang.a63130306_thigiuaki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityCountry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_country);
        TextView textViewCountry = findViewById(R.id.textViewCountry);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("selectedCountry")) {
            String country = intent.getStringExtra("selectedCountry");
            textViewCountry.setText(country);
        }
    }
}