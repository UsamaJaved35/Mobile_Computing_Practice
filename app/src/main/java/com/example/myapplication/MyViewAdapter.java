package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MyViewAdapter extends ArrayAdapter<Student> {


    public MyViewAdapter(@NonNull Context context, ArrayList<Student> studentArrayList) {
        super(context, 0, studentArrayList);
    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Student student = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.student_activity, parent, false);
        TextView textViewName =  convertView.findViewById(R.id.name);
        TextView textViewCampus = convertView.findViewById(R.id.campus);
        TextView textViewId = convertView.findViewById(R.id.Roll);
        ImageView imageView = convertView.findViewById(R.id.imageView);
        textViewName.setText(student.name);
        textViewCampus.setText(student.campus);
        textViewId.setText(student.rollNumber);
        imageView.setImageResource(student.imageID);
        return convertView;
    }
}
