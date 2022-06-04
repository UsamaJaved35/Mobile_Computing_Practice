package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        editText=findViewById(R.id.editText);
        ArrayList<String> studentlist=new ArrayList<String>();
        studentlist.add("usama");
        studentlist.add("osama");
        studentlist.add("ahmad");
        studentlist.add("kaka");
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,studentlist );
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                editText.setText("You selected " + studentlist.get(i));
            }
        });
    }
}