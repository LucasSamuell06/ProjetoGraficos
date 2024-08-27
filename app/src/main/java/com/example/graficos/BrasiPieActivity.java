package com.example.graficos;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BrasiPieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brasi_pie);

        PieChart pieChart = findViewById(R.id.pieChart2);

        ArrayList<PieEntry> entiers = new ArrayList<>();
        entiers.add(new PieEntry(12,"Palmeiras"));
        entiers.add(new PieEntry(8,"Santos"));
        entiers.add(new PieEntry(8,"Flamengo"));
        entiers.add(new PieEntry(7,"Corinthias"));
        entiers.add(new PieEntry(6,"São Paulo"));
        entiers.add(new PieEntry(4,"Cruzeiro"));
        entiers.add(new PieEntry(4,"Vasco"));

        PieDataSet pieDataSet = new PieDataSet(entiers, "Campeões do Brasileirão");
        pieDataSet.setColors(ColorTemplate.MATERIAL_COLORS);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);

        pieChart.getDescription().setEnabled(false);
        pieChart.animateY(1000);
        pieChart.invalidate();

    }
}