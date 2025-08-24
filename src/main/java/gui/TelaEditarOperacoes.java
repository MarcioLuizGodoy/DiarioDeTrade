
package gui;

import controller.EditarOperacoesController;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;
import model.Operacao;

public class TelaEditarOperacoes extends JInternalFrame {
 
      List<Operacao> listaopercoes;
      Object valorId ;
      int linhaSelecionada;
      int colunas;
      EditarOperacoesController controller = new EditarOperacoesController();

    public TelaEditarOperacoes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabelaOperacoesEDITAROPERACOES = new javax.swing.JTable();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonbuscarOperacoes = new javax.swing.JButton();
        jButtonSalvarEdicao1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonTipoAtivo = new javax.swing.JButton();
        jComboBoxTipoAtivo = new javax.swing.JComboBox<>();
        jButtonAtivo = new javax.swing.JButton();
        jTextFieldAtivo = new javax.swing.JTextField();
        jButtonPrecoEntrada = new javax.swing.JButton();
        jTextFieldPrecoEntrada = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBoxEventoTecnicoBase = new javax.swing.JComboBox<>();
        jComboBoxStatusOperacao = new javax.swing.JComboBox<>();
        jComboBoxTipoPosicao = new javax.swing.JComboBox<>();
        jComboBoxTipoOperacao = new javax.swing.JComboBox<>();
        jTextFieldQuantidadeContratos = new javax.swing.JTextField();
        jButtonImagemGraficoOperacao = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableTabelaOperacoesEDITAROPERACOES.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTableTabelaOperacoesEDITAROPERACOES.setForeground(new java.awt.Color(0, 51, 204));
        jTableTabelaOperacoesEDITAROPERACOES.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "TipoAtivo", "Ativo", "Preco Entrada", "Preco Saida", "Qtd Contratos", "Tipo Operação", "Tipo Posição", "Status  Operação", "Img Grafico", "Data Hora", "Evento Tec. Base"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTabelaOperacoesEDITAROPERACOES.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jTableTabelaOperacoesEDITAROPERACOES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTabelaOperacoesEventoDuploClique(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTabelaOperacoesEDITAROPERACOES);

        jLabelTitulo.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 51, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Editar Operações");
        jLabelTitulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jButtonbuscarOperacoes.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonbuscarOperacoes.setForeground(new java.awt.Color(0, 51, 255));
        jButtonbuscarOperacoes.setText("Buscar");
        jButtonbuscarOperacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarOperacoes(evt);
            }
        });

        jButtonSalvarEdicao1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonSalvarEdicao1.setForeground(new java.awt.Color(0, 51, 255));
        jButtonSalvarEdicao1.setText("Editar e Salvar");
        jButtonSalvarEdicao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarSalvarOperacao(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 153, 51));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("#Insira os valores abaixo para Editar e Salvar#");

        jButtonTipoAtivo.setForeground(new java.awt.Color(0, 51, 255));
        jButtonTipoAtivo.setText("Tipo Ativo");

        jComboBoxTipoAtivo.setForeground(new java.awt.Color(0, 51, 255));
        jComboBoxTipoAtivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "WIN", "WDO", "ACOES", "Item 4" }));

        jButtonAtivo.setForeground(new java.awt.Color(0, 51, 255));
        jButtonAtivo.setText("Ativo: ");

        jButtonPrecoEntrada.setForeground(new java.awt.Color(0, 51, 255));
        jButtonPrecoEntrada.setText("Preço Entrada:");
        jButtonPrecoEntrada.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jButton1.setText("Preco Saida:");

        jButton2.setText("Qtd Contratos:");

        jButton3.setText("Tipo Operacao:");

        jButton4.setText("Tipo Posicao:");

        jButton5.setText("Status Operacao:");

        jButton6.setText("Evento Tecnico:");

        jComboBoxEventoTecnicoBase.setForeground(new java.awt.Color(0, 0, 255));
        jComboBoxEventoTecnicoBase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Rompimento", "Regressao media movel" }));

        jComboBoxStatusOperacao.setForeground(new java.awt.Color(0, 51, 255));
        jComboBoxStatusOperacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "GAIN", "LOSS", "BREAKEVEN", "" }));

        jComboBoxTipoPosicao.setForeground(new java.awt.Color(0, 51, 255));
        jComboBoxTipoPosicao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "SELL", "BUY", "" }));

        jComboBoxTipoOperacao.setForeground(new java.awt.Color(0, 51, 255));
        jComboBoxTipoOperacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "SWING TRADE", "DAY TRADE", "POSITION", "" }));

        jButtonImagemGraficoOperacao.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonImagemGraficoOperacao.setForeground(new java.awt.Color(0, 51, 255));
        jButtonImagemGraficoOperacao.setText("Enviar Imagem");
        jButtonImagemGraficoOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImagemGraficoOperacaoActionPerformed(evt);
            }
        });

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDescricao);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Clique para buscar operações:");

        jButton7.setText("Id:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonPrecoEntrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonAtivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jButtonTipoAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldPrecoEntrada)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(jTextFieldAtivo))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField2)
                                .addComponent(jComboBoxTipoAtivo, 0, 96, Short.MAX_VALUE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldQuantidadeContratos, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBoxStatusOperacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxTipoOperacao, 0, 112, Short.MAX_VALUE)
                                .addComponent(jComboBoxTipoPosicao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxEventoTecnicoBase, 0, 1, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonImagemGraficoOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSalvarEdicao1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonbuscarOperacoes)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonbuscarOperacoes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jTextFieldQuantidadeContratos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jComboBoxTipoOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTipoAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonTipoAtivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jComboBoxTipoPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAtivo)
                            .addComponent(jTextFieldAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jComboBoxStatusOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPrecoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPrecoEntrada))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6)
                            .addComponent(jComboBoxEventoTecnicoBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonImagemGraficoOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonSalvarEdicao1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableTabelaOperacoesEventoDuploClique(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTabelaOperacoesEventoDuploClique
            
        if (evt.getClickCount()== 2) {
            linhaSelecionada = jTableTabelaOperacoesEDITAROPERACOES.getSelectedRow();                
                if (linhaSelecionada != -1) {
                    Object valorId = jTableTabelaOperacoesEDITAROPERACOES.getValueAt(linhaSelecionada, 0);
            }}
    }//GEN-LAST:event_jTableTabelaOperacoesEventoDuploClique

    
    
        
    private void jButtonBuscarOperacoes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarOperacoes
                listaopercoes = controller.buscarParaEditarOperacoesController();
                atualizarTabelaEditarOperacoes(listaopercoes);
    }//GEN-LAST:event_jButtonBuscarOperacoes

    
    private void atualizarTabelaEditarOperacoes(List<Operacao> operacoes) {
    DefaultTableModel model = (DefaultTableModel) jTableTabelaOperacoesEDITAROPERACOES.getModel();
    model.setRowCount(0); 

        for (Operacao op : operacoes) {
            model.addRow(new Object[]{
                op.getId(),
                op.getTipoAtivo(),
                op.getAtivo(),
                op.getPrecoEntrada(),
                op.getPrecoSaida(),
                op.getQuantidadeContratos(),
                op.getTipoOperacao(),
                op.getTipoPosicao(),
                op.getStatusOperacao(),
                new ImageIcon(op.getImg()),
                op.getDataHora(),
                op.getEventoTecnicoBase(),


            });
        }
}
    
    private void jButtonEditarSalvarOperacao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarSalvarOperacao
                

    }//GEN-LAST:event_jButtonEditarSalvarOperacao

    private void jButtonImagemGraficoOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImagemGraficoOperacaoActionPerformed
        /*JFileChooser chooser = new JFileChooser();
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
            }*/
    }//GEN-LAST:event_jButtonImagemGraficoOperacaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonAtivo;
    private javax.swing.JButton jButtonImagemGraficoOperacao;
    private javax.swing.JButton jButtonPrecoEntrada;
    private javax.swing.JButton jButtonSalvarEdicao1;
    private javax.swing.JButton jButtonTipoAtivo;
    private javax.swing.JButton jButtonbuscarOperacoes;
    private javax.swing.JComboBox<String> jComboBoxEventoTecnicoBase;
    private javax.swing.JComboBox<String> jComboBoxStatusOperacao;
    private javax.swing.JComboBox<String> jComboBoxTipoAtivo;
    private javax.swing.JComboBox<String> jComboBoxTipoOperacao;
    private javax.swing.JComboBox<String> jComboBoxTipoPosicao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableTabelaOperacoesEDITAROPERACOES;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldAtivo;
    private javax.swing.JTextField jTextFieldPrecoEntrada;
    private javax.swing.JTextField jTextFieldQuantidadeContratos;
    // End of variables declaration//GEN-END:variables
}
