package com.example.graficos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GraficosBrasileiraoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graficos_brasileirao);

    }

    public void proximo(View view){
        Intent in = new Intent(GraficosBrasileiraoActivity.this, BrasiBarActivity.class);
        startActivity(in);
    }

    public void proximo1(View view){
        Intent in = new Intent(GraficosBrasileiraoActivity.this, BrasiPizzaActivity.class);
        startActivity(in);
    }

    public void proximo2(View view){
        Intent in = new Intent(GraficosBrasileiraoActivity.this, BrasiLineActivity.class);
        startActivity(in);
    }

    public void proximo3(View view){
        Intent in = new Intent(GraficosBrasileiraoActivity.this, BrasiPieActivity.class);
        startActivity(in);
    }
}