package gui;

import controller.EstatisticaPorTipoOperacaoController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import model.Operacao;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;


public class TelaEstatisticaPorTipoOperacao extends javax.swing.JInternalFrame {
    
        BigDecimal totalGain;
        BigDecimal totalLoss;
        BigDecimal saldo;    
        String escolha;
        EstatisticaPorTipoOperacaoController c = new EstatisticaPorTipoOperacaoController();
        List<Operacao> operacoesFiltradasDevolvidas = new ArrayList<>();
    
    
    
    public TelaEstatisticaPorTipoOperacao() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabelTitulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBoxTipoOperacao = new javax.swing.JComboBox<>();
        jButtonBuscarEstatisticaPorTipoOperacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 757, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        jLabelTitulo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 51, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Estatística Por Tipo Operacao");

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 255));
        jButton1.setText("Tipo Operacao: ");

        jComboBoxTipoOperacao.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jComboBoxTipoOperacao.setForeground(new java.awt.Color(0, 51, 255));
        jComboBoxTipoOperacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DAY_TRADE", "SWING_TRADE", "POSITION", "" }));

        jButtonBuscarEstatisticaPorTipoOperacao.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonBuscarEstatisticaPorTipoOperacao.setForeground(new java.awt.Color(0, 51, 255));
        jButtonBuscarEstatisticaPorTipoOperacao.setText("Buscar");
        jButtonBuscarEstatisticaPorTipoOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarEstatisticaPorTipoOperacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBuscarEstatisticaPorTipoOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxTipoOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(799, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 394, Short.MAX_VALUE)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jComboBoxTipoOperacao))
                .addGap(18, 18, 18)
                .addComponent(jButtonBuscarEstatisticaPorTipoOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(392, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jDesktopPane1)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarEstatisticaPorTipoOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarEstatisticaPorTipoOperacaoActionPerformed
            escolha = (String) jComboBoxTipoOperacao.getSelectedItem();
            operacoesFiltradasDevolvidas =  c.consultarOperacoesTipoOperacao(escolha);
            totalGain = c.coletarOsGains();
            totalLoss =  c.coletarOsLoss();
            saldo = c.coletarOsSaldos();
            exibirGraficoEstatisticaTipoOperacao();
    }//GEN-LAST:event_jButtonBuscarEstatisticaPorTipoOperacaoActionPerformed

    
    public void exibirGraficoEstatisticaTipoOperacao() {
       DefaultCategoryDataset dataset = new DefaultCategoryDataset();


        dataset.addValue(operacoesFiltradasDevolvidas.size(), "TOTAL OPERACOES", "Totalidades");
        dataset.addValue(totalGain, "GAIN", "Ganhos");
        dataset.addValue(totalLoss, "LOSS", "Perdas");
        dataset.addValue(saldo, "BALANCE", "Saldos");

       JFreeChart jfc = ChartFactory.createBarChart(
       "Estatísticas do Ativo",
       " ",
       "Estatística",
       dataset,
       PlotOrientation.VERTICAL,
       true, true, true
           );
       jfc.setBackgroundPaint(java.awt.Color.WHITE);
       jfc.getTitle().setFont(new Font("Arial Black", Font.BOLD,30));
       jfc.getTitle().setPaint(Color.BLUE);

       CategoryPlot plot = jfc.getCategoryPlot();
       BarRenderer renderer = (BarRenderer) plot.getRenderer();
       renderer.setSeriesPaint(0, Color.BLACK);
       renderer.setSeriesPaint(1, Color.GREEN);
       renderer.setSeriesPaint(2, Color.RED);
       renderer.setSeriesPaint(3, Color.BLUE);


       ChartPanel chartPanel = new ChartPanel(jfc);
       //chartPanel.setSize(jDesktopPane1.getSize());
       chartPanel.setPreferredSize(new Dimension(850, 650));

       jDesktopPane1.setLayout(new java.awt.BorderLayout());
       jDesktopPane1.removeAll();
       jDesktopPane1.add(chartPanel);
       jDesktopPane1.revalidate();
       jDesktopPane1.repaint();
       }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBuscarEstatisticaPorTipoOperacao;
    private javax.swing.JComboBox<String> jComboBoxTipoOperacao;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
