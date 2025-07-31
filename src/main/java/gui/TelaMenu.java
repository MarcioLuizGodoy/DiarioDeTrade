
package gui;

import gui.TelaBuscarOperacoes;

public class TelaMenu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaMenu.class.getName());
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPaneContainerTelas = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuOperacoes = new javax.swing.JMenu();
        jMenuItemRegistrarOperacao = new javax.swing.JMenuItem();
        jMenuItemBuscarOperacoes = new javax.swing.JMenuItem();
        jMenuFinanceiro = new javax.swing.JMenu();
        jMenuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(153, 153, 153));

        jDesktopPaneContainerTelas.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPaneContainerTelas.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jDesktopPaneContainerTelasLayout = new javax.swing.GroupLayout(jDesktopPaneContainerTelas);
        jDesktopPaneContainerTelas.setLayout(jDesktopPaneContainerTelasLayout);
        jDesktopPaneContainerTelasLayout.setHorizontalGroup(
            jDesktopPaneContainerTelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 889, Short.MAX_VALUE)
        );
        jDesktopPaneContainerTelasLayout.setVerticalGroup(
            jDesktopPaneContainerTelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 563, Short.MAX_VALUE)
        );

        jMenuOperacoes.setText("Operações");

        jMenuItemRegistrarOperacao.setText("Registrar Operação");
        jMenuItemRegistrarOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistrarOperacaoActionPerformed(evt);
            }
        });
        jMenuOperacoes.add(jMenuItemRegistrarOperacao);

        jMenuItemBuscarOperacoes.setText("Buscar Operações");
        jMenuItemBuscarOperacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBuscarOperacoesActionPerformed(evt);
            }
        });
        jMenuOperacoes.add(jMenuItemBuscarOperacoes);

        jMenuBar1.add(jMenuOperacoes);

        jMenuFinanceiro.setText("Financeiro");
        jMenuBar1.add(jMenuFinanceiro);

        jMenuSobre.setText("Sobre");
        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneContainerTelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneContainerTelas)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemRegistrarOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistrarOperacaoActionPerformed
           
        for (javax.swing.JInternalFrame frame : jDesktopPaneContainerTelas.getAllFrames()) {
            frame.dispose();
        }
            TelaRegistrarOperacao tela = new TelaRegistrarOperacao();
            tela.setSize(jDesktopPaneContainerTelas.getSize());
            jDesktopPaneContainerTelas.add(tela).setVisible(true);
          
    }//GEN-LAST:event_jMenuItemRegistrarOperacaoActionPerformed

    private void jMenuItemBuscarOperacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBuscarOperacoesActionPerformed
    for (javax.swing.JInternalFrame frame : jDesktopPaneContainerTelas.getAllFrames()) {
            frame.dispose();
        }
            TelaBuscarOperacoes tela = new TelaBuscarOperacoes();
            tela.setSize(jDesktopPaneContainerTelas.getSize());
            jDesktopPaneContainerTelas.add(tela).setVisible(true);
            
    }//GEN-LAST:event_jMenuItemBuscarOperacoesActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPaneContainerTelas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFinanceiro;
    private javax.swing.JMenuItem jMenuItemBuscarOperacoes;
    private javax.swing.JMenuItem jMenuItemRegistrarOperacao;
    private javax.swing.JMenu jMenuOperacoes;
    private javax.swing.JMenu jMenuSobre;
    // End of variables declaration//GEN-END:variables

    
public TelaMenu() {
        initComponents();
        setContentPane(jDesktopPaneContainerTelas); // Define o DesktopPane como o conteúdo principal da janela
        setExtendedState(MAXIMIZED_BOTH); // opcional: abre maximizado
     
    }
public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> new TelaMenu().setVisible(true));
    }
}
