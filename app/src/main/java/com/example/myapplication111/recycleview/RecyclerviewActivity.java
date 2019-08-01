package com.example.myapplication111.recycleview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication111.R;

public class RecyclerviewActivity extends AppCompatActivity {

    private Button mBtnLinear,mBtnHor,mBtnGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        mBtnLinear = findViewById(R.id.btn_linear);
        mBtnHor = findViewById(R.id.btn_hor);
        mBtnGrid = findViewById(R.id.btn_grid);
        mBtnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecyclerviewActivity.this,LinearRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnHor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecyclerviewActivity.this,HorRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecyclerviewActivity.this,GridRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
