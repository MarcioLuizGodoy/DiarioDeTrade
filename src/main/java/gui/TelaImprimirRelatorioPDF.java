package gui;

import com.itextpdf.text.Document;
import java.awt.BorderLayout;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.JDialog;
import com.toedter.calendar.JCalendar;
import controller.ImprimirRelatorioController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.List;
import javax.swing.JFrame;
import model.Operacao;

public class TelaImprimirRelatorioPDF extends javax.swing.JInternalFrame {

    public TelaImprimirRelatorioPDF() {
        initComponents();
        jTextField1.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        jLabelTitulo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 0, 204));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Relatórios PDF");
        jLabelTitulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jButton2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setText("Gerar PDF");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarPDF(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("Clique e selecione o período");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarPeriodo(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("#Aqui, você se informará a cerca das totalidades por período escolhido!");
        jTextField1.setToolTipText("");
        jTextField1.setBorder(new javax.swing.border.MatteBorder(null));
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 636, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 418, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(422, 422, 422)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    JFrame framePai;
    Date dataSelecionadaInicio;
    Date dataSelecionadaFim;
    Document document = new Document();
    private List<Operacao> opLista;

    private void gerarPDF(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarPDF

        //Essas duas linhas abaixo vão ser a ponte para as classes modelo e banco, retornando uma lista de operacoes nesse periodo de data especificado pelo usuario.
        ImprimirRelatorioController lc = new ImprimirRelatorioController();
        lc.pegarDataEFiltrarPorData(dataSelecionadaInicio, dataSelecionadaFim);
    }//GEN-LAST:event_gerarPDF


    private void jButtonSelecionarPeriodo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarPeriodo

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
        
        okInicio.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            dataSelecionadaInicio = calendarInicio.getDate(); //LocalDateTime. 
            dialogInicio.dispose();
        }
    });
    dialogInicio.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    dialogInicio.setVisible(true);
    System.out.print(dataSelecionadaInicio);

        //===========================================
        JDialog dialogFim = new JDialog(framePai, "Selecionar Data Início", true);
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
            dataSelecionadaFim = calendarFim.getDate(); 
            dialogFim.dispose();
        }
    });
    dialogFim.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    dialogFim.setVisible(true);
    System.out.print(dataSelecionadaInicio);

    }//GEN-LAST:event_jButtonSelecionarPeriodo


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
