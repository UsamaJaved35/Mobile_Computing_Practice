package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
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
        ArrayList<Student> list=new ArrayList<Student>();
        list.add(new Student("Usama","Lhr","1",R.drawable.ic_launcher_background));
        list.add(new Student("Usman","Lhr","2",R.drawable.ic_launcher_background));
        list.add(new Student("ahmad","skp","3",R.drawable.ic_launcher_background));
        list.add(new Student("osama","isb","4",R.drawable.ic_launcher_background));
        MyViewAdapter adapter = new MyViewAdapter(this, list);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}