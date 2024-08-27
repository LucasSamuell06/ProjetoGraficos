package com.example.graficos;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BrasiBarActivity extends AppCompatActivity {

    private List<String> xvalues = Arrays.asList("Palmeiras", "Santos", "Flamengo", "Corinthias", "São Paulo", "Cruzeiro", "Vasco");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brasi_bar);

        BarChart barChart = findViewById(R.id.barChart2);
        barChart.getAxisRight().setDrawLabels(false);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(0,12f));
        entries.add(new BarEntry(1,8f));
        entries.add(new BarEntry(2,8f));
        entries.add(new BarEntry(3,7f));
        entries.add(new BarEntry(4,6f));
        entries.add(new BarEntry(5,4f));
        entries.add(new BarEntry(6,4f));


        YAxis yAxis = barChart.getAxisLeft();
        yAxis.setAxisMaximum(0f);
        yAxis.setAxisMaximum(20f);
        yAxis.setZeroLineWidth(2f);
        yAxis.setAxisLineColor(android.R.color.black);
        yAxis.setLabelCount(10);

        BarDataSet dataSet = new BarDataSet(entries,"Campeões do Brasileirão");
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);

        BarData barData = new BarData(dataSet);
        barChart.setData(barData);

        barChart.getDescription().setEnabled(false);
        barChart.invalidate();

        barChart.getXAxis().setValueFormatter(new IndexAxisValueFormatter(xvalues));
        barChart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        barChart.getXAxis().setGranularity(1f);
        barChart.getXAxis().setGranularityEnabled(true);

    }
}