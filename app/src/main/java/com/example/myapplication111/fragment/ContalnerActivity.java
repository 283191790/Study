package com.example.myapplication111.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication111.R;

public class ContalnerActivity extends AppCompatActivity {

    private AFragment aFragment;
    private BFragment bFragment;
    private Button mbtnChange;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contalner);

        mbtnChange = findViewById(R.id.btn_change);
        mbtnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bFragment==null){
                    bFragment = new BFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_contalner,bFragment).commitAllowingStateLoss();
            }
        });

        aFragment = new AFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.fl_contalner,aFragment).commitAllowingStateLoss();
    }
}
