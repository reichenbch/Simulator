/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulator;

/**
 *
 * @author RISHAV
 */
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class graphxy {
    static int[] ioA;
    static int iol=0;
    static String s="";
    public static JFreeChart chart;
    public graphxy(int ioArray[],int ioLength,String str)
    {
        iol = ioLength;
        ioA = new int[ioLength];
        ioA = ioArray;
        String[] args={"qwertyuiop"};
        s =str;
        
        main(args);
    }
    public static void main(String[] args) {
        boolean autoSort = false;
        boolean allowDuplicateXValues = false; 
        XYSeries series = new XYSeries("Head Differnce",autoSort,allowDuplicateXValues);
        for (int i = 0; i < iol; i++)
            series.add(i+1,ioA[i]);
        
        String chartTitle = "HEAD POINTER MOVEMENT";
        String xAxisLabel = "HEAD POINTER";
        String yAxisLabel = "HEAD POINTER DIFFERENCE";
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        chart = ChartFactory.createXYLineChart(chartTitle, xAxisLabel, yAxisLabel, dataset, PlotOrientation.VERTICAL, true, true, true);
        
        XYPlot plot = chart.getXYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.GREEN);
 
// sets thickness for series (using strokes)
        renderer.setSeriesStroke(0, new BasicStroke(4.0f));
        plot.setRenderer(renderer);
        
        plot.setOutlinePaint(Color.BLUE);
        plot.setOutlineStroke(new BasicStroke(2.0f));

        plot.setBackgroundPaint(Color.DARK_GRAY);
        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);
 
        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.BLACK);
        
        
        ChartPanel chartpanel = new ChartPanel(chart);
        chartpanel.setDomainZoomable(true);

        JPanel jPanel4 = new JPanel();
        jPanel4.setLayout(new BorderLayout());
        jPanel4.add(chartpanel, BorderLayout.NORTH);

        JFrame frame = new JFrame(s);
        frame.add(jPanel4);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(javax.swing.JFrame.HIDE_ON_CLOSE);
    }
}