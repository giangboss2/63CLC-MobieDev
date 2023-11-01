package dinhgiang.fragment_giang;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
public class Fragment2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_2, container, false);
    }
    @Override
    public void onStart() {
        super.onStart();
        Button btnGetText = (Button)getActivity().findViewById(R.id.btnGetText); //---Button view---
        btnGetText.setOnClickListener(new View.OnClickListener() { //---Button click--
            public void onClick(View v) {
                TextView lbl = (TextView) getActivity().findViewById(R.id.lblFragment1);
                TextView statusarea = (TextView) getActivity().findViewById(R.id.lblStatus);
                statusarea.setText("Fragment#1's text shows: "+lbl.getText());
            }
        });
    }
}