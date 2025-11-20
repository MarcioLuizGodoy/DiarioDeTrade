package gui;

import controller.BuscarOperacaoController;
import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;
import model.Operacao;

public class TelaBuscarOperacoes extends JInternalFrame {

    public TelaBuscarOperacoes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabelaOperacoes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jComboBoxFiltros = new javax.swing.JComboBox<>();
        jButtonBuscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescricaoOperacao = new javax.swing.JTextArea();
        abrirImagemBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);

        jLabelTitulo.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 51, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Buscar Operações");
        jLabelTitulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTableTabelaOperacoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableTabelaOperacoes.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jTableTabelaOperacoes.setForeground(new java.awt.Color(0, 51, 204));
        jTableTabelaOperacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "TipoAtivo", "Ativo", "Preco Entrada", "Preco Saida", "Qtd Contratos", "Tipo Operação", "Tipo Posição", "Status  Operação", "Data Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTabelaOperacoes.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jTableTabelaOperacoes.setShowGrid(true);
        jTableTabelaOperacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClicarDuasVezesEPegarDescricao(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTabelaOperacoes);

        jButton1.setForeground(new java.awt.Color(0, 51, 255));
        jButton1.setText("Buscar por: ");

        jComboBoxFiltros.setForeground(new java.awt.Color(0, 51, 255));
        jComboBoxFiltros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas Operacoes" }));

        jButtonBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(0, 51, 255));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarOperacoes(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(0, 51, 255));
        jButton2.setText("Descricao da Operação: ");

        jTextAreaDescricaoOperacao.setEditable(false);
        jTextAreaDescricaoOperacao.setColumns(20);
        jTextAreaDescricaoOperacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextAreaDescricaoOperacao.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDescricaoOperacao);

        abrirImagemBotao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        abrirImagemBotao.setForeground(new java.awt.Color(0, 51, 255));
        abrirImagemBotao.setText("Abrir Imagem do grafico");
        abrirImagemBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirImagemBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(37, 37, 37)
                        .addComponent(jComboBoxFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(496, 496, 496)
                        .addComponent(abrirImagemBotao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(abrirImagemBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String escolhaFiltroTela; //manter essa variavel para caso um dia for necessario adicionar mais escolhas alem de todas as operacoes no combobox
    BuscarOperacaoController c = new BuscarOperacaoController();
    private List<Operacao> operacoesVarGlobal;

    private void buscarOperacoes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarOperacoes
        escolhaFiltroTela = jComboBoxFiltros.getSelectedItem().toString();
        operacoesVarGlobal = c.buscarOperacoesController(escolhaFiltroTela);
        atualizarTabela(operacoesVarGlobal);
    }//GEN-LAST:event_buscarOperacoes

    private BufferedImage img;


    private void ClicarDuasVezesEPegarDescricao(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClicarDuasVezesEPegarDescricao
        int row = jTableTabelaOperacoes.getSelectedRow();
        if (row >= 0) {
            Operacao opSelecionada = this.operacoesVarGlobal.get(row);
            jTextAreaDescricaoOperacao.setText(opSelecionada.getDescricao());
            this.img = opSelecionada.getImg();
        }
    }//GEN-LAST:event_ClicarDuasVezesEPegarDescricao


    private void abrirImagemBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirImagemBotaoActionPerformed

        try {

            File temp = File.createTempFile("operacao_", ".png");
            ImageIO.write(img, "png", temp);
            Desktop.getDesktop().open(temp);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_abrirImagemBotaoActionPerformed

    private void atualizarTabela(List<Operacao> operacoes) {
        DefaultTableModel model = (DefaultTableModel) jTableTabelaOperacoes.getModel();
        model.setRowCount(0);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

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
                op.getDataHora().format(f), // op.getEventoTecnicoBase(),
            });
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirImagemBotao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JComboBox<String> jComboBoxFiltros;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableTabelaOperacoes;
    private javax.swing.JTextArea jTextAreaDescricaoOperacao;
    // End of variables declaration//GEN-END:variables

}
