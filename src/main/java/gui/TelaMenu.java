package gui;

import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class TelaMenu extends javax.swing.JFrame {  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPaneContainerTelas = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuOperacoes = new javax.swing.JMenu();
        jMenuItemRegistrarOperacao = new javax.swing.JMenuItem();
        jMenuItemBuscarOperacoes = new javax.swing.JMenuItem();
        jMenuFinanceiro = new javax.swing.JMenu();
        jMenuItemEstatisticaPorTipoAtivo = new javax.swing.JMenuItem();
        jMenuItemEvolucaoCapital = new javax.swing.JMenuItem();
        jMenuItemBuscarPorAtivo = new javax.swing.JMenuItem();
        jMenuItemEstatiticaPorTipoOperacao = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
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

        jMenuFinanceiro.setText("Estatisticas e Financeiro");

        jMenuItemEstatisticaPorTipoAtivo.setText("Estatistica por Tipo Ativo");
        jMenuItemEstatisticaPorTipoAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEstatisticaPorTipoAtivoActionPerformed(evt);
            }
        });
        jMenuFinanceiro.add(jMenuItemEstatisticaPorTipoAtivo);

        jMenuItemEvolucaoCapital.setText("Evolucao Capital");
        jMenuItemEvolucaoCapital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEvolucaoCapitalActionPerformed(evt);
            }
        });
        jMenuFinanceiro.add(jMenuItemEvolucaoCapital);

        jMenuItemBuscarPorAtivo.setText("Buscar por Ativo");
        jMenuItemBuscarPorAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBuscarPorAtivoActionPerformed(evt);
            }
        });
        jMenuFinanceiro.add(jMenuItemBuscarPorAtivo);

        jMenuItemEstatiticaPorTipoOperacao.setText("Estatistica Por Tipo Operacao");
        jMenuItemEstatiticaPorTipoOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEstatiticaPorTipoOperacaoActionPerformed(evt);
            }
        });
        jMenuFinanceiro.add(jMenuItemEstatiticaPorTipoOperacao);

        jMenuItem7.setText("Buscar  por Tipo Posicao");
        jMenuFinanceiro.add(jMenuItem7);

        jMenuItem8.setText("Buscar por Evento Tecnico Base");
        jMenuFinanceiro.add(jMenuItem8);

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

    public TelaMenu(){
        initComponents();
                setContentPane(jDesktopPaneContainerTelas); // Define o DesktopPane como o conteúdo principal da janela
                setResizable(false);
                            setLocationRelativeTo(null);
    }
    private void jMenuItemRegistrarOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistrarOperacaoActionPerformed

        for (javax.swing.JInternalFrame frame : jDesktopPaneContainerTelas.getAllFrames()) {
            frame.dispose();
        }
            TelaRegistrarOperacao tela = new TelaRegistrarOperacao();
            tela.setSize(jDesktopPaneContainerTelas.getSize());
            ((javax.swing.plaf.basic.BasicInternalFrameUI) tela.getUI()).setNorthPane(null);
            jDesktopPaneContainerTelas.add(tela).setVisible(true);
          
    }//GEN-LAST:event_jMenuItemRegistrarOperacaoActionPerformed

    private void jMenuItemBuscarOperacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBuscarOperacoesActionPerformed
    for (javax.swing.JInternalFrame frame : jDesktopPaneContainerTelas.getAllFrames()) {
            frame.dispose();
        }
            TelaBuscarOperacoes tela = new TelaBuscarOperacoes();
            tela.setSize(jDesktopPaneContainerTelas.getSize());
            ((javax.swing.plaf.basic.BasicInternalFrameUI) tela.getUI()).setNorthPane(null);
            jDesktopPaneContainerTelas.add(tela).setVisible(true);
            
    }//GEN-LAST:event_jMenuItemBuscarOperacoesActionPerformed

    private void jMenuItemEvolucaoCapitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEvolucaoCapitalActionPerformed
        
        for (javax.swing.JInternalFrame frame : jDesktopPaneContainerTelas.getAllFrames()) {
            frame.dispose();
        }
            TelaEvolucaoCapital telaEvolucao = new TelaEvolucaoCapital();
            telaEvolucao.setSize(jDesktopPaneContainerTelas.getSize());
            ((javax.swing.plaf.basic.BasicInternalFrameUI) telaEvolucao.getUI()).setNorthPane(null);

            jDesktopPaneContainerTelas.add(telaEvolucao).setVisible(true);
        
    }//GEN-LAST:event_jMenuItemEvolucaoCapitalActionPerformed

    private void jMenuItemBuscarPorAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBuscarPorAtivoActionPerformed
            for(javax.swing.JInternalFrame frame: jDesktopPaneContainerTelas.getAllFrames()){
            frame.dispose();
        }
            TelaEstatisticaPorAtivo telaEstatistivaPorAtivo = new TelaEstatisticaPorAtivo();
            telaEstatistivaPorAtivo.setSize(jDesktopPaneContainerTelas.getSize());
            ((javax.swing.plaf.basic.BasicInternalFrameUI) telaEstatistivaPorAtivo.getUI()).setNorthPane(null);
            jDesktopPaneContainerTelas.add(telaEstatistivaPorAtivo).setVisible(true);
    }//GEN-LAST:event_jMenuItemBuscarPorAtivoActionPerformed

    private void jMenuItemEstatisticaPorTipoAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEstatisticaPorTipoAtivoActionPerformed
         for(javax.swing.JInternalFrame frame: jDesktopPaneContainerTelas.getAllFrames()){
            frame.dispose();
        }
            TelaEstatisticaPorTipoAtivo tela = new TelaEstatisticaPorTipoAtivo();
            tela.setSize(jDesktopPaneContainerTelas.getSize());
            ((javax.swing.plaf.basic.BasicInternalFrameUI) tela.getUI()).setNorthPane(null);
            jDesktopPaneContainerTelas.add(tela).setVisible(true);
        
    }//GEN-LAST:event_jMenuItemEstatisticaPorTipoAtivoActionPerformed

    private void jMenuItemEstatiticaPorTipoOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEstatiticaPorTipoOperacaoActionPerformed
                        for(JInternalFrame frame: jDesktopPaneContainerTelas.getAllFrames()){
                            frame.dispose();
                        }
                        TelaEstatisticaPorTipoOperacao tela = new TelaEstatisticaPorTipoOperacao();
                        tela.setSize(jDesktopPaneContainerTelas.getSize());
                        ((javax.swing.plaf.basic.BasicInternalFrameUI) tela.getUI()).setNorthPane(null);
                        jDesktopPaneContainerTelas.add(tela).setVisible(true);
    }//GEN-LAST:event_jMenuItemEstatiticaPorTipoOperacaoActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPaneContainerTelas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFinanceiro;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItemBuscarOperacoes;
    private javax.swing.JMenuItem jMenuItemBuscarPorAtivo;
    private javax.swing.JMenuItem jMenuItemEstatisticaPorTipoAtivo;
    private javax.swing.JMenuItem jMenuItemEstatiticaPorTipoOperacao;
    private javax.swing.JMenuItem jMenuItemEvolucaoCapital;
    private javax.swing.JMenuItem jMenuItemRegistrarOperacao;
    private javax.swing.JMenu jMenuOperacoes;
    private javax.swing.JMenu jMenuSobre;
    // End of variables declaration//GEN-END:variables

    

/*public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> new TelaMenu().setVisible(true));
    }*/
}

