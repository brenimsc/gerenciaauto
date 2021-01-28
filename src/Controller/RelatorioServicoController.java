/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helpers.ServicoHelper;
import Model.DAO.Conexao;
import Model.DAO.ServicoDAO;
import Model.Servicos;
import View.RelServico;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author breno
 */
public class RelatorioServicoController {
    private final RelServico view;
    private final ServicoHelper helper;
    
    public RelatorioServicoController(RelServico view) {
        this.view = view;
        this.helper = new ServicoHelper(view);
    }
    
     public void atualizaTabelaRelatorioServico() throws SQLException {  //Usar isso mais pra frente pra exibir os agendamentos na tabela
        //Buscar lista com os agendamentos do banco de dados
        Connection conexao = new Conexao().getConnection();
        ServicoDAO servicodao = new ServicoDAO(conexao);
        ArrayList<Servicos> servicos = servicodao.selectAll();
        
        //Exibir a lista na view
        helper.preencherTabelaServico(servicos);
    }
     
     public void inserirIcone(JFrame frm) {
        try {
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/View/imagens/IconePerto.jpeg"));
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
}
