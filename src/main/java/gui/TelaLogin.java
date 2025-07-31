package gui;

import controller.LoginController;

public class TelaLogin extends javax.swing.JFrame {
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundo = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelMensagemLogin = new javax.swing.JLabel();
        jButtonEntrar = new javax.swing.JButton();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelNomeDoPrograma = new javax.swing.JLabel();
        jLabelImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFundo.setBackground(new java.awt.Color(153, 153, 153));
        jPanelFundo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanelFundo.setForeground(new java.awt.Color(204, 204, 204));

        jLabelUsuario.setBackground(new java.awt.Color(51, 51, 51));
        jLabelUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(0, 0, 204));
        jLabelUsuario.setText("Usuario: ");

        jLabelSenha.setBackground(new java.awt.Color(102, 102, 102));
        jLabelSenha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(51, 0, 255));
        jLabelSenha.setText("Senha: ");

        jLabelMensagemLogin.setBackground(new java.awt.Color(51, 51, 51));
        jLabelMensagemLogin.setForeground(new java.awt.Color(0, 0, 255));

        jButtonEntrar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonEntrar.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButtonEntrar.setForeground(new java.awt.Color(0, 0, 255));
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFundoLayout = new javax.swing.GroupLayout(jPanelFundo);
        jPanelFundo.setLayout(jPanelFundoLayout);
        jPanelFundoLayout.setHorizontalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFundoLayout.createSequentialGroup()
                        .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSenha)
                        .addGap(43, 43, 43)
                        .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(296, Short.MAX_VALUE))
            .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFundoLayout.createSequentialGroup()
                    .addContainerGap(356, Short.MAX_VALUE)
                    .addComponent(jLabelMensagemLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(122, Short.MAX_VALUE)))
        );
        jPanelFundoLayout.setVerticalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButtonEntrar)
                .addGap(19, 19, 19))
            .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFundoLayout.createSequentialGroup()
                    .addContainerGap(58, Short.MAX_VALUE)
                    .addComponent(jLabelMensagemLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 840, 150));

        jLabelNomeDoPrograma.setBackground(new java.awt.Color(0, 0, 255));
        jLabelNomeDoPrograma.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabelNomeDoPrograma.setForeground(new java.awt.Color(0, 0, 255));
        jLabelNomeDoPrograma.setText("Diario De Trade");
        jLabelNomeDoPrograma.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabelNomeDoPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 370, 80));

        jLabelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/tabajara.png"))); // NOI18N
        getContentPane().add(jLabelImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        String usuario = jTextFieldUsuario.getText();
        String senha = new String(jPasswordFieldSenha.getPassword()); //Depois tenho que ver o porquê disso funcionar tão bem.
        boolean sucesso = lc.controllerValidarUsuario(usuario, senha);
        if (sucesso) {
            this.dispose();
        } else{
            jLabelMensagemLogin.setText("Usuário ou Senha incorrettos, Tente novamente!!!");
        }
    }//GEN-LAST:event_jButtonEntrarActionPerformed

     
    public TelaLogin() {
    initComponents();
    getRootPane().setDefaultButton(jButtonEntrar);

}
    private  LoginController lc = new LoginController();


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JLabel jLabelMensagemLogin;
    private javax.swing.JLabel jLabelNomeDoPrograma;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables

    
    
     /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaLogin().setVisible(true));
    }*/
}
