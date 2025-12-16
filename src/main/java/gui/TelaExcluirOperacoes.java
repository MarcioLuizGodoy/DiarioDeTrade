package gui;

import com.toedter.calendar.JCalendar;
import controller.ExcluirOperacoesController;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import model.Operacao;

public class TelaExcluirOperacoes extends javax.swing.JInternalFrame {

    public TelaExcluirOperacoes() {
        initComponents();
    }

    public List<Operacao> operacoesLista;
    ExcluirOperacoesController controller = new ExcluirOperacoesController();
    Date dataUm;
    Date dataDois;
    Frame framePai;
    BufferedImage img = null;
    Integer IdOperacaoEscolhida;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaOperacoes = new javax.swing.JTable();
        escolher = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        abrirImagem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        descricao = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 51, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Excluir Operações Por Datas");
        jLabelTitulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        tabelaOperacoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabelaOperacoes.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        tabelaOperacoes.setForeground(new java.awt.Color(0, 51, 204));
        tabelaOperacoes.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaOperacoes.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tabelaOperacoes.setShowGrid(true);
        tabelaOperacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clicarDuasVezesperguntarTemCerteza(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaOperacoes);

        escolher.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        escolher.setText("Escolher");
        escolher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolherDatas(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Escolher Datas:");

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarOperacoesPorDataa(evt);
            }
        });

        abrirImagem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        abrirImagem.setText("Abrir Imagem da  operacao");
        abrirImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirImagem(evt);
            }
        });

        descricao.setColumns(20);
        descricao.setRows(5);
        jScrollPane2.setViewportView(descricao);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Descrição da Análise Técnica da operação que deseja editar: ");

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Excluir Operacao");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirOperacao(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 1261, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(escolher, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131)
                        .addComponent(abrirImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(escolher, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(abrirImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void clicarDuasVezesperguntarTemCerteza(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clicarDuasVezesperguntarTemCerteza
        Integer row = tabelaOperacoes.getSelectedRow();
        if (row >= 0) {
            Operacao opSelecionada = this.operacoesLista.get(row);
            this.IdOperacaoEscolhida = opSelecionada.getId();
            descricao.setText(opSelecionada.getDescricao());
            this.img = opSelecionada.getImg();
        }
    }//GEN-LAST:event_clicarDuasVezesperguntarTemCerteza

    private void escolherDatas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolherDatas

        framePai = (JFrame) SwingUtilities.getWindowAncestor(this); // é o frame onde o desktopPane esta emcima. 
        //Criando o Dialog para receber outros componentes
        JDialog dialogInicio = new JDialog(framePai, "Selecionar Data Início", true);
        dialogInicio.setSize(400, 350);
        dialogInicio.setLocationRelativeTo(framePai);

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
                dataUm = calendarInicio.getDate();
                dialogInicio.dispose();
            }
        });
        dialogInicio.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialogInicio.setVisible(true);

        //===========================================
        JDialog dialogFim = new JDialog(framePai, "Selecionar Data Fim", true);
        dialogFim.setSize(400, 350);
        dialogFim.setLocationRelativeTo(framePai);

        JCalendar calendarFim = new JCalendar();
        dialogFim.add(calendarFim);

        JButton okFim = new JButton("OK");
        dialogFim.add(okFim, BorderLayout.SOUTH);

        okFim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dataDois = calendarFim.getDate();
                dialogFim.dispose();
            }
        });
        dialogFim.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialogFim.setVisible(true);


    }//GEN-LAST:event_escolherDatas

    private void buscarOperacoesPorDataa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarOperacoesPorDataa

        if (operacoesLista == null && dataUm != null && dataDois != null) {
            if (dataUm.before(dataDois)) {
                this.operacoesLista = controller.buscarOperacoesPorData(dataUm, dataDois, (JFrame) SwingUtilities.getWindowAncestor(this)); // PASSANDO O FRAME DO MENU JÁ NO METODO!
                atualizarTabela(this.operacoesLista); // tinha que dar erro apenas aqui
            }
        } else {
            JOptionPane.showMessageDialog(null, "As datas tem que ser inseridas corretamente.");
            return;
        }
    }//GEN-LAST:event_buscarOperacoesPorDataa

    private void abrirImagem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirImagem

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

    }//GEN-LAST:event_abrirImagem

    private void excluirOperacao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirOperacao
        controller.excluirOperacao(this.IdOperacaoEscolhida);
        if (controller.avisar() == true) {
            List<Operacao> atual = new ArrayList<>();
            try {
                atual = controller.buscarTudoLista();
                atualizarTabela(atual);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_excluirOperacao

    private void atualizarTabela(List<Operacao> operacoes) {
        DefaultTableModel model = (DefaultTableModel) tabelaOperacoes.getModel();
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
/*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaExcluirOperacoes().setVisible(true));
    }
*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirImagem;
    private javax.swing.JTextArea descricao;
    private javax.swing.JButton escolher;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaOperacoes;
    // End of variables declaration//GEN-END:variables
}
