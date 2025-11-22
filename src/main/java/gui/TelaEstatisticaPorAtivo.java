package gui;

import controller.EstatisticasPorAtivoController;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import model.Operacao;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class TelaEstatisticaPorAtivo extends javax.swing.JInternalFrame {

    EstatisticasPorAtivoController c = new EstatisticasPorAtivoController();
    BigDecimal totalGain;
    BigDecimal totalLoss;
    BigDecimal saldo;
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
            .addGap(0, 809, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabelTitulo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 51, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Estatísticas Por Ativo");

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Ativo: ");

        jButtonBuscarEstatisticas.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonBuscarEstatisticas.setForeground(new java.awt.Color(51, 51, 51));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelTitulo)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextFieldAtivoDigitado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jButtonBuscarEstatisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(425, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButtonBuscarEstatisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarEstatisticasActionPerformed
        this.ativoDigitado = jTextFieldAtivoDigitado.getText();
        this.operacoesPorAtivo = c.consultarOperacoesController(ativoDigitado);
        totalGain = c.coletarOsGains();
        totalLoss = c.coletarOsLoss().abs();
        saldo = c.coletarOsSaldos();
        exibirGraficoEstatisticaAtivo();

    }//GEN-LAST:event_jButtonBuscarEstatisticasActionPerformed

    public void exibirGraficoEstatisticaAtivo() {

        //organizador de dados em valor,serie,categoria
        //DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        DefaultPieDataset organizacao = new DefaultPieDataset();  //criando   o organizador

        //passando dados pra o organizador
       // organizacao.setValue("Operações: ", operacoesPorAtivo.size());
        organizacao.setValue("Ganhos: ", totalGain);
        organizacao.setValue("Perdas: ", totalLoss);
        organizacao.setValue("Saldo: ", saldo);

        // criando o grafico em si, mas aqui ele ainda não esta completo. Se parece mais um esboço final
        JFreeChart desenho = ChartFactory.createPieChart("Resultados", organizacao, true, true, false);

        // Aqui o plot é o pintor e vai receber o esboço/grafico/desenho. Ele é o quadro e tem um pintor dentro que vai finalmente fazer o acabamento usando o quadro.
        PiePlot plotPintor = (PiePlot) desenho.getPlot();
        //  plotPintor.setInteriorGap(0.02);
        plotPintor.setLabelGenerator(new StandardPieSectionLabelGenerator("{0} {1}"));

        //Aqui o plot/pintor esta acabamento no grafico
        //plotPintor.setOutlinePaint( Color.BLACK);        
        //plotPintor.setSectionPaint("Operações: ", Color.BLACK);
        plotPintor.setSectionPaint("Ganhos: ", Color.GREEN);
        plotPintor.setSectionPaint("Perdas: ", Color.RED);
        plotPintor.setSectionPaint("Saldo: ", Color.BLUE);

        //defininfo outras configurações
        plotPintor.setBackgroundPaint(Color.WHITE);

        //passando pronto para o 'exibidor'/ lugar onde vai ser exibido
        ChartPanel chartPanel = new ChartPanel(desenho);
        chartPanel.setPreferredSize(jDesktopPane1.getSize());

        //Adicionando ao desktopPane para continuar na estrutura de telas criada por mim.
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
