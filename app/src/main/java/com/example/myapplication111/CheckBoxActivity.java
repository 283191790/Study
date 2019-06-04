package com.example.myapplication111;

import android.support.design.chip.ChipGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    private CheckBox Cb1;
    private CheckBox Cb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        Cb1 = findViewById(R.id.checkbox1);
        Cb2 = findViewById(R.id.checkbox2);
        Cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(CheckBoxActivity.this,isChecked?"鸡你太美":"1未选中",Toast.LENGTH_SHORT).show();
            }
        });
        Cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(CheckBoxActivity.this,isChecked?"2选中":"2未选中",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
