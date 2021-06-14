package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class Grid extends AppCompatActivity {

    GridView gridView;
    String city[]={"Bhavnagar","Ahemdabad","Surat","Rajkot","Baroda","Mumbai","Delhi","Bangalore","Hyderabad","Bhavnagar","Ahemdabad","Surat","Rajkot","Baroda","Mumbai","Delhi","Bangalore","Hyderabad","Bhavnagar","Ahemdabad","Surat","Rajkot","Baroda","Mumbai","Delhi","Bangalore","Hyderabad"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        gridView=findViewById(R.id.gv);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,city);
        gridView.setAdapter(arrayAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Toast.makeText(Grid.this, "Your city"+" "+city[position], Toast.LENGTH_SHORT).show();
           }
       });
    }
}