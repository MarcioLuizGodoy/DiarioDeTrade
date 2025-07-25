
package controller;
import gui.TelaMenu;
    public class LoginController {
    public LoginController(){
    }
   public  boolean validarUsuario(String usuario,String senha){
       if(usuario.equals("godoy") && senha.equals("godoy")){
           TelaMenu menu = new TelaMenu();
            menu.setVisible(true);
            return true;
        }
    return false;
    }
}
