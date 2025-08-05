
package gui;

public class TelaMenu extends javax.swing.JFrame {  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPaneContainerTelas = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuInicioLimpo = new javax.swing.JMenu();
        jMenuItemInicio = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuOperacoes = new javax.swing.JMenu();
        jMenuItemRegistrarOperacao = new javax.swing.JMenuItem();
        jMenuItemBuscarOperacoes = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuFinanceiro = new javax.swing.JMenu();
        jMenuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(153, 153, 153));

        jDesktopPaneContainerTelas.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPaneContainerTelas.setBorder(new javax.swing.border.MatteBorder(null));
        jDesktopPaneContainerTelas.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jDesktopPaneContainerTelasLayout = new javax.swing.GroupLayout(jDesktopPaneContainerTelas);
        jDesktopPaneContainerTelas.setLayout(jDesktopPaneContainerTelasLayout);
        jDesktopPaneContainerTelasLayout.setHorizontalGroup(
            jDesktopPaneContainerTelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1241, Short.MAX_VALUE)
        );
        jDesktopPaneContainerTelasLayout.setVerticalGroup(
            jDesktopPaneContainerTelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 691, Short.MAX_VALUE)
        );

        jMenuInicioLimpo.setText("Inicio");

        jMenuItemInicio.setText("Inicio");
        jMenuItemInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInicioActionPerformed(evt);
            }
        });
        jMenuInicioLimpo.add(jMenuItemInicio);

        jMenuItem2.setText("Meu método operacional");
        jMenuInicioLimpo.add(jMenuItem2);

        jMenuItem3.setText("Literatura Trader e Ensinamentos");
        jMenuInicioLimpo.add(jMenuItem3);

        jMenuBar1.add(jMenuInicioLimpo);

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

        jMenuItem4.setText("Algumas operações explicadas");
        jMenuOperacoes.add(jMenuItem4);

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
            .addComponent(jDesktopPaneContainerTelas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPaneContainerTelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void jMenuItemInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInicioActionPerformed
             
    for (javax.swing.JInternalFrame frame : jDesktopPaneContainerTelas.getAllFrames()) {
        frame.dispose();
        }
        TelaInicio telaLimpa = new TelaInicio();
            telaLimpa.setSize(jDesktopPaneContainerTelas.getSize());
            jDesktopPaneContainerTelas.add(telaLimpa).setVisible(true);    }//GEN-LAST:event_jMenuItemInicioActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPaneContainerTelas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFinanceiro;
    private javax.swing.JMenu jMenuInicioLimpo;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItemBuscarOperacoes;
    private javax.swing.JMenuItem jMenuItemInicio;
    private javax.swing.JMenuItem jMenuItemRegistrarOperacao;
    private javax.swing.JMenu jMenuOperacoes;
    private javax.swing.JMenu jMenuSobre;
    // End of variables declaration//GEN-END:variables

    
public TelaMenu() {
        initComponents();
        setContentPane(jDesktopPaneContainerTelas); // Define o DesktopPane como o conteúdo principal da janela
        // setExtendedState(MAXIMIZED_BOTH); // opcional: abre maximizado
            setResizable(false);
            setLocationRelativeTo(null);
        


    }}
/*public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> new TelaMenu().setVisible(true));
    }
}
*/
