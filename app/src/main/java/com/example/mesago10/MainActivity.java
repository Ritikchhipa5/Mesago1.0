package com.example.mesago10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton dot;
        dot = (ImageButton)findViewById(R.id.dot);


        //List VIew and give data
        ListView listView =(ListView)findViewById(R.id.list_view) ;
        ArrayList<DataStore> dataStores = new ArrayList<>();

        for(int i=0;i<10;i++){
            dataStores.add(new DataStore("Ritik Chhipa","123456789",R.drawable.face_icon));
        }


        CustomList adapter = new CustomList(MainActivity.this,dataStores);
        listView.setAdapter(adapter);

    }

}
