
package gui;

import controller.EvolucaoCapitalController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JInternalFrame;
import model.Operacao;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class TelaEvolucaoCapital extends JInternalFrame {
    
    EvolucaoCapitalController c = new EvolucaoCapitalController();
    BigDecimal totalGain;
    BigDecimal totalLoss;
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

        
    //O NETBEANS NÃO TEM SUPORTE PRA CRIAR TELA ARRASTANDO. POR ISSO, CRIAR A TELA EM UM METODO E DEPOIS JOGAR NO INIT COMPONENTS ´EMAI SFACIL.
    // NO METODO VC JÁ FAZ A LOGICA E INSERIR NO 
   public void exibirGraficoEvolucao() {
 this.operacoes = c.consutarOperacoesController();
    totalGain = c.coletarOsGains();
    totalLoss = c.coletarOsLoss();
    saldo = c.coletarSaldoFinalCapital();

    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    dataset.addValue(totalGain, "GAIN", "GAIN");
    dataset.addValue(totalLoss, "LOSS", "LOSS");
    dataset.addValue(saldo, "BALANCE", "BALANCE");
    dataset.addValue(this.operacoes.size(),"TOTAL OPERACOES", "totallidades");
    JFreeChart chart = ChartFactory.createBarChart(
        "Relatório Evolução de Capital", // título
        "Categoria",                     // eixo X
        "Valor",                        // eixo Y
        dataset,
        PlotOrientation.VERTICAL,
        true,  // legenda
        true,  // tooltips
        false  // URLs
    );

    chart.getTitle().setPaint(new Color(0, 51, 255));
    chart.getTitle().setFont(new Font("Arial Black", Font.BOLD, 40));

    CategoryPlot plot = chart.getCategoryPlot();
    BarRenderer renderer = (BarRenderer) plot.getRenderer();

    renderer.setSeriesPaint(0, Color.GREEN); // GAIN em verde
    renderer.setSeriesPaint(1, Color.RED);   // LOSS em vermelho
    renderer.setSeriesPaint(2, Color.BLUE);  // BALANCE em azul
    renderer.setSeriesPaint(3,Color.BLACK);

    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setPreferredSize(new Dimension(500, 300)); // Pode ajustar a altura

    this.getContentPane().removeAll();
    this.setLayout(new BorderLayout());
    this.add(chartPanel, BorderLayout.CENTER);
    this.revalidate();
    this.repaint();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
