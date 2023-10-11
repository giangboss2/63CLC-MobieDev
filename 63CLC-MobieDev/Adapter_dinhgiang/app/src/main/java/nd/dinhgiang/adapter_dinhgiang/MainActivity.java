package nd.dinhgiang.adapter_dinhgiang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView auTV;
    ArrayList<String> COUNTRIES = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auTV = findViewById(R.id.autocompletetv);
        COUNTRIES.add("vietnam");
        COUNTRIES.add("Austrian");
        COUNTRIES.add("thailan");
        COUNTRIES.add("lao");
        COUNTRIES.add("china");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, COUNTRIES);
        auTV.setAdapter(adapter);
    }


}