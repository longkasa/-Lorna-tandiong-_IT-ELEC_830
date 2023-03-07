package com.example.loritanAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.helloandroid.R;

public class Listview extends AppCompatActivity {

    ListView listView;
    TextView textView;

    String[] listItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        listView=(ListView)findViewById(R.id.listView);
        listItem = getResources().getStringArray(R.array.Wood_List);

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.my_list, R.id.textView, listItem);
        listView.setAdapter(adapter);

    }
}