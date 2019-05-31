package com.example.myapplication111;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {
    private ImageView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        pic = findViewById(R.id.image);
        Glide.with(this).load("https://pics3.baidu.com/feed/5366d0160924ab18d4faadf7094601c979890b46.jpeg?token=8e3e100d923314f243fc36fd8a6585ac&s=F53683747C496B5F8E8C63A10300F086").into(pic);


    }
}
