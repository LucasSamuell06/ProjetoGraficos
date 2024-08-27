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

public class CopaPieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copa_pie);

        PieChart pieChart = findViewById(R.id.pieChart1);

        ArrayList<PieEntry> entiers = new ArrayList<>();
        entiers.add(new PieEntry(6,"Boca Juniors"));
        entiers.add(new PieEntry(5,"Penarol"));
        entiers.add(new PieEntry(4,"River Plate"));
        entiers.add(new PieEntry(4,"Estudiantes"));
        entiers.add(new PieEntry(3,"Flamengo"));
        entiers.add(new PieEntry(3,"Palmeiras"));
        entiers.add(new PieEntry(3,"Santos"));

        PieDataSet pieDataSet = new PieDataSet(entiers, "Campeões da Copa do Brasil");
        pieDataSet.setColors(ColorTemplate.MATERIAL_COLORS);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);

        pieChart.getDescription().setEnabled(false);
        pieChart.animateY(1000);
        pieChart.invalidate();

    }
}