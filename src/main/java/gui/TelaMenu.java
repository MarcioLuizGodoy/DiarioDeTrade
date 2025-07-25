
package gui;

public class TelaMenu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaMenu.class.getName());
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelImagem = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuRegistrar = new javax.swing.JMenu();
        jMenuFinanceiro = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(153, 153, 153));

        jLabelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/tabajara.png"))); // NOI18N

        jMenuRegistrar.setText("Registrar Operação");
        jMenuRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRegistrarActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuRegistrar);

        jMenuFinanceiro.setText("Financeiro");
        jMenuFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFinanceiroActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuFinanceiro);

        jMenu3.setText("----");
        jMenuBar1.add(jMenu3);

        jMenuSobre.setText("Sobre");
        jMenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSobreActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelImagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1208, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRegistrarActionPerformed
        //Vou  chamar aqui a tela de adicionar operação. NA VERDADE O CONTROLLER VAI FAZER ISSO.
    }//GEN-LAST:event_jMenuRegistrarActionPerformed

    private void jMenuFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFinanceiroActionPerformed
       //CHAMAREI AQUI A TELA DE FINANCEIRO.
    }//GEN-LAST:event_jMenuFinanceiroActionPerformed

    private void jMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSobreActionPerformed
        //CHAMARTEI AQUI A TELA DO FINANCEIRO
    }//GEN-LAST:event_jMenuSobreActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFinanceiro;
    private javax.swing.JMenu jMenuRegistrar;
    private javax.swing.JMenu jMenuSobre;
    // End of variables declaration//GEN-END:variables

    
public TelaMenu() {
        initComponents();
    }
public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> new TelaMenu().setVisible(true));
    }
}
