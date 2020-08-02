package com.example.linechartapp;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LineChart lineChart;

    ArrayList<Entry> yAxes = new ArrayList<>();
    ArrayList<ILineDataSet> lineDataSets = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lineChart = (LineChart)findViewById(R.id.lineChart);

        yAxes.add(new Entry(10,0));
        yAxes.add(new Entry(20,3));
        yAxes.add(new Entry(30,2));
        yAxes.add(new Entry(40,5));
        yAxes.add(new Entry(50,3));
        yAxes.add(new Entry(60,1));
        yAxes.add(new Entry(70,6));


        LineDataSet lineDataSet = new LineDataSet(yAxes,"values");
        lineDataSet.setDrawCircles(true);
        lineDataSet.setColor(Color.RED);
        lineDataSet.setLineWidth(2);
        lineDataSet.setFillColor(Color.MAGENTA);
        lineDataSet.setDrawFilled(true);
        lineDataSets.add(lineDataSet);

        lineChart.setData(new LineData(lineDataSets));

        lineChart.setVisibleXRangeMaximum(65f);
        lineChart.setTouchEnabled(true);
        lineChart.setDragEnabled(true);
        lineChart.setGridBackgroundColor(Color.CYAN);
    }
}