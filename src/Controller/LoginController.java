/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Login;
import View.menuprincipal;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author breno
 */

//breno

public class LoginController {
    private final Login view;

    public LoginController(Login view) {  //Criei o metodo construtor e indiquei que pra iniciar precisa de uma view como parametro
        this.view = view;  //paramtero
    }
    
    public void entrarNoSistema() {
        menuprincipal telaDeMenu = new menuprincipal();
        telaDeMenu.setVisible(true);
        this.view.dispose();
        
    }
    
    public void inserirIcone(JFrame frm) {
        try {
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/View/imagens/IconePerto.jpeg"));
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
