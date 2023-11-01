package vn.dinhgiang.a63130306_thigiuaki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        ImageView imageViewFood = findViewById(R.id.imageViewFood);
        TextView textViewFoodName = findViewById(R.id.textViewFoodName);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("selectedFood")) {
            String selectedFood = intent.getStringExtra("selectedFood");
             if (selectedFood.equals("Burger")) {
                 imageViewFood.setImageResource(R.drawable.buger);
             }
            if (selectedFood.equals("Pizza")) {
                imageViewFood.setImageResource(R.drawable.pizza);
            }
            if (selectedFood.equals("Phở")) {
                imageViewFood.setImageResource(R.drawable.pho);
            }
            if (selectedFood.equals("Pasta")) {
                imageViewFood.setImageResource(R.drawable.pasta);
            }
            if (selectedFood.equals("Steak")) {
                imageViewFood.setImageResource(R.drawable.steck);
            }
            if (selectedFood.equals("Bún Bò")) {
                imageViewFood.setImageResource(R.drawable.bunbo);
            }
            if (selectedFood.equals("Ice Cream")) {
                imageViewFood.setImageResource(R.drawable.kem);
            }
            textViewFoodName.setText(selectedFood);
        }
    }
}