package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListView_demo extends AppCompatActivity {
    ListView listView;
    String city[]={"Bhavnagar","Ahemdabad","Surat","Rajkot","Baroda","Mumbai","Delhi","Bangalore","Hyderabad","Bhavnagar","Ahemdabad","Surat","Rajkot","Baroda","Mumbai","Delhi","Bangalore","Hyderabad","Bhavnagar","Ahemdabad","Surat","Rajkot","Baroda","Mumbai","Delhi","Bangalore","Hyderabad"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_demo);


        listView=findViewById(R.id.lv);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,city);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListView_demo.this, "Your city is"+" "+city[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}