
package app;

import gui.TelaLogin;

public class App {
    public static void main(String []args){
        java.awt.EventQueue.invokeLater(() -> new TelaLogin().setVisible(true));
    }
}
