package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class getImage extends AppCompatActivity {
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_image);
        imageView=findViewById(R.id.getimage);
        textView=findViewById(R.id.gettext);


        Intent intent=getIntent();
        int image1=intent.getIntExtra("Image",R.drawable.mango);

        imageView.setImageResource(image1);

        String name=intent.getStringExtra("Name");
        textView.setText(name);

    }
}