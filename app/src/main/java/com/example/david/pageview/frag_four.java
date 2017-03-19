package com.example.david.pageview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by DAVID on 3/19/2017.
 */

public class frag_four  extends Fragment {
    TextView textView;
    Button button;

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle instancesaved) {
        final View view = layoutInflater.inflate(R.layout.slide_four, container, false);

        return view;
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
       textView = (TextView)view.findViewById(R.id.textfour);
        button = (Button)view.findViewById(R.id.fourBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("BUUUU");
            }
        });
    }

}
