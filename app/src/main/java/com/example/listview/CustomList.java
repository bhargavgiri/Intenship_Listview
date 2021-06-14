package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class CustomList extends AppCompatActivity {
   ListView listView;
   int image[]={R.drawable.mango,R.drawable.apple,R.drawable.banana1,R.drawable.graps,R.drawable.orange,R.drawable.mango,R.drawable.apple,R.drawable.banana1,R.drawable.graps,R.drawable.orange};
   String name[]={"Mango","Apple","Banana","Graps","Orange","Mango","Apple","Banana","Graps","Orange"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        listView=findViewById(R.id.clview);
        MyAdpter adpter=new MyAdpter(CustomList.this,image,name);
        listView.setAdapter(adpter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(CustomList.this, "This is"+" "+name[position], Toast.LENGTH_SHORT).show();

                Intent i=new Intent(CustomList.this,getImage.class);
                i.putExtra("Image",image[position]);
                i.putExtra("Name",name[position]);
                startActivity(i);
            }
        });
    }
}