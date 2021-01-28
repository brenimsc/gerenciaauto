/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DAO.Conexao;
import Model.DAO.PecaDAO;
import Model.Peca;
import View.TelEstoque;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author breno
 */
public class PecaController {
     private TelEstoque view;

    public PecaController(TelEstoque view) {
        this.view = view;
    }
    
    public void inserirIcone(JFrame frm) {
        try {
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/View/imagens/IconePerto.jpeg"));
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    
    
    public void salvaPeca() { // Criei para chamar esse metodo quando o usuario clicar  no botao do CadServico
        
        
        
        
        String descricao = view.getjTextDescEstoque().getText(); //Tive que criar getter e setter pra poder acessar os campos da view
        String marca = view.getjTextMarcaEstoque().getText();
        Float valor = Float.parseFloat(view.getjTextValorEstoque().getText());
        int qtd = Integer.parseInt(view.getjTextQtd().getText());

        
        Peca peca = new Peca(descricao, marca, valor, qtd);
       
       
       
        try {
            Connection conexao = new Conexao().getConnection();
            PecaDAO pecadao = new PecaDAO(conexao);
            pecadao.insert(peca);
            
            JOptionPane.showMessageDialog(null, "Peça Cadastrada!");
            
        } catch (SQLException ex) {
            Logger.getLogger(TelEstoque.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  //  public PecaControllerT(TelEstoque view) {
    //    this.view = view;
   // }
    
    
    
    
    
}
