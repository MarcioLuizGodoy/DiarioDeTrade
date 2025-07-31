
//AQUI NO CONTROLLER SE INSTANCIA TUDO QUE É NECESSÁRIO, O MODELO E O MODELO DAO, PARA O CONTROLLER ORQUESTRAR.

package controller;

import model.Usuario;
import model.LoginDao;
import gui.TelaMenu;

public class LoginController {
    private Usuario u = new Usuario();
    public LoginController(){
    }
    public boolean controllerValidarUsuario(String nome, String senha) {
        u.setNome(nome);
        u.setSenha(senha);
        LoginDao ld = new LoginDao();
        boolean validado = ld.validar(u);
        if(validado) {
            TelaMenu menu = new TelaMenu();
            menu.setVisible(true);
            return true;
        }else{
        }
        return false; 
            // Se cair aqui o codigo da tela vai devolver a mensagem de senha ou login errados e mandar tentar de novo!
    }
}
