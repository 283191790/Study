package com.example.myapplication111;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {

    private Button mBtnToast1,mBtnToast2,mBtnToast3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        mBtnToast1=findViewById(R.id.btn_toast_1);
        mBtnToast2=findViewById(R.id.btn_toast_2);
        mBtnToast3=findViewById(R.id.btn_toast_3);
        OnClick onClick = new OnClick();
        mBtnToast1.setOnClickListener(onClick);
        mBtnToast2.setOnClickListener(onClick);
        mBtnToast3.setOnClickListener(onClick);
    }

    class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btn_toast_1:
                    Toast.makeText(getApplicationContext(),"Toast",Toast.LENGTH_LONG).show();

                    break;
                case R.id.btn_toast_2:
                    break;
                case R.id.btn_toast_3:
                    break;
            }

        }

    }
}
