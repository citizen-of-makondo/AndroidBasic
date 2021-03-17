package com.example.androidbasic.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.androidbasic.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_texts_layout);
    }
}