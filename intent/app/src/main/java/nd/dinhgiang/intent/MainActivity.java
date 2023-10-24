package nd.dinhgiang.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class  MainActivity extends AppCompatActivity {
EditText edtA,edtB;
Button btnKQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // anh xa kq
        edtA=findViewById(R.id.edtA);
        edtB=findViewById(R.id.edtB);
        btnKQ=findViewById(R.id.btnkq);
        // xu li click
        btnKQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nyintent = new Intent(MainActivity.this,KetquaActivity.class);
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                // dong goi du lieu trong bundle
                Bundle myBundle = new Bundle();
                // dua du lieu vao bundle
                myBundle.putInt("soa:",a);
                myBundle.putInt("sob",b);
                // dua bundle vao intent
                nyintent.putExtra("mypakege",myBundle);
                // khoi dong
                startActivity(nyintent);
            }
        });

    }
}