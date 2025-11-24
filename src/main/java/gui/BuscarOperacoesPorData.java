package gui;

import com.toedter.calendar.JCalendar;
import controller.BuscarOperacoesPorDataController;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import model.Operacao;

public class BuscarOperacoesPorData extends JInternalFrame {

    Integer valorId;
    int linhaSelecionada;
    JFrame framePai;
    Date dataSelecionadaInicio;
    Date dataSelecionadaFim;
    BufferedImage img = null;  // inicialização padrão da variavel e vai mudar com o duplo clique
    private List<Operacao> opLista;
    BuscarOperacoesPorDataController c = new BuscarOperacoesPorDataController();

    public BuscarOperacoesPorData() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabelaOperacoes = new javax.swing.JTable();
        abrirImagemBotao = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescricaoOperacao = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 51, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Buscar Operações Por Datas");
        jLabelTitulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTableTabelaOperacoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableTabelaOperacoes.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jTableTabelaOperacoes.setForeground(new java.awt.Color(0, 51, 204));
        jTableTabelaOperacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "TipoAtivo", "Ativo", "Preco Entrada", "Preco Saida", "Qtd Contratos", "Tipo Operação", "Tipo Posição", "Status  Operação", "Data Hora", "E.Tec.Base"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTabelaOperacoes.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jTableTabelaOperacoes.setShowGrid(true);
        jTableTabelaOperacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                duploClique(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTabelaOperacoes);

        abrirImagemBotao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        abrirImagemBotao.setForeground(new java.awt.Color(51, 51, 51));
        abrirImagemBotao.setText("Abrir Imagem do grafico");
        abrirImagemBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirImagemOperacao(evt);
            }
        });

        jButtonBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(51, 51, 51));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarOperacoes(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Descrição Operação");

        jTextAreaDescricaoOperacao.setEditable(false);
        jTextAreaDescricaoOperacao.setColumns(20);
        jTextAreaDescricaoOperacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextAreaDescricaoOperacao.setRows(5);
        jTextAreaDescricaoOperacao.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jTextAreaDescricaoOperacao);

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Escolher Datas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolherDatas(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 327, Short.MAX_VALUE)
                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(295, 295, 295)
                .addComponent(abrirImagemBotao)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abrirImagemBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarOperacoes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarOperacoes
         
        if(opLista == null   &&   dataSelecionadaInicio !=null  &&    dataSelecionadaFim != null){
        opLista = c.receberDados(dataSelecionadaInicio, dataSelecionadaFim);
        atualizarTabela(opLista);
        }else{
            JOptionPane.showMessageDialog(null, "Nao permitido! Selecione Datas");
        }
    }//GEN-LAST:event_buscarOperacoes

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
                op.getDataHora().format(f),
                op.getEventoTecnicoBase(),
                new ImageIcon(op.getImg()),});
        }
    }


    private void abrirImagemOperacao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirImagemOperacao
        try {
            if (this.img != null) {
                File temp = File.createTempFile("operacao_", ".png");
                ImageIO.write(img, "png", temp);
                Desktop.getDesktop().open(temp);
            } else {
                JOptionPane.showMessageDialog(null, "Tabela vazia ou vc não clicou duas vezes na operação que quer abrir imagem.!");

            }
        } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Tabela vazia ou vc não clicou duas vezes na operação que quer abrir imagem.!");
        }
    }//GEN-LAST:event_abrirImagemOperacao

    private void duploClique(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_duploClique

        if (evt.getClickCount() == 2) {
            linhaSelecionada = jTableTabelaOperacoes.getSelectedRow();
            jTableTabelaOperacoes.repaint();

            if (linhaSelecionada != -1) {
                //aqui valor id serve como parametro pra percorrer a lista. NAO APAGAR ESSE COMENTARIO.
                valorId = (Integer) jTableTabelaOperacoes.getValueAt(linhaSelecionada, 0);

                for (Operacao op : opLista) {
                    if (op.getId() == valorId) {
                        jTextAreaDescricaoOperacao.setText(op.getDescricao());
                        jTextAreaDescricaoOperacao.setEditable(false);

                        this.img = op.getImg();
                        //Aqui, quando ocorre o duplo clique a imagem é setada em cima que tinha sido inicializada null, e depois vai ser usada no metodo que abre a imagem pra o usuario ver.

                        /* ALGUMAS LINHAS QUE SAO IRRELEVANTES A ESSE MOMENTO
                        jComboBoxTIPOATIVO.setSelectedItem(op.getTipoAtivo());
                        jTextFieldATIVO.setText(op.getAtivo());
                        jTextFieldPRECOENTRADA.setText(op.getPrecoEntrada().toPlainString());
                        jTextFieldPRECOSAIDA.setText(op.getPrecoSaida().toPlainString());
                        jTextFieldQTDCONTRATOS.setText(Integer.toString(op.getQuantidadeContratos()));
                        jComboBoxTIPOPOSICAO.setSelectedItem(op.getTipoPosicao().toString());
                        jComboBoxTIPOOPERACAO.setSelectedItem(op.getTipoOperacao().toString());
                        jComboBoxSTATUSOPERACAO.setSelectedItem(op.getStatusOperacao().toString());
                        jComboBoxEVENTOTECNICO.setSelectedItem(op.getEventoTecnicoBase().toString());*/
                    }
                }

            }
        }
    }//GEN-LAST:event_duploClique


    private void escolherDatas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolherDatas
        framePai = (JFrame) SwingUtilities.getWindowAncestor(this); // é o frame onde o desktopPane esta emcima. 
        //Criando o Dialog para receber outros componentes
        JDialog dialogInicio = new JDialog(framePai, "Selecionar Data Início", true);
        dialogInicio.setSize(400, 350);
        dialogInicio.setLocationRelativeTo(framePai);
        System.out.print(framePai.getName()); // --> frameMENUPRINCIPAL

        //instanciando o JCalendar para por dentro do dialog e tbem pegar as datas
        JCalendar calendarInicio = new JCalendar();

        //Adicionando o Calendar ao Dialog que vai suportalo.
        dialogInicio.add(calendarInicio);

        //criando e adicionando o botao ok ao dialog e setando sua localização(Baixo)
        JButton okInicio = new JButton("OK");
        dialogInicio.add(okInicio, BorderLayout.SOUTH);

        //Adicionando evento ao btn ok com func anonima para receber a data clicada
        okInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dataSelecionadaInicio = calendarInicio.getDate();
                dialogInicio.dispose();
            }
        });
        dialogInicio.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialogInicio.setVisible(true);

        //===========================================
        JDialog dialogFim = new JDialog(framePai, "Selecionar Data Fim", true);
        dialogFim.setSize(400, 350);
        dialogFim.setLocationRelativeTo(framePai);
        System.out.print(framePai.getName());

        JCalendar calendarFim = new JCalendar();
        dialogFim.add(calendarFim);

        JButton okFim = new JButton("OK");
        dialogFim.add(okFim, BorderLayout.SOUTH);

        okFim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dataSelecionadaFim = calendarFim.getDate();
                dialogFim.dispose();
            }
        });
        dialogFim.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialogFim.setVisible(true);

    }//GEN-LAST:event_escolherDatas


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirImagemBotao;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableTabelaOperacoes;
    private javax.swing.JTextArea jTextAreaDescricaoOperacao;
    // End of variables declaration//GEN-END:variables
}
