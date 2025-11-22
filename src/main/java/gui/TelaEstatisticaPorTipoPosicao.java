package gui;

import controller.EstatisticaPorTipoPosicaoController;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JInternalFrame;
import model.Operacao;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class TelaEstatisticaPorTipoPosicao extends JInternalFrame {

    EstatisticaPorTipoPosicaoController c = new EstatisticaPorTipoPosicaoController();

    String escolha;
    public List<Operacao> operacoesFiltradas;
    BigDecimal totalGain;
    BigDecimal totalLoss;
    BigDecimal saldo;

    public TelaEstatisticaPorTipoPosicao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonTipoPosicao = new javax.swing.JButton();
        jComboBoxTipoPosicao = new javax.swing.JComboBox<>();
        jButtonEstatiticasPorTipoPosicao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );

        jLabelTitulo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 51, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Estatística Por Tipo Posição");

        jButtonTipoPosicao.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonTipoPosicao.setForeground(new java.awt.Color(51, 51, 51));
        jButtonTipoPosicao.setText("TIpoPosicao: ");

        jComboBoxTipoPosicao.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jComboBoxTipoPosicao.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxTipoPosicao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BUY", "SELL" }));

        jButtonEstatiticasPorTipoPosicao.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonEstatiticasPorTipoPosicao.setForeground(new java.awt.Color(51, 51, 51));
        jButtonEstatiticasPorTipoPosicao.setText("Buscar");
        jButtonEstatiticasPorTipoPosicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstatiticasPorTipoPosicaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 682, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonEstatiticasPorTipoPosicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonTipoPosicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxTipoPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(317, Short.MAX_VALUE)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTipoPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipoPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonEstatiticasPorTipoPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(297, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEstatiticasPorTipoPosicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstatiticasPorTipoPosicaoActionPerformed
        escolha = jComboBoxTipoPosicao.getSelectedItem().toString();
        this.operacoesFiltradas = c.buscarOperacaoPorTipoPosicaoController(escolha);
        totalGain = c.coletarOsGains();
        totalLoss = c.coletarOSLoss().abs();
        saldo = c.coletarSaldo();
        exibirGraficoEstatisticaTipoPosicao();
    }//GEN-LAST:event_jButtonEstatiticasPorTipoPosicaoActionPerformed

    public void exibirGraficoEstatisticaTipoPosicao() {

        DefaultPieDataset dados = new DefaultPieDataset();
        
        dados.setValue("Ganhos", totalGain);
        dados.setValue("Perdas", totalLoss);
        dados.setValue("Saldo", saldo);

        JFreeChart desenho = ChartFactory.createPieChart("Resultados", dados, true, true, false);

        PiePlot plot = (PiePlot) desenho.getPlot();
        plot.setSectionPaint("Ganhos", Color.GREEN);
        plot.setSectionPaint("Perdas", Color.RED);
        plot.setSectionPaint("Saldo", Color.BLUE);

        plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0} {1}"));
        plot.setBackgroundPaint(Color.WHITE);
        
        ChartPanel p = new ChartPanel(desenho);

          jDesktopPane1.setLayout(new java.awt.BorderLayout());
        jDesktopPane1.removeAll();
        jDesktopPane1.add(p);
        jDesktopPane1.revalidate();
        jDesktopPane1.repaint();
        
        /*
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(operacoesFiltradas.size(), "TOTAL OPERACOES", "Totalidades");
        dataset.addValue(totalGain, "GAIN", "Ganhos");
        dataset.addValue(totalLoss, "LOSS", "Perdas");
        dataset.addValue(saldo, "BALANCE", "Saldo");

        JFreeChart jfc = ChartFactory.createBarChart(
                "Estatísticas do Ativo",
                " ",
                "Estatística",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false
        );
        jfc.setBackgroundPaint(java.awt.Color.WHITE);
        jfc.getTitle().setFont(new Font("Arial Black", Font.BOLD, 30));
        jfc.getTitle().setPaint(Color.BLUE);

        CategoryPlot plot = jfc.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, Color.BLACK);
        renderer.setSeriesPaint(1, Color.GREEN);
        renderer.setSeriesPaint(2, Color.RED);
        renderer.setSeriesPaint(3, Color.BLUE);

        ChartPanel chartPanel = new ChartPanel(jfc);
        chartPanel.setSize(jDesktopPane1.getSize());
        //chartPanel.setPreferredSize(new Dimension(850, 650));
*/
      
    }

   /* public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaEstatisticaPorTipoPosicao().setVisible(true));
        }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEstatiticasPorTipoPosicao;
    private javax.swing.JButton jButtonTipoPosicao;
    private javax.swing.JComboBox<String> jComboBoxTipoPosicao;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
