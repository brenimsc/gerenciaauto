/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DAO.Conexao;
import Model.DAO.ServicoDAO;
import Model.Servicos;
import View.CadServico;
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
public class ServicosController {  //Criei esta classe para controlar o cadastro de servico
    
    private CadServico view;

    public ServicosController(CadServico view) {
        this.view = view;
    }
    
    public void inserirIcone(JFrame frm) {
        try {
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/View/imagens/IconePerto.jpeg"));
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    
    
    public void salvaServicos() { // Criei para chamar esse metodo quando o usuario clicar  no botao do CadServico
        
        
        
        
        String descricao = view.getjTextDescricao().getText(); //Tive que criar getter e setter pra poder acessar os campos da view
        Float valor = Float.parseFloat(view.getjTextValor().getText());
        

        
        Servicos serv = new Servicos(descricao,valor);
       
       
       
        try {
            Connection conexao = new Conexao().getConnection();
            ServicoDAO servicodao = new ServicoDAO(conexao);
            servicodao.insert(serv);
            
            JOptionPane.showMessageDialog(null, "Serviço Cadastrado!");
            
        } catch (SQLException ex) {
            Logger.getLogger(CadServico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
