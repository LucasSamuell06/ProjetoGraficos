package com.example.graficos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GraficosLiberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graficos_liber);

    }

    public void proximo(View view){
        Intent in = new Intent(GraficosLiberActivity.this, LiberBarActivity.class);
        startActivity(in);
    }

    public void proximo1(View view){
        Intent in = new Intent(GraficosLiberActivity.this, LiberPizzaActivity.class);
        startActivity(in);
    }

    public void proximo2(View view){
        Intent in = new Intent(GraficosLiberActivity.this, LiberLineActivity.class);
        startActivity(in);
    }

    public void proximo3(View view){
        Intent in = new Intent(GraficosLiberActivity.this, LiberPieActivity.class);
        startActivity(in);
    }
}