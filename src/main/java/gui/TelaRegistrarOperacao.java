package gui;

import controller.OperacaoController;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.JDialog;
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

        jButtonPrecoEntrada.setForeground(new java.awt.Color(0, 51, 255));
        jButtonPrecoEntrada.setText("Preço de entrada:");

        jButtonPrecoSaida.setForeground(new java.awt.Color(0, 51, 255));
        jButtonPrecoSaida.setText("Preço de saída:  ");

        jButtonQuantidadeContratos.setForeground(new java.awt.Color(0, 51, 255));
        jButtonQuantidadeContratos.setText("Qtd Contratos: ");

        jComboBoxStatusOperacao.setForeground(new java.awt.Color(0, 51, 255));
        jComboBoxStatusOperacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "GAIN", "LOSS", "BREAKEVEN" }));

        jButtonStatusOperacao.setForeground(new java.awt.Color(0, 51, 255));
        jButtonStatusOperacao.setText("Status Operação:");

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

        jButtonImagemGraficoOperacao.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonImagemGraficoOperacao.setForeground(new java.awt.Color(0, 51, 255));
        jButtonImagemGraficoOperacao.setText("Enviar imagem do grafico");
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
        jButtonTipoOperacao.setText("Tipo de Operação:");

        jComboBoxTipoOperacao.setForeground(new java.awt.Color(0, 51, 255));
        jComboBoxTipoOperacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "SWING TRADE", "DAY TRADE", "POSITION", "" }));

        jLabel1.setText("Descrição dos motivos que levaram a operação:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonPrecoEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonPrecoSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonQuantidadeContratos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonTipoPosicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonStatusOperacao)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jButtonAtivo))
                            .addComponent(jButtonTipoOperacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxTipoPosicao, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldPrecoSaida)
                            .addComponent(jTextFieldPrecoEntrada)
                            .addComponent(jTextFieldQuantidadeContratos)
                            .addComponent(jTextFieldAtivo)
                            .addComponent(jComboBoxTipoOperacao, 0, 148, Short.MAX_VALUE)
                            .addComponent(jComboBoxStatusOperacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(465, 465, 465)
                        .addComponent(jButtonImagemGraficoOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227)
                        .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAtivo)
                            .addComponent(jTextFieldAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonPrecoEntrada)
                            .addComponent(jTextFieldPrecoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonPrecoSaida)
                            .addComponent(jTextFieldPrecoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonQuantidadeContratos)
                            .addComponent(jTextFieldQuantidadeContratos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonTipoOperacao)
                            .addComponent(jComboBoxTipoOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonTipoPosicao)
                            .addComponent(jComboBoxTipoPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonStatusOperacao)
                            .addComponent(jComboBoxStatusOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonImagemGraficoOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addGap(36, 36, 36))
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

    
    
    private OperacaoController c = new OperacaoController();
    private BufferedImage imgg;
   
    private void jButtonImagemGraficoOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImagemGraficoOperacaoActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Escolha a imagem que quer enviar!");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int resultado = chooser.showOpenDialog(this);
        if(resultado == JFileChooser.APPROVE_OPTION){
        File arquivoSelecionado = chooser.getSelectedFile();  
        
        try{
            BufferedImage imagemSelecionada = ImageIO.read(arquivoSelecionado);
            imgg =  c.receberImagemTela(imagemSelecionada);
            
        }catch( IOException e){
            e.getMessage();
            }
            
        }
    }//GEN-LAST:event_jButtonImagemGraficoOperacaoActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
       
    OperacaoController controller = new OperacaoController();
    try {
        String ativo = jTextFieldAtivo.getText();
        Double precoEntrada = Double.valueOf(jTextFieldPrecoEntrada.getText());
        Double precoSaida = Double.parseDouble(jTextFieldPrecoSaida.getText());
        Integer qtdContratos = Integer.parseInt(jTextFieldQuantidadeContratos.getText());
        String status = (String) jComboBoxStatusOperacao.getSelectedItem();
        String tipoOpStr = (String) jComboBoxTipoOperacao.getSelectedItem();
        String tipoPosStr = (String) jComboBoxTipoPosicao.getSelectedItem();
        BufferedImage imagem = imgg; 

        TipoOperacao tipoOperacao = TipoOperacao.valueOf(tipoOpStr.replace(" ", "_").toUpperCase());
        TipoPosicao tipoPosicao = TipoPosicao.valueOf(tipoPosStr.toUpperCase());

        controller.receberDados(ativo, precoEntrada, precoSaida,
                                qtdContratos, tipoOperacao,
                                tipoPosicao, status, imagem
                                );
        try {
            if(controller.salvarRegistroController()){
                limparCampos();
            }
        } catch (SQLException ex) {
           ex.getMessage();
        } catch (IOException ex) {
             ex.getMessage();
        }
    } catch (NumberFormatException e ) {
        JOptionPane.showMessageDialog(this, "Erro ao cadastrar: " + e.getMessage());
    }//GEN-LAST:event_jButtonCadastrarActionPerformed
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtivo;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonImagemGraficoOperacao;
    private javax.swing.JButton jButtonPrecoEntrada;
    private javax.swing.JButton jButtonPrecoSaida;
    private javax.swing.JButton jButtonQuantidadeContratos;
    private javax.swing.JButton jButtonStatusOperacao;
    private javax.swing.JButton jButtonTipoOperacao;
    private javax.swing.JButton jButtonTipoPosicao;
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

    
    private void limparCampos() {
    jTextFieldAtivo.setText("");
    jTextFieldPrecoEntrada.setText("");
    jTextFieldPrecoSaida.setText("");
    jTextFieldQuantidadeContratos.setText("");
    jComboBoxTipoOperacao.setSelectedIndex(0);
    jComboBoxTipoPosicao.setSelectedIndex(0);
    jComboBoxStatusOperacao.setSelectedIndex(0);
    jTextAreaDescricao.setText("");
    imgg = null; // zera a imagem
}

}
