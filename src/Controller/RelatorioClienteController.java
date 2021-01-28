/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helpers.ClienteHelper;
import Controller.Helpers.RelatorioAgendamentoHelper;
import Model.Cliente;
import Model.DAO.ClienteDAO;
import Model.DAO.Conexao;
import View.RelCliente;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author breno
 */
public class RelatorioClienteController {
    private final RelCliente view;
    private final ClienteHelper helper;
    
    public RelatorioClienteController(RelCliente view) {
        this.view = view;
        this.helper = new ClienteHelper(view);
    }
    
     public void atualizaTabelaRelatorioCliente() throws SQLException {  //Usar isso mais pra frente pra exibir os agendamentos na tabela
        //Buscar lista com os agendamentos do banco de dados
        Connection conexao = new Conexao().getConnection();
        ClienteDAO clientedao = new ClienteDAO(conexao);
        ArrayList<Cliente> clientes = clientedao.selectAll();
        
        //Exibir a lista na view
        helper.preencherTabelaCliente(clientes);
    }
     
     public void inserirIcone(JFrame frm) {
        try {
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/View/imagens/IconePerto.jpeg"));
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
}



