package gui;

import controller.EvolucaoCapitalController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JInternalFrame;
import model.Operacao;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.data.category.DefaultCategoryDataset;

public class TelaEvolucaoCapital extends JInternalFrame {

    EvolucaoCapitalController c = new EvolucaoCapitalController();
    //BigDecimal totalGain;
    //BigDecimal totalLoss;
    BigDecimal saldo;
    List<Operacao> operacoes = new ArrayList<>();

    public TelaEvolucaoCapital() {
        initComponents();
        exibirGraficoEvolucao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 786, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void exibirGraficoEvolucao() {
        this.operacoes = c.consutarOperacoesController();
        //totalGain = c.coletarOsGains();
       // totalLoss = c.coletarOsLoss().abs();
        saldo = c.coletarSaldoFinalCapital();

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(saldo, "Capital", " ");

        JFreeChart chart = ChartFactory.createBarChart("Evolução de Capital", "", "Capital Acumulado", dataset, PlotOrientation.VERTICAL, false, true, false);

        chart.getTitle().setPaint(Color.BLACK);
        chart.getTitle().setFont(new Font("Arial Black", Font.BOLD, 40));

        CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinePaint(Color.BLACK);

        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, Color.BLUE);
        renderer.setSeriesItemLabelsVisible(0, true);
        // renderer.setSeriesItemLabelGenerator(0, new StandardCategoryItemLabelGenerator());
        renderer.setSeriesItemLabelFont(0, new Font("Arial", Font.BOLD, 16));
        renderer.setSeriesItemLabelPaint(0, Color.BLACK);
        renderer.setBarPainter(new StandardBarPainter());
        renderer.setShadowVisible(true);
        renderer.setMaximumBarWidth(0.3);
        NumberAxis nA = (NumberAxis) plot.getRangeAxis();
        nA.setNumberFormatOverride(NumberFormat.getCurrencyInstance(Locale.US));

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(500, 300));

        this.getContentPane().removeAll();
        this.setLayout(new BorderLayout());
        this.add(chartPanel, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
