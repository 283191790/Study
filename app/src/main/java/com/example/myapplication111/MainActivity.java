package com.example.myapplication111;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnenter;
    private Button btnbutton;
    private Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnenter = findViewById(R.id.btn_enter);
        btnbutton = findViewById(R.id.btn_button);
        btnlogin = findViewById(R.id.btn_login);
        setListeners();

        btnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"点击按钮",Toast.LENGTH_SHORT).show();
            }
        });


    }
    private void setListeners(){
        OnClick onClick = new OnClick();
        btnenter.setOnClickListener(onClick);
        btnlogin.setOnClickListener(onClick);


     }

    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_enter:
                    intent = new Intent(MainActivity.this,SecondActivity.class);
                    break;
                case R.id.btn_login:
                    intent = new Intent(MainActivity.this, LoginActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }




}
