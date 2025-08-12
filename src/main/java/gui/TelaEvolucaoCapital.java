
package gui;

import controller.EvolucaoCapitalController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import javax.swing.JInternalFrame;
import model.Operacao;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class TelaEvolucaoCapital extends JInternalFrame {
    
    EvolucaoCapitalController c = new EvolucaoCapitalController();
    Double totalGain;
    Double totalLoss;
    Double saldo;

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

        
    //O NETBEANS NÃO TEM SUPORTE PRA CRIAR TELA ARRASTANDO. POR ISSO, CRIAR A TELA EM UM METODO E DEPOIS JOGAR NO INIT COMPONENTS ´EMAI SFACIL.
    // NO METODO VC JÁ FAZ A LOGICA E INSERIR NO 
    public void exibirGraficoEvolucao() {
    List<Operacao> operacoes = c.consutarOperacoesController();
    totalGain = c.coletarOsGains();
    totalLoss = c.coletarOsLoss();
    saldo=c.coletarSaldoFinalCapital();

    DefaultPieDataset dataset = new DefaultPieDataset();
    dataset.setValue("GAIN", totalGain);
    dataset.setValue("LOSS", totalLoss);
    dataset.setValue("BALANCE", saldo);

    JFreeChart chart = ChartFactory.createPieChart(
    "Relatório Evolução de Capital", // título
    dataset,                     // seu DefaultPieDataset
    true,                       // legenda ativada
    true,                       // tooltips ativados
    false                       // URLs desativados
    );
    
    chart.getTitle().setPaint(new Color(0,51,255));
    chart.getTitle().setFont(new Font("Arial Black", Font.BOLD, 40));
    
    PiePlot plot = (PiePlot)chart.getPlot();
    plot.setSectionPaint("GAIN", Color.GREEN);
    plot.setSectionPaint("LOSS", Color.RED);
    plot.setSectionPaint("BALANCE", Color.BLUE);
    

    
    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setPreferredSize(new Dimension(500, 200));
    
    this.getContentPane().removeAll();
    this.setLayout(new BorderLayout());
    this.add(chartPanel, BorderLayout.CENTER);
    this.revalidate();
    this.repaint();
    }     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
