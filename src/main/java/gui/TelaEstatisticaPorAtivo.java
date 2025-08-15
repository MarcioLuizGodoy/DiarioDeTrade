package gui;
import controller.EstatisticasPorAtivoController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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

public class TelaEstatisticaPorAtivo extends javax.swing.JInternalFrame {
    
    EstatisticasPorAtivoController c = new EstatisticasPorAtivoController();
    Double totalGain;
    Double totalLoss;
    Double saldo;
    String ativoDigitado;
    List<Operacao> operacoesPorAtivo = new ArrayList<>();
    
    public TelaEstatisticaPorAtivo() {
        initComponents();
            getRootPane().setDefaultButton(jButtonBuscarEstatisticas);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabelTitulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextFieldAtivoDigitado = new javax.swing.JTextField();
        jButtonBuscarEstatisticas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );

        jLabelTitulo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 51, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Estatísticas Por Ativo");

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 255));
        jButton1.setText("Ativo: ");

        jButtonBuscarEstatisticas.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonBuscarEstatisticas.setForeground(new java.awt.Color(0, 51, 255));
        jButtonBuscarEstatisticas.setText("Buscar");
        jButtonBuscarEstatisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarEstatisticasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBuscarEstatisticas)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAtivoDigitado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jTextFieldAtivoDigitado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jButtonBuscarEstatisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButtonBuscarEstatisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarEstatisticasActionPerformed
            this.ativoDigitado = jTextFieldAtivoDigitado.getText();
            this.operacoesPorAtivo = c.consultarOperacoesController(ativoDigitado);
            totalGain = c.coletarOsGains();
            totalLoss = c.coletarOsLoss();
            saldo = c.coletarOsSaldos();
            exibirGraficoEstatisticaAtivo();

    }//GEN-LAST:event_jButtonBuscarEstatisticasActionPerformed

 

public void exibirGraficoEstatisticaAtivo() {
    
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    
    dataset.addValue(operacoesPorAtivo.size(), "TOTAL OPERACOES", "TOTAL OPERACOES");
    dataset.addValue(totalGain, "GAIN", "GAIN");
    dataset.addValue(totalLoss,"LOSS" , "LOSS");
    dataset.addValue(saldo, "BALANCE", "BALANCE");

    JFreeChart jfc = ChartFactory.createBarChart(
    "Estatísticas do Ativo",
    " ",
    "Estatística",
    dataset,
    PlotOrientation.VERTICAL,
    true, true, false
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
    chartPanel.setPreferredSize(new Dimension(870, 650));

    jDesktopPane1.setLayout(new java.awt.BorderLayout());
    jDesktopPane1.removeAll();
    jDesktopPane1.add(chartPanel);
    jDesktopPane1.revalidate();
    jDesktopPane1.repaint();
}


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBuscarEstatisticas;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldAtivoDigitado;
    // End of variables declaration//GEN-END:variables
}
