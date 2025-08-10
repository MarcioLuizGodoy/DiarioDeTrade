
package gui;

import controller.EvolucaoCapitalController;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JInternalFrame;
import model.Operacao;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.netbeans.lib.awtextra.AbsoluteLayout;

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
            .addGap(0, 793, Short.MAX_VALUE)
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

    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    dataset.addValue(totalGain, "Ganhos", "GAIN");
    dataset.addValue(totalLoss, "Prejuízos", "LOSS");
    dataset.addValue(saldo, "Capital","SALDO");

    JFreeChart chart = ChartFactory.createBarChart(
    "Evolução do Capital", "Status Operacoes", "Valor",
    dataset, PlotOrientation.VERTICAL, false, true, false
    );

    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setPreferredSize(new Dimension(500, 200));

    getContentPane().removeAll();
    setLayout(new BorderLayout());
    add(chartPanel, BorderLayout.CENTER);
    revalidate();
    repaint();
}

    
            
       
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
