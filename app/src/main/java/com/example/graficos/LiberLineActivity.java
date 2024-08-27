package com.example.graficos;

import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class LiberLineActivity extends AppCompatActivity {

    private LineChart lineChart;
    private List<String> xValues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liber_line);

        lineChart = findViewById(R.id.GraficoLiberLine);

        Description description = new Description();
        description.setText("Libertadores");
        description.setPosition(150f, 15f);
        lineChart.setDescription(description);
        lineChart.getAxisRight().setDrawLabels(false);

        xValues = Arrays.asList("Boca Juniors", "Penarol", "River Plate", "Estudiantes", "Flamengo", "PaLmeiras", "Santos");

        XAxis xAxis = lineChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setValueFormatter(new IndexAxisValueFormatter(xValues));
        xAxis.setLabelCount(7);
        xAxis.setGranularity(1f);

        YAxis yAxis = lineChart.getAxisLeft();
        yAxis.setAxisMinimum(0f);
        yAxis.setAxisMaximum(100f);
        yAxis.setAxisLineWidth(2f);
        yAxis.setAxisLineColor(Color.BLACK);
        yAxis.setLabelCount(10);

        List<Entry> entries1 = new ArrayList<>();
        entries1.add(new Entry(0, 10f));
        entries1.add(new Entry(1, 10f));
        entries1.add(new Entry(2, 15f));
        entries1.add(new Entry(3, 16f));
        entries1.add(new Entry(4, 17f));
        entries1.add(new Entry(5, 18f));
        entries1.add(new Entry(6, 19f));

        List<Entry> entries2 = new ArrayList<>();
        entries2.add(new Entry(0, 10f));
        entries2.add(new Entry(1, 10f));
        entries2.add(new Entry(2, 15f));
        entries2.add(new Entry(3, 12f));
        entries2.add(new Entry(4, 18f));
        entries2.add(new Entry(5, 14f));
        entries2.add(new Entry(6, 11f));

        LineDataSet dataSet = new LineDataSet(entries1, "math");
        dataSet.setColor(Color.BLUE);


    }
}