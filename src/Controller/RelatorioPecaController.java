/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helpers.PecaHelper;
import Model.DAO.Conexao;
import Model.DAO.PecaDAO;
import Model.Peca;
import View.RelPeca;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author breno
 */
public class RelatorioPecaController {
    private final RelPeca view;
    private final PecaHelper helper;
    
    public RelatorioPecaController(RelPeca view) {
        this.view = view;
        this.helper = new PecaHelper(view);
    }
    
     public void atualizaTabelaRelatorioPeca() throws SQLException {  //Usar isso mais pra frente pra exibir os agendamentos na tabela
        //Buscar lista com os agendamentos do banco de dados
        Connection conexao = new Conexao().getConnection();
        PecaDAO pecadao = new PecaDAO(conexao);
        ArrayList<Peca> peca = pecadao.selectAll();
        
        //Exibir a lista na view
        helper.preencherTabelaPeca(peca);
    }
     
     public void inserirIcone(JFrame frm) {
        try {
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/View/imagens/IconePerto.jpeg"));
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
}

