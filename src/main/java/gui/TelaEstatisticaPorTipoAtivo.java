
package gui;
import controller.EstatisticaPorTipoAtivoController;
import java.awt.Color;
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

public class TelaEstatisticaPorTipoAtivo extends javax.swing.JInternalFrame {
    String escolha;
    Double totalGain;
    Double totalLoss;
    Double saldo;
      
    List<Operacao> operacoes= new ArrayList<>();
    EstatisticaPorTipoAtivoController c = new EstatisticaPorTipoAtivoController();

    
    public TelaEstatisticaPorTipoAtivo() {
        initComponents();
        getRootPane().setDefaultButton(jButtonBuscarEstatisticaPorTipoAtivo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBoxTipoAtivo = new javax.swing.JComboBox<>();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButtonBuscarEstatisticaPorTipoAtivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 51, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Estatística Por Tipo Ativo");

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 255));
        jButton1.setText("Tipo Ativo:");

        jComboBoxTipoAtivo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jComboBoxTipoAtivo.setForeground(new java.awt.Color(0, 51, 255));
        jComboBoxTipoAtivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "WIN", "WDO", "ACOES", "" }));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 895, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        jButtonBuscarEstatisticaPorTipoAtivo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonBuscarEstatisticaPorTipoAtivo.setForeground(new java.awt.Color(0, 51, 255));
        jButtonBuscarEstatisticaPorTipoAtivo.setText("Buscar");
        jButtonBuscarEstatisticaPorTipoAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarEstatisticaPorTipoAtivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxTipoAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscarEstatisticaPorTipoAtivo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxTipoAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscarEstatisticaPorTipoAtivo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarEstatisticaPorTipoAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarEstatisticaPorTipoAtivoActionPerformed
            escolha = (String) jComboBoxTipoAtivo.getSelectedItem();
            c.receberEscolhaPorAtivoController(escolha);
            this.operacoes = c.buscarOperacaoPorTipoAtivoController();
            totalGain = c.coletarOsGains();
            totalLoss =  c.coletarOsLoss();
            saldo = c.coletarOsSaldos();
            exibirGraficoEstatisticaAtivo();
            System.out.println("Total operações   : " + this.operacoes.size());

    }//GEN-LAST:event_jButtonBuscarEstatisticaPorTipoAtivoActionPerformed

    
    public void exibirGraficoEstatisticaAtivo() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    

dataset.addValue(totalGain, "GAIN", "Ganhos");
dataset.addValue(totalLoss, "LOSS", "Perdas");
dataset.addValue(saldo, "BALANCE", "Saldo");
dataset.addValue(this.operacoes.size(), "TOTAL TRADEs", "totalidades");


    JFreeChart jfc = ChartFactory.createBarChart(
    "Estatísticas do Ativo",
    " ",
    "Estatisticas",
    dataset,
    PlotOrientation.VERTICAL,
    true, true, false
        );
    jfc.setBackgroundPaint(java.awt.Color.WHITE);
    jfc.getTitle().setFont(new Font("Arial Black", Font.BOLD,30));
    jfc.getTitle().setPaint(Color.BLUE);
    
    CategoryPlot plot = jfc.getCategoryPlot();
    BarRenderer renderer = (BarRenderer) plot.getRenderer();
    renderer.setSeriesPaint(0, Color.GREEN);
    renderer.setSeriesPaint(1, Color.RED);
    renderer.setSeriesPaint(2, Color.BLUE);
    renderer.setSeriesPaint(3,Color.BLACK);

    
    ChartPanel chartPanel = new ChartPanel(jfc);
    //chartPanel.setSize(jDesktopPane1.getSize());
   // chartPanel.setPreferredSize(new Dimension(350, 650));
   chartPanel.setPreferredSize(jDesktopPane1.getSize());


    jDesktopPane1.setLayout(new java.awt.BorderLayout());
    jDesktopPane1.removeAll();
    jDesktopPane1.add(chartPanel);
    jDesktopPane1.revalidate();
    jDesktopPane1.repaint();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBuscarEstatisticaPorTipoAtivo;
    private javax.swing.JComboBox<String> jComboBoxTipoAtivo;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables

   
}
