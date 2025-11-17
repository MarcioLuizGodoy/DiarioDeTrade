package gui;

import controller.EditarOperacoesController;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Operacao;

public class TelaEditarOperacoes extends JInternalFrame {

    List<Operacao> listaopercoes;
    Integer valorId;
    int linhaSelecionada;
    EditarOperacoesController controller = new EditarOperacoesController();
    BufferedImage imagemEDITAR = null;

    public TelaEditarOperacoes() {
        initComponents();
        jTextFieldID.setEditable(false);

        // Renderer para pintar a linha clicada duas vezes
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                c.setBackground(row == linhaSelecionada ? new Color(200, 200, 200) : Color.WHITE);
                c.setForeground(row == linhaSelecionada ? Color.BLACK : Color.BLUE);
                return c;
            }
        };
        jTableTabelaOperacoesEDITAROPERACOES.setDefaultRenderer(Object.class, renderer);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabelaOperacoesEDITAROPERACOES = new javax.swing.JTable();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonbuscarOperacoes = new javax.swing.JButton();
        jButtonEDITARSALVAR = new javax.swing.JButton();
        jButtonTIPOATIVO = new javax.swing.JButton();
        jComboBoxTIPOATIVO = new javax.swing.JComboBox<>();
        jButtonATIVO = new javax.swing.JButton();
        jTextFieldATIVO = new javax.swing.JTextField();
        jButtonPRECOENTRADA = new javax.swing.JButton();
        jTextFieldPRECOENTRADA = new javax.swing.JTextField();
        jButtonPRECOSAIDA = new javax.swing.JButton();
        jTextFieldPRECOSAIDA = new javax.swing.JTextField();
        jButtonQTDCONTRATOS = new javax.swing.JButton();
        jButtonTIPOOPERACAO = new javax.swing.JButton();
        jButtonTIPOPOSICAO = new javax.swing.JButton();
        jButtonSTATUSOPERACAO = new javax.swing.JButton();
        jButtonEVENTOTECNICO = new javax.swing.JButton();
        jComboBoxEVENTOTECNICO = new javax.swing.JComboBox<>();
        jComboBoxSTATUSOPERACAO = new javax.swing.JComboBox<>();
        jComboBoxTIPOPOSICAO = new javax.swing.JComboBox<>();
        jComboBoxTIPOOPERACAO = new javax.swing.JComboBox<>();
        jTextFieldQTDCONTRATOS = new javax.swing.JTextField();
        jButtonImagemGraficoOperacao = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDESCRICAO = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButtonID = new javax.swing.JButton();
        jTextFieldID = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        aviso = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();

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
                duploClique(evt);
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
                buscarOperacoesEditar(evt);
            }
        });

        jButtonEDITARSALVAR.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonEDITARSALVAR.setForeground(new java.awt.Color(0, 51, 255));
        jButtonEDITARSALVAR.setText("Editar e Salvar");
        jButtonEDITARSALVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarSalvar(evt);
            }
        });

        jButtonTIPOATIVO.setForeground(new java.awt.Color(0, 51, 255));
        jButtonTIPOATIVO.setText("Tipo Ativo");

        jComboBoxTIPOATIVO.setForeground(new java.awt.Color(0, 51, 255));
        jComboBoxTIPOATIVO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "WIN", "WDO", "ACOES" }));

        jButtonATIVO.setForeground(new java.awt.Color(0, 51, 255));
        jButtonATIVO.setText("Ativo: ");

        jButtonPRECOENTRADA.setForeground(new java.awt.Color(0, 51, 255));
        jButtonPRECOENTRADA.setText("Preço Entrada:");
        jButtonPRECOENTRADA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jButtonPRECOSAIDA.setText("Preco Saida:");

        jButtonQTDCONTRATOS.setText("Qtd Contratos:");

        jButtonTIPOOPERACAO.setText("Tipo Operacao:");

        jButtonTIPOPOSICAO.setText("Tipo Posicao:");

        jButtonSTATUSOPERACAO.setText("Status Operacao:");

        jButtonEVENTOTECNICO.setText("Evento Tecnico:");

        jComboBoxEVENTOTECNICO.setForeground(new java.awt.Color(0, 0, 255));
        jComboBoxEVENTOTECNICO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Rompimento", "Regressao media movel" }));

        jComboBoxSTATUSOPERACAO.setForeground(new java.awt.Color(0, 51, 255));
        jComboBoxSTATUSOPERACAO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "GAIN", "LOSS", "BREAKEVEN", "" }));

        jComboBoxTIPOPOSICAO.setForeground(new java.awt.Color(0, 51, 255));
        jComboBoxTIPOPOSICAO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "SELL", "BUY", "" }));

        jComboBoxTIPOOPERACAO.setForeground(new java.awt.Color(0, 51, 255));
        jComboBoxTIPOOPERACAO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "SWING_TRADE", "DAY_TRADE", "POSITION", "" }));

        jButtonImagemGraficoOperacao.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonImagemGraficoOperacao.setForeground(new java.awt.Color(0, 51, 255));
        jButtonImagemGraficoOperacao.setText("Enviar Imagem");
        jButtonImagemGraficoOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarImagem(evt);
            }
        });

        jTextAreaDESCRICAO.setColumns(20);
        jTextAreaDESCRICAO.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDESCRICAO);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Clique para buscar operações:");

        jButtonID.setText("Id:");

        jScrollPane4.setViewportView(aviso);

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 255));
        jButton1.setText("Descrição da Análise Técnica da operação:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonPRECOSAIDA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonPRECOENTRADA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonATIVO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jButtonTIPOATIVO, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldPRECOENTRADA)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextFieldPRECOSAIDA, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(jTextFieldATIVO))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldID)
                                .addComponent(jComboBoxTIPOATIVO, 0, 96, Short.MAX_VALUE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonTIPOOPERACAO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonQTDCONTRATOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonTIPOPOSICAO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSTATUSOPERACAO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEVENTOTECNICO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldQTDCONTRATOS, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxSTATUSOPERACAO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxTIPOOPERACAO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxTIPOPOSICAO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxEVENTOTECNICO, 0, 1, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonbuscarOperacoes)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonEDITARSALVAR, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonImagemGraficoOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonbuscarOperacoes, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonImagemGraficoOperacao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonEDITARSALVAR))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonQTDCONTRATOS)
                                .addComponent(jTextFieldQTDCONTRATOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonID)
                                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonTIPOOPERACAO)
                                .addComponent(jComboBoxTIPOOPERACAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxTIPOATIVO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonTIPOATIVO))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonTIPOPOSICAO)
                                .addComponent(jComboBoxTIPOPOSICAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonATIVO)
                                .addComponent(jTextFieldATIVO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonSTATUSOPERACAO)
                                .addComponent(jComboBoxSTATUSOPERACAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldPRECOENTRADA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonPRECOENTRADA))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonPRECOSAIDA)
                                .addComponent(jTextFieldPRECOSAIDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonEVENTOTECNICO)
                                .addComponent(jComboBoxEVENTOTECNICO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void duploClique(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_duploClique

        if (evt.getClickCount() == 2) {
            linhaSelecionada = jTableTabelaOperacoesEDITAROPERACOES.getSelectedRow();
            jTableTabelaOperacoesEDITAROPERACOES.repaint();

            if (linhaSelecionada != -1) {
                //aqui valor id serve como parametro pra percorrer a lista. NAO APAGAR ESSE COMENTARIO.
                valorId = (Integer) jTableTabelaOperacoesEDITAROPERACOES.getValueAt(linhaSelecionada, 0);
                jTextFieldID.setEditable(true);
                jTextFieldID.setForeground(Color.red);
                jTextFieldID.setText(String.valueOf(valorId));
                jTextFieldID.setEditable(false);
                
                for(Operacao op: listaopercoes){
                    if(op.getId() == valorId){
                        jTextAreaDESCRICAO.setText(op.getDescricao());
                        jTextAreaDESCRICAO.setEditable(true);
                    }
                }
                
                            }
        }
    }//GEN-LAST:event_duploClique

    private void buscarOperacoesEditar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarOperacoesEditar
        listaopercoes = controller.buscarParaEditarOperacoesController();
        atualizarTabelaEditarOperacoes(listaopercoes);
        String avisoo = "AVISO: Clique duas vezes na operação que deseja editar, ao clicar  Id e a descrição seram  preenchido automaticamente visando te ajuda-lo a minimizar erros! ";
        aviso.setForeground(Color.BLUE);
        aviso.setFocusable(false);
        aviso.setEditable(false);
        aviso.setBorder(null);
        aviso.setText(avisoo);
    }//GEN-LAST:event_buscarOperacoesEditar

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

    private void enviarImagem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarImagem

        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Escolha a imagem que quer enviar!");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int resultado = chooser.showOpenDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File arquivoSelecionado = chooser.getSelectedFile();
            try {
                BufferedImage imagemSelecionada = ImageIO.read(arquivoSelecionado);
                this.imagemEDITAR = imagemSelecionada;
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Erro ao carregar a imagem.");
            }
        }
    }//GEN-LAST:event_enviarImagem

    private void editarSalvar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarSalvar
        
            String id = (String) jTextFieldID.getText();
            String tipoAtivo = (String) jComboBoxTIPOATIVO.getSelectedItem().toString();
            String ativo = (String) jTextFieldATIVO.getText();
            String precoEntrada = (String) jTextFieldPRECOENTRADA.getText();
            String precoSaida = (String) jTextFieldPRECOSAIDA.getText();
            String qtdContratos =(String) jTextFieldQTDCONTRATOS.getText();
            String tipoOp = (String) jComboBoxTIPOOPERACAO.getSelectedItem().toString();
            String  tipoPo = (String) jComboBoxTIPOPOSICAO.getSelectedItem().toString();
            String statusOp = (String) jComboBoxSTATUSOPERACAO.getSelectedItem().toString();
            String evTecBase = (String) jComboBoxEVENTOTECNICO.getSelectedItem().toString();
            String descricao = (String) jTextAreaDESCRICAO.getText().toString();
            BufferedImage img = imagemEDITAR;

            boolean result = controller.validarDadosEdicao(id, tipoAtivo, ativo, precoEntrada, precoSaida, qtdContratos, tipoOp, tipoPo, statusOp, evTecBase, descricao, img);
            if (result == true) {
                jTextFieldID.setEditable(true);
                limparCampos();
                
            }
  
    }//GEN-LAST:event_editarSalvar



    public void limparCampos() {
        jTextFieldID.setText("");
        jComboBoxTIPOATIVO.setSelectedIndex(0);
        jTextFieldATIVO.setText("");
        jTextFieldPRECOENTRADA.setText("");
        jTextFieldPRECOSAIDA.setText("");
        jTextFieldQTDCONTRATOS.setText("");
        jComboBoxTIPOOPERACAO.setSelectedIndex(0);
        jComboBoxTIPOPOSICAO.setSelectedIndex(0);
        jTextAreaDESCRICAO.setText("");
        jComboBoxEVENTOTECNICO.setSelectedIndex(0);
        jButtonImagemGraficoOperacao.setIcon(null);
        jComboBoxSTATUSOPERACAO.setSelectedIndex(0);
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane aviso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonATIVO;
    private javax.swing.JButton jButtonEDITARSALVAR;
    private javax.swing.JButton jButtonEVENTOTECNICO;
    private javax.swing.JButton jButtonID;
    private javax.swing.JButton jButtonImagemGraficoOperacao;
    private javax.swing.JButton jButtonPRECOENTRADA;
    private javax.swing.JButton jButtonPRECOSAIDA;
    private javax.swing.JButton jButtonQTDCONTRATOS;
    private javax.swing.JButton jButtonSTATUSOPERACAO;
    private javax.swing.JButton jButtonTIPOATIVO;
    private javax.swing.JButton jButtonTIPOOPERACAO;
    private javax.swing.JButton jButtonTIPOPOSICAO;
    private javax.swing.JButton jButtonbuscarOperacoes;
    private javax.swing.JComboBox<String> jComboBoxEVENTOTECNICO;
    private javax.swing.JComboBox<String> jComboBoxSTATUSOPERACAO;
    private javax.swing.JComboBox<String> jComboBoxTIPOATIVO;
    private javax.swing.JComboBox<String> jComboBoxTIPOOPERACAO;
    private javax.swing.JComboBox<String> jComboBoxTIPOPOSICAO;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableTabelaOperacoesEDITAROPERACOES;
    private javax.swing.JTextArea jTextAreaDESCRICAO;
    private javax.swing.JTextField jTextFieldATIVO;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldPRECOENTRADA;
    private javax.swing.JTextField jTextFieldPRECOSAIDA;
    private javax.swing.JTextField jTextFieldQTDCONTRATOS;
    // End of variables declaration//GEN-END:variables
}
