
//AQUI NO CONTROLLER SE INSTANCIA TUDO QUE É NECESSÁRIO, O MODELO E O MODELO DAO, PARA O CONTROLLER ORQUESTRAR.

package controller;

import model.Usuario;
import model.LoginDao;
import gui.TelaMenu;

public class LoginController {
    
    //INST5ANCIANDO USUARIO(MODELO)
    private Usuario u = new Usuario();

    public LoginController(){
    }

    public boolean controllerValidarUsuario(String nome, String senha) {
   
        u.setNome(nome);
        u.setSenha(senha);
        
        
        //INSTANCIANDO O LOGINDAO(MODELODAO)
        LoginDao ld = new LoginDao();
        boolean validado = ld.validar(u);
        

        if(validado) {
            TelaMenu menu = new TelaMenu();
            menu.setVisible(true);
            return true;
        }
        return false;
    }
}
