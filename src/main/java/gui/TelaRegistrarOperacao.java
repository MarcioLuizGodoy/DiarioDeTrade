package gui;

import controller.RegistrarOperacaoController;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import model.TipoOperacao;
import model.TipoPosicao;

public class TelaRegistrarOperacao extends JInternalFrame {
    public TelaRegistrarOperacao() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonPrecoEntrada = new javax.swing.JButton();
        jTextFieldPrecoEntrada = new javax.swing.JTextField();
        jButtonPrecoSaida = new javax.swing.JButton();
        jTextFieldPrecoSaida = new javax.swing.JTextField();
        jButtonQuantidadeContratos = new javax.swing.JButton();
        jTextFieldQuantidadeContratos = new javax.swing.JTextField();
        jComboBoxStatusOperacao = new javax.swing.JComboBox<>();
        jButtonStatusOperacao = new javax.swing.JButton();
        jButtonTipoPosicao = new javax.swing.JButton();
        jComboBoxTipoPosicao = new javax.swing.JComboBox<>();
        jButtonAtivo = new javax.swing.JButton();
        jTextFieldAtivo = new javax.swing.JTextField();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonImagemGraficoOperacao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonTipoOperacao = new javax.swing.JButton();
        jComboBoxTipoOperacao = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButtonEventoTecnicoBase = new javax.swing.JButton();
        jComboBoxEventoTecnicoBase = new javax.swing.JComboBox<>();
        jButtonAviso = new javax.swing.JButton();

        jButtonPrecoEntrada.setForeground(new java.awt.Color(0, 51, 255));
        jButtonPrecoEntrada.setText("Preço de entrada:");

        jButtonPrecoSaida.setForeground(new java.awt.Color(0, 51, 255));
        jButtonPrecoSaida.setText("Preço de saída:  ");

        jButtonQuantidadeContratos.setForeground(new java.awt.Color(0, 51, 255));
        jButtonQuantidadeContratos.setText("Qtd Contratos: ");

        jComboBoxStatusOperacao.setForeground(new java.awt.Color(0, 51, 255));
        jComboBoxStatusOperacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "GAIN", "LOSS", "BREAKEVEN", "" }));

        jButtonStatusOperacao.setForeground(new java.awt.Color(0, 51, 255));
        jButtonStatusOperacao.setText("Status operação:");

        jButtonTipoPosicao.setForeground(new java.awt.Color(0, 51, 255));
        jButtonTipoPosicao.setText("Tipo de posição:");

        jComboBoxTipoPosicao.setForeground(new java.awt.Color(0, 51, 255));
        jComboBoxTipoPosicao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "SELL", "BUY", "" }));

        jButtonAtivo.setForeground(new java.awt.Color(0, 51, 255));
        jButtonAtivo.setText("Ativo: ");

        jLabelTitulo.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 51, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Registrar Operação");
        jLabelTitulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jButtonImagemGraficoOperacao.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonImagemGraficoOperacao.setForeground(new java.awt.Color(0, 51, 255));
        jButtonImagemGraficoOperacao.setText("Registrar Imagem");
        jButtonImagemGraficoOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImagemGraficoOperacaoActionPerformed(evt);
            }
        });

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescricao);

        jButtonCadastrar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonCadastrar.setForeground(new java.awt.Color(0, 51, 255));
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonTipoOperacao.setForeground(new java.awt.Color(0, 51, 255));
        jButtonTipoOperacao.setText("Tipo de operação:");

        jComboBoxTipoOperacao.setForeground(new java.awt.Color(0, 51, 255));
        jComboBoxTipoOperacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "SWING TRADE", "DAY TRADE", "POSITION", "" }));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Descrição dos motivos que levaram a operação:");

        jButtonEventoTecnicoBase.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonEventoTecnicoBase.setForeground(new java.awt.Color(51, 51, 255));
        jButtonEventoTecnicoBase.setText("Evento Técnico Base: ");

        jComboBoxEventoTecnicoBase.setForeground(new java.awt.Color(0, 0, 255));
        jComboBoxEventoTecnicoBase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rompimento", "Regressao media movel" }));

        jButtonAviso.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAviso.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonAviso.setForeground(new java.awt.Color(51, 51, 51));
        jButtonAviso.setText("Atenção ao Registrar a sua Operação!!");
        jButtonAviso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jButtonImagemGraficoOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                .addComponent(jButtonAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(465, 465, 465))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonPrecoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldPrecoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonPrecoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldPrecoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonTipoOperacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxTipoOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonTipoPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxTipoPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonStatusOperacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxStatusOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonEventoTecnicoBase)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxEventoTecnicoBase, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jButtonAtivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonQuantidadeContratos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldQuantidadeContratos, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jButtonAtivo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jTextFieldAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonPrecoEntrada)
                            .addComponent(jTextFieldPrecoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonPrecoSaida)
                            .addComponent(jTextFieldPrecoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonQuantidadeContratos)
                            .addComponent(jTextFieldQuantidadeContratos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonTipoOperacao)
                            .addComponent(jComboBoxTipoOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonTipoPosicao)
                            .addComponent(jComboBoxTipoPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonStatusOperacao)
                            .addComponent(jComboBoxStatusOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEventoTecnicoBase)
                            .addComponent(jComboBoxEventoTecnicoBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAviso, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(jButtonImagemGraficoOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private  RegistrarOperacaoController c = new RegistrarOperacaoController();
    public  BufferedImage imgg ;

    
    
    
    private void limparCampos() {
    jTextFieldAtivo.setText("");
    jTextFieldPrecoEntrada.setText("");
    jTextFieldPrecoSaida.setText("");
    jTextFieldQuantidadeContratos.setText("");
    jComboBoxTipoOperacao.setSelectedIndex(0);
    jComboBoxTipoPosicao.setSelectedIndex(0);
    jComboBoxStatusOperacao.setSelectedIndex(0);
    jTextAreaDescricao.setText("");
    jButtonImagemGraficoOperacao.setText(null);
    jComboBoxEventoTecnicoBase.setSelectedIndex(0);
}

    
    
    
    
    
    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
    try {
        String ativo = jTextFieldAtivo.getText();
        Double precoEntrada = Double.valueOf(jTextFieldPrecoEntrada.getText());
        Double precoSaida = Double.valueOf(jTextFieldPrecoSaida.getText());
        Integer qtdContratos = Integer.valueOf(jTextFieldQuantidadeContratos.getText());
        String status = (String) jComboBoxStatusOperacao.getSelectedItem();
        String tipoOpStr = (String) jComboBoxTipoOperacao.getSelectedItem();
        String tipoPosStr = (String) jComboBoxTipoPosicao.getSelectedItem();
        TipoOperacao tipoOperacao = TipoOperacao.valueOf(tipoOpStr.replace(" ", "_").toUpperCase());
        TipoPosicao tipoPosicao = TipoPosicao.valueOf(tipoPosStr.toUpperCase());
        String descricao = jTextAreaDescricao.getText();
        String eventoTecnicoBase = (String)jComboBoxEventoTecnicoBase.getSelectedItem();
           
        c.receberDados(ativo, precoEntrada, precoSaida,
                   qtdContratos, tipoOperacao,tipoPosicao, status, imgg,descricao, eventoTecnicoBase);
                           //LA EM BAIXO A IMG É SETADA NO CONTROLLER E PASSADA PRA imgg. FACILITANDO REUTILIZACAO NO CADASTRAR IMAGEM


            if(c.salvarRegistroController() == true){
                limparCampos();
            }
    } catch (NumberFormatException e ) {
        JOptionPane.showMessageDialog(this, "Erro ao cadastrar: " + e.getMessage());
    }//GEN-LAST:event_jButtonCadastrarActionPerformed
}
    
    
    
    private void jButtonImagemGraficoOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImagemGraficoOperacaoActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Escolha a imagem que quer enviar!");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int resultado = chooser.showOpenDialog(this);
            if (resultado == JFileChooser.APPROVE_OPTION) {
                File arquivoSelecionado = chooser.getSelectedFile();
                    try {
                        BufferedImage imagemSelecionada = ImageIO.read(arquivoSelecionado);  
                        c.receberImagemTela(imagemSelecionada);   
                        imgg=c.getImagem();
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(this, "Erro ao carregar a imagem.");
                }
        }    }//GEN-LAST:event_jButtonImagemGraficoOperacaoActionPerformed
    
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtivo;
    private javax.swing.JButton jButtonAviso;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonEventoTecnicoBase;
    private javax.swing.JButton jButtonImagemGraficoOperacao;
    private javax.swing.JButton jButtonPrecoEntrada;
    private javax.swing.JButton jButtonPrecoSaida;
    private javax.swing.JButton jButtonQuantidadeContratos;
    private javax.swing.JButton jButtonStatusOperacao;
    private javax.swing.JButton jButtonTipoOperacao;
    private javax.swing.JButton jButtonTipoPosicao;
    private javax.swing.JComboBox<String> jComboBoxEventoTecnicoBase;
    private javax.swing.JComboBox<String> jComboBoxStatusOperacao;
    private javax.swing.JComboBox<String> jComboBoxTipoOperacao;
    private javax.swing.JComboBox<String> jComboBoxTipoPosicao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextFieldAtivo;
    private javax.swing.JTextField jTextFieldPrecoEntrada;
    private javax.swing.JTextField jTextFieldPrecoSaida;
    private javax.swing.JTextField jTextFieldQuantidadeContratos;
    // End of variables declaration//GEN-END:variables

    
   
  /* public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> new TelaMenu().setVisible(true));
    }
*/

}
