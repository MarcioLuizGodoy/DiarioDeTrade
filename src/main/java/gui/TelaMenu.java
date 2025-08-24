package gui;

import javax.swing.JInternalFrame;
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
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuFinanceiro = new javax.swing.JMenu();
        jMenuItemEstatisticaPorTipoAtivo = new javax.swing.JMenuItem();
        jMenuItemEvolucaoCapital = new javax.swing.JMenuItem();
        jMenuItemBuscarPorAtivo = new javax.swing.JMenuItem();
        jMenuItemEstatiticaPorTipoOperacao = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(153, 153, 153));

        jDesktopPaneContainerTelas.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPaneContainerTelas.setBorder(new javax.swing.border.MatteBorder(null));
        jDesktopPaneContainerTelas.setForeground(new java.awt.Color(0, 0, 0));

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

        jMenuBar1.setForeground(new java.awt.Color(0, 0, 255));
        jMenuBar1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N

        jMenuOperacoes.setText("Operações");

        jMenuItemRegistrarOperacao.setForeground(new java.awt.Color(0, 0, 255));
        jMenuItemRegistrarOperacao.setText("Registrar Operação");
        jMenuItemRegistrarOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistrarOperacaoActionPerformed(evt);
            }
        });
        jMenuOperacoes.add(jMenuItemRegistrarOperacao);

        jMenuItemBuscarOperacoes.setForeground(new java.awt.Color(0, 51, 255));
        jMenuItemBuscarOperacoes.setText("Buscar Operações");
        jMenuItemBuscarOperacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBuscarOperacoesActionPerformed(evt);
            }
        });
        jMenuOperacoes.add(jMenuItemBuscarOperacoes);

        jMenuItem1.setForeground(new java.awt.Color(0, 51, 255));
        jMenuItem1.setText("Editar Operação");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarOperacao(evt);
            }
        });
        jMenuOperacoes.add(jMenuItem1);

        jMenuItem2.setForeground(new java.awt.Color(0, 51, 255));
        jMenuItem2.setText("Excluir Operação");
        jMenuOperacoes.add(jMenuItem2);

        jMenuBar1.add(jMenuOperacoes);

        jMenuFinanceiro.setText("Estatisticas e Financeiro");

        jMenuItemEstatisticaPorTipoAtivo.setForeground(new java.awt.Color(51, 51, 255));
        jMenuItemEstatisticaPorTipoAtivo.setText("Estatistica por Tipo Ativo");
        jMenuItemEstatisticaPorTipoAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEstatisticaPorTipoAtivoActionPerformed(evt);
            }
        });
        jMenuFinanceiro.add(jMenuItemEstatisticaPorTipoAtivo);

        jMenuItemEvolucaoCapital.setForeground(new java.awt.Color(0, 51, 255));
        jMenuItemEvolucaoCapital.setText("Evolucao Capital");
        jMenuItemEvolucaoCapital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEvolucaoCapitalActionPerformed(evt);
            }
        });
        jMenuFinanceiro.add(jMenuItemEvolucaoCapital);

        jMenuItemBuscarPorAtivo.setForeground(new java.awt.Color(0, 51, 255));
        jMenuItemBuscarPorAtivo.setText("Estatistica Por Ativo");
        jMenuItemBuscarPorAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBuscarPorAtivoActionPerformed(evt);
            }
        });
        jMenuFinanceiro.add(jMenuItemBuscarPorAtivo);

        jMenuItemEstatiticaPorTipoOperacao.setForeground(new java.awt.Color(0, 51, 255));
        jMenuItemEstatiticaPorTipoOperacao.setText("Estatistica Por Tipo Operacao");
        jMenuItemEstatiticaPorTipoOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEstatiticaPorTipoOperacaoActionPerformed(evt);
            }
        });
        jMenuFinanceiro.add(jMenuItemEstatiticaPorTipoOperacao);

        jMenuItem7.setForeground(new java.awt.Color(0, 51, 255));
        jMenuItem7.setText("Estatistica Por Tipo Posicao");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEstatisticaPorTipoPosicao(evt);
            }
        });
        jMenuFinanceiro.add(jMenuItem7);

        jMenuItem8.setForeground(new java.awt.Color(0, 51, 255));
        jMenuItem8.setText("Buscar por Evento Tecnico Base");
        jMenuFinanceiro.add(jMenuItem8);

        jMenuBar1.add(jMenuFinanceiro);

        jMenu1.setText("Usuario(a)s");

        jMenuItem3.setText("Cadastrar Usuario");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Trocar Senha");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Ver Usuarios");
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("PDF Relatórios");

        jMenuItem6.setText("Imprimir Relatórios Mensal");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemimprimirRelatorioPDF(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

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

    private void jMenuItemEstatisticaPorTipoPosicao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEstatisticaPorTipoPosicao
                          for( JInternalFrame frame : jDesktopPaneContainerTelas.getAllFrames()){
                                 frame.dispose();
                                }
                          TelaEstatisticaPorTipoPosicao tela = new TelaEstatisticaPorTipoPosicao();
                          tela.setSize(jDesktopPaneContainerTelas.getSize());
                          ((javax.swing.plaf.basic.BasicInternalFrameUI) tela.getUI()).setNorthPane(null);
                          jDesktopPaneContainerTelas.add(tela).setVisible(true);
    }//GEN-LAST:event_jMenuItemEstatisticaPorTipoPosicao

    private void jMenuItemEditarOperacao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarOperacao
                        for(  JInternalFrame frame: jDesktopPaneContainerTelas.getAllFrames()){
                            frame.dispose();
                                    }
                        TelaEditarOperacoes tela = new TelaEditarOperacoes();
                        // ISSO AQUI SÓ FUNCIONA SE A TELA QUE ESTA SENDO SETADA NO DESKTOP PANE EXTENDER INTERNAL FRAME
                        tela.setSize(jDesktopPaneContainerTelas.getSize());
                        ((BasicInternalFrameUI) tela.getUI()).setNorthPane(null);
                        jDesktopPaneContainerTelas.add(tela).setVisible(true);
            
    }//GEN-LAST:event_jMenuItemEditarOperacao

    private void jMenuItemimprimirRelatorioPDF(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemimprimirRelatorioPDF
                        for( JInternalFrame frame: jDesktopPaneContainerTelas.getAllFrames()){
                            frame.dispose();
                                    }
                        TelaImprimirRelatorioPDF tela = new TelaImprimirRelatorioPDF();
                        tela.setSize(jDesktopPaneContainerTelas.getSize());
                        ((BasicInternalFrameUI) tela.getUI()).setNorthPane(null);
                         jDesktopPaneContainerTelas.add(tela).setVisible(true);
                        
    }//GEN-LAST:event_jMenuItemimprimirRelatorioPDF

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPaneContainerTelas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFinanceiro;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
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


}

