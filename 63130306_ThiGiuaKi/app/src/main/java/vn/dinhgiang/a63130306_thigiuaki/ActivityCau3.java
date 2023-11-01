package vn.dinhgiang.a63130306_thigiuaki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ActivityCau3 extends AppCompatActivity {

        String[] foods = {"Burger", "Pizza", "Phở", "Pasta", "Steak", "Bún Bò", "Ice Cream"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau3);
        ListView listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, foods);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedFood = (String) parent.getItemAtPosition(position);
                Toast.makeText(ActivityCau3.this, selectedFood, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ActivityCau3.this, ActivityFood.class);
                 intent.putExtra("selectedFood", selectedFood);
                 startActivity(intent);
            }
        });
    }
}