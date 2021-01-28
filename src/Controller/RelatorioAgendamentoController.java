/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helpers.RelatorioAgendamentoHelper;
import Model.AgendamentoBD;
import Model.DAO.AgendamentoDAO;
import Model.DAO.Conexao;
import View.RelatAgendamento;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author breno
 */
public class RelatorioAgendamentoController {
    
    private final RelatAgendamento view;
    private final RelatorioAgendamentoHelper helper;
    
    public RelatorioAgendamentoController(RelatAgendamento view) {
        this.view = view;
        this.helper = new RelatorioAgendamentoHelper(view);
    }
    
     public void atualizaTabelaRelatorio() throws SQLException {  //Usar isso mais pra frente pra exibir os agendamentos na tabela
        //Buscar lista com os agendamentos do banco de dados
        Connection conexao = new Conexao().getConnection();
        AgendamentoDAO agendamentodao = new AgendamentoDAO(conexao);
        ArrayList<AgendamentoBD> agendamentos = agendamentodao.selectAll();
        
        //Exibir a lista na view
        helper.preencherTabelaRelatorio(agendamentos);
    }
     
     public void inserirIcone(JFrame frm) {
        try {
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/View/imagens/IconePerto.jpeg"));
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
}
