package com.example.myapplication111;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapplication111.fragment.ContalnerActivity;
import com.example.myapplication111.recycleview.RecyclerviewActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnenter;
    private Button btnbutton;
    private Button btnlogin;
    private Button btnCheckbox;
    private Button btnImageView;
    private Button btnRecyclerView;
    private Button btnWebview;
    private Button btnToast;
    private Button btnFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnenter = findViewById(R.id.btn_enter);
        btnbutton = findViewById(R.id.btn_button);
        btnlogin = findViewById(R.id.btn_login);
        btnCheckbox = findViewById(R.id.btn_checkbox);
        btnImageView = findViewById(R.id.btn_imageview);
        btnRecyclerView = findViewById(R.id.btn_recyclerview);
        btnWebview = findViewById(R.id.btn_webview);
        btnToast = findViewById(R.id.btn_toast);
        btnFragment = findViewById(R.id.btn_fragment);
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
        btnCheckbox.setOnClickListener(onClick);
        btnImageView.setOnClickListener(onClick);
        btnRecyclerView.setOnClickListener(onClick);
        btnWebview.setOnClickListener(onClick);
        btnToast.setOnClickListener(onClick);
        btnFragment.setOnClickListener(onClick);


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
                case R.id.btn_checkbox:
                    intent = new Intent(MainActivity.this, CheckBoxActivity.class);
                    break;
                case R.id.btn_imageview:
                    intent = new Intent(MainActivity.this, ImageViewActivity.class);
                    break;
                case R.id.btn_recyclerview:
                    intent = new Intent(MainActivity.this,RecyclerviewActivity.class);
                    break;
                case R.id.btn_webview:
                    intent = new Intent(MainActivity.this,WebviewActivity.class);
                    break;
                case R.id.btn_toast:
                    intent = new Intent(MainActivity.this,ToastActivity.class);
                    break;
                case R.id.btn_fragment:
                    intent = new Intent(MainActivity.this, ContalnerActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }




}
