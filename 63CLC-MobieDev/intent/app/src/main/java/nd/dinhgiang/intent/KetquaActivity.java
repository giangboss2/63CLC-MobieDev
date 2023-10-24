package nd.dinhgiang.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

    public class KetquaActivity extends AppCompatActivity {
        TextView txt_nghiem;
        Button back;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_ketqua);
            // anh xa id
            txt_nghiem=findViewById(R.id.txt_nghiem);
            back=findViewById(R.id.btback);
            // nhan inrent;
            Intent myIntent= getIntent();
            // lay bundle
            Bundle myBundle= myIntent.getBundleExtra("mypakege");
            // lau du lieu khoi bundle;
            int a = myBundle.getInt("soa");
            int b = myBundle.getInt("sob");
            // tien hanh giai phuong trinh bac nhat:
            String nghiem= "";
            if(a==0 && b==0) {
                nghiem = " Phương trinh vo so nghiem:";
            }else if (a==0 && b!=0){
                nghiem= "phuong trinh vo nhiem";
            }else {
                nghiem = "nghiem phuong trinh bang: "+ (-1.0)*b/a;
            }
            txt_nghiem.setText(nghiem);
           back.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   finish();// thoat activity
               }
           });


        }
}