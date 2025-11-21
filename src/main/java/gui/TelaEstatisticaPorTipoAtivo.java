package gui;

import controller.EstatisticaPorTipoAtivoController;
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

public class TelaEstatisticaPorTipoAtivo extends javax.swing.JInternalFrame {

    String escolha;
    BigDecimal totalGain;
    BigDecimal totalLoss;
    BigDecimal saldo;
    List<Operacao> operacoes = new ArrayList<>();

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
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
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
        jButtonBuscarEstatisticaPorTipoAtivo.setForeground(new java.awt.Color(51, 51, 51));
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
        totalLoss = c.coletarOsLoss().abs();
        saldo = c.coletarOsSaldos();
        //BigDecimal totalOperacoes = new BigDecimal(String.valueOf(operacoes.size()));

        exibirGraficoEstatisticaAtivo();
    }//GEN-LAST:event_jButtonBuscarEstatisticaPorTipoAtivoActionPerformed

    public void exibirGraficoEstatisticaAtivo() {

        //organizador de dados em valor,serie,categoria
        //DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        DefaultPieDataset organizacao = new DefaultPieDataset();  //criando   o organizador

        //passando dados pra o organizador
        organizacao.setValue("Operações: ", operacoes.size());
        organizacao.setValue("Ganhos: " , totalGain);
        organizacao.setValue("Perdas: " , totalLoss);
        organizacao.setValue("Saldo: " , saldo);

        // criando o grafico em si, mas aqui ele ainda não esta completo. Se parece mais um esboço final
        JFreeChart desenho = ChartFactory.createPieChart("Resultados", organizacao, true, true, false);

        
        // Aqui o plot é o pintor e vai receber o esboço/grafico/desenho. Ele é o quadro e tem um pintor dentro que vai finalmente fazer o acabamento usando o quadro.
        PiePlot plotPintor = (PiePlot) desenho.getPlot();
        plotPintor.setLabelGenerator(new StandardPieSectionLabelGenerator("{0} {1}"));
        
        //Aqui o plot/pintor esta acabamento no grafico
        plotPintor.setOutlinePaint( Color.BLACK);        
        plotPintor.setSectionPaint("Operações: " , Color.BLACK);
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
    private javax.swing.JButton jButtonBuscarEstatisticaPorTipoAtivo;
    private javax.swing.JComboBox<String> jComboBoxTipoAtivo;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables

    
    
    
    
    
    
      //DAQUI PARA BAIXO FOI O GRAFICO ANTERIOR QUE EU ESTAVA TENDO PROBLEMA DE ESCALA. DEIXEI PRA DEPOIS ESTUDAR OUTRAS QUESTOES

        //aqui ele recebe os dados no formato que ele entende
        /* dataset.addValue(new BigDecimal(operacoes.size()), "Total de Operações", "Trades Feitos: " + operacoes.size());
        dataset.addValue(totalGain, "Ganhos Financeiro Totais", " Ganhos   : " + totalGain);
        dataset.addValue(totalLoss, "Perdas Financeiras Totais", "Perdas: " + totalLoss);
        dataset.addValue(saldo, "Saldo", "Saldo Final: " + saldo);
         */
        //AQUI SERIE O DESENHO DO GRAFICO PRONTO PRA SER PINTADO.
        //JFreeChart jfc = ChartFactory.createPChart("Estatísticas do Ativo", " Series", "Valores", dataset, PlotOrientation.VERTICAL, true, true, true);
        // toda a treta da composição começa aqui, quando decidimos o tipo de grafico que usaremos.
        //O CATEGORYPLOT É RESPONSAVEL POR GERENCIAR A AREA EM QUE O GRAFICO VAI SER PINTADO. TIPO O QUADRO.
        //jfc.setBackgroundPaint(java.awt.Color.WHITE);
        // jfc.getTitle().setFont(new Font("Arial Black", Font.BOLD, 30));
        // jfc.getTitle().setPaint(Color.BLUE);
        // ele vai passar/informar/usar/pegar para o seu plot  ( composição de objetos)
        //CategoryPlot plot = jfc.getCategoryPlot();
        //CategoryItemRenderer renderer = plot.getRenderer(); // outra composição, o plot contem o render dentro dele
        // Outra forma de fazer:   CategoryItemRenderer renderer = (BarRenderer) plot.getRenderer();
        //renderer.setSeriesPaint(0, new Color(0, 0, 0)); // RGB puro, preto absoluto
        //renderer.setSeriesPaint(1, Color.GREEN.darker());
        // renderer.setSeriesPaint(2, Color.RED);
        // renderer.setSeriesPaint(3, Color.BLUE);
/*
        ChartPanel chartPanel = new ChartPanel(jfcP);
        chartPanel.setPreferredSize(jDesktopPane1.getSize());

        jDesktopPane1.setLayout(new java.awt.BorderLayout());
        jDesktopPane1.removeAll();
        jDesktopPane1.add(chartPanel);
        jDesktopPane1.revalidate();
        jDesktopPane1.repaint();
       
         */
    

    //BarRenderer renderer = new BarRenderer();
}
