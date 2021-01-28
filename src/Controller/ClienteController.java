/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helpers.ClienteHelper;
import Model.Cliente;
import Model.DAO.ClienteDAO;
import Model.DAO.Conexao;
import View.CadCliente;
import java.awt.List;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author breno
 */
public class ClienteController {
     private CadCliente view;
    
     

    public ClienteController(CadCliente view) {
        this.view = view;
      
        
    }
    
    
    
    
    public void salvaCliente() { // Criei para chamar esse metodo quando o usuario clicar  no botao do CadServico
        
        
        
      
        String nome = view.getjTextNome().getText(); //Tive que criar getter e setter pra poder acessar os campos da view
        String telefone = view.getjTextTelefone().getText();
        String cpf = view.getjTextCpf().getText();
        String endereco = view.getjTextEndereco().getText();

        
        Cliente client = new Cliente( nome, telefone, cpf, endereco);
       
       
       
        try {
            Connection conexao = new Conexao().getConnection();
            ClienteDAO clientedao = new ClienteDAO(conexao);
            clientedao.insert(client);
            
            JOptionPane.showMessageDialog(null, "Cliente Cadastrado!");
            
        } catch (SQLException ex) {
            //Logger.getLogger(CadCliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar!"+ex);
        }
    }
    
    public void inserirIcone(JFrame frm) {
        try {
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/View/imagens/IconePerto.jpeg"));
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    /*public void atualizaCliente() { // Criei para chamar esse metodo quando o usuario clicar  no botao do CadServico
        
        
        
      
        String nome = view.getjTextNome().getText(); //Tive que criar getter e setter pra poder acessar os campos da view
        String telefone = view.getjTextTelefone().getText();
        String cpf = view.getjTextCpf().getText();
        String endereco = view.getjTextEndereco().getText();
        String idString = view.getjTextId().getText();
        int id = Integer.parseInt(idString);
        
        int id = ((int)view.getjTableClientes2().getValueAt(jTableClientes2.getSelectedRow(), 0));

        
        Cliente client = new Cliente( id, nome, telefone, cpf, endereco);
       
       
       
        try {
            Connection conexao = new Conexao().getConnection();
            ClienteDAO clientedao = new ClienteDAO(conexao);
            clientedao.update(client);
            
            JOptionPane.showMessageDialog(null, "Cliente Atualizado!");
            
        } catch (SQLException ex) {
            //Logger.getLogger(CadCliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!"+ex);
        }
    }
    /*/
   
   
    

    
    
    
    
}
