package com.view.test.libary_view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import com.rey.material.widget.RadioButton;

public class MaterialViewTestActivity extends AppCompatActivity {
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materialview);
        rb1 = (RadioButton)findViewById(R.id.switches_rb1);
        rb2 = (RadioButton)findViewById(R.id.switches_rb2);
        rb3 = (RadioButton)findViewById(R.id.switches_rb3);

        CompoundButton.OnCheckedChangeListener listener = new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    rb1.setChecked(rb1 == buttonView);
                    rb2.setChecked(rb2 == buttonView);
                    rb3.setChecked(rb3 == buttonView);
                }

            }

        };

        rb1.setOnCheckedChangeListener(listener);
        rb2.setOnCheckedChangeListener(listener);
        rb3.setOnCheckedChangeListener(listener);

    }
}
