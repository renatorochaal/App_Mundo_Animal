package com.example.app2009;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void inicioCalango(View v)
    {
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }

    public void anteriorCalango(View v)
    {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}