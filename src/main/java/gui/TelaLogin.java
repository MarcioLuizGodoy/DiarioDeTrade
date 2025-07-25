package gui;

import controller.LoginController;
import model.LoginDao;
import model.Usuario;

public class TelaLogin extends javax.swing.JFrame {
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundo = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jTextFieldSenha = new javax.swing.JTextField();
        jButtonEntrar = new javax.swing.JButton();
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
                .addGap(70, 70, 70)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addComponent(jTextFieldSenha))
                .addGap(49, 49, 49)
                .addComponent(jButtonEntrar)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanelFundoLayout.setVerticalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha)
                    .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 840, 140));

        jLabelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/tabajara.png"))); // NOI18N
        getContentPane().add(jLabelImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     
    public TelaLogin() {
    initComponents();
}

     //INSTANCIANDO O CONTROLLER( ORQUESTRADOR DE TUDO) 
    private  LoginController lc = new LoginController();

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        String usuario = jTextFieldUsuario.getText();
        String senha = jTextFieldSenha.getText();
        boolean sucesso = lc.controllerValidarUsuario(usuario, senha);
                if (sucesso) {
                this.dispose();
                }
    }//GEN-LAST:event_jButtonEntrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JTextField jTextFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables

     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaLogin().setVisible(true));
    }
}
