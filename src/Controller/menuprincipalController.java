/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.CadAgendamento;
import View.CadCliente;
import View.CadServico;
import View.RelCliente;
import View.RelPeca;
import View.RelServico;
import View.RelatAgendamento;
import View.TelEstoque;
import View.menuprincipal;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author breno
 */
public class menuprincipalController {
    private final menuprincipal view;

    public menuprincipalController(menuprincipal view) {
        this.view = view;
    }
    
    public void inserirIcone(JFrame frm) {
        try {
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/View/imagens/IconePerto.jpeg"));
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public void navegarParaAgendamento() throws SQLException {
        
        CadAgendamento agendamento = new CadAgendamento();
        agendamento.setVisible(true);
  
    }
    
    public void navegarParaRelatorioAgendamento() throws SQLException {
        
        RelatAgendamento agendamento = new RelatAgendamento();
        agendamento.setVisible(true);
       
    }
    
    public void navegarParaRelatorioCliente() throws SQLException {
        
        RelCliente cliente = new RelCliente();
        cliente.setVisible(true);
      
    }
    
    public void navegarParaRelatorioServico() throws SQLException {
        
        RelServico servico = new RelServico();
        servico.setVisible(true);
       
    }
    
    public void navegarParaRelatorioPeca() throws SQLException {
        
        RelPeca peca = new RelPeca();
        peca.setVisible(true);
       
    }
    
    public void navegarParaCadastroServico() throws SQLException {
        
        CadServico servico = new CadServico();
        servico.setVisible(true);
        
    }
    
    public void navegarParaCadastroCliente() throws SQLException {
        
        CadCliente cliente = new CadCliente();
        cliente.setVisible(true);
        
    }
    
    public void navegarParaCadastroPeca() throws SQLException {
        
        TelEstoque peca = new TelEstoque();
        peca.setVisible(true);
        
    }
    
    

    
}
