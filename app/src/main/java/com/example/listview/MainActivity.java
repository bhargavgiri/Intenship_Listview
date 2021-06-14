package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button listview,webview,Vscrollview,Hscrollview,gridview,customlistview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview=findViewById(R.id.listview);
        webview=findViewById(R.id.webview);
        Vscrollview=findViewById(R.id.Vscroll);
        Hscrollview=findViewById(R.id.Hscroll);
        gridview=findViewById(R.id.grid);
        customlistview=findViewById(R.id.cListview);

        listview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,ListView_demo.class);
                startActivity(i);
            }
        });

        webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Web.class);
                startActivity(intent);
            }
        });
        Vscrollview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ScrollView.class);
                startActivity(intent);
            }
        });

        Hscrollview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Horizontal_scrollview.class);
                startActivity(intent);
            }
        });

        gridview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Grid.class);
                startActivity(intent);
            }
        });

        customlistview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CustomList.class);
                startActivity(intent);
            }
        });
    }
}