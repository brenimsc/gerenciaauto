/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helpers.AgendamentoHelper;
import Model.Agendamento;
import Model.AgendamentoBD;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.Conexao;
import Model.DAO.PecaDAO;
import Model.DAO.ServicoDAO;
import Model.Peca;
import Model.Servicos;
import ServicoEmail.Correios;
import View.CadAgendamento;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import sun.rmi.runtime.Log;

/**
 *
 * @author breno
 */
public class AgendamentoController {
    private final CadAgendamento view;
    //private final RelAgendamento view;
    private final AgendamentoHelper helper;

    public AgendamentoController(CadAgendamento view) {
        this.view = view;
        this.helper = new AgendamentoHelper(view);
    }
    
    //public AgendamentoController(RelAgendamento view) {
       // this.view = view;
        //this.helper = new AgendamentoHelper(view);
    //}
    
    public void inserirIcone(JFrame frm) {
        try {
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/View/imagens/IconePerto.jpeg"));
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public void atualizaTabela() throws SQLException {  //Usar isso mais pra frente pra exibir os agendamentos na tabela
        //Buscar lista com os agendamentos do banco de dados
        Connection conexao = new Conexao().getConnection();
        PecaDAO pecadao = new PecaDAO(conexao);
        ArrayList<Peca> pecas = pecadao.selectAll();
        
        //Exibir a lista na view
        helper.preencherTabela(pecas);
    }
    


    public void atualizaCliente() throws SQLException {
        //Buscar cliente do banco de dados
        Connection conexao = new Conexao().getConnection();
        ClienteDAO clienteDAO = new ClienteDAO(conexao);
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        
        //Exibir cliente no combobox Cliente
        helper.preencherClientes(clientes);
    }
    
    public void atualizaServico() throws SQLException {
        //Buscar cliente do servico de dados
        Connection conexao = new Conexao().getConnection();
        ServicoDAO servicoDAO = new ServicoDAO(conexao);
        
        ArrayList<Servicos> servicoss = servicoDAO.selectAll()
;
        
        
        //Exibir servico no combobox servico
        helper.preencherServicos(servicoss);
    }

    public void atualizaPeca() throws SQLException {
          //Buscar peca do peca de dados
        Connection conexao = new Conexao().getConnection();
        PecaDAO pecaDAO = new PecaDAO(conexao);
        
        ArrayList<Peca> pecas = pecaDAO.selectAll()
;
        
        //Exibir peca no combobox peca
        helper.preencherPeca(pecas);
    }
    
    public void atualizaValor() {
        Servicos servico = helper.obterServico();
        helper.setarValor(servico.getValor());
    }
    
    public void atualizaValorPeca() {
        Peca peca = helper.obterPeca();
        helper.setarValorPeca(peca.getValor());
    }
    
    public void atualizaValorTotal() {
        float totall = helper.valorTotal();
        helper.setaValorTotal(totall);
    }
    
    public void agendar() throws SQLException{
    //Buscar obj Agendamento da Tela
         Cliente cliente = helper.obterCliente();
         int clienteId = cliente.getId();
         Servicos servicos = helper.obterServico();
         int servicoId = servicos.getId();
         Peca peca = helper.obterPeca();
         int pecaId = peca.getId();
         double valorServico = servicos.getValor();
         String data = view.getjTextData().getText();
         double valorPeca = peca.getValor();
         String obs = view.getjTextAreaObs().getText();
         String valorTotalString = view.getjTextValorTotal().getText();
         double  valorTotal = Double.parseDouble(valorTotalString);
         String qtdParcelasString = (String) view.getjComboBoxParcelas().getSelectedItem();
         int qtdParcelas = Integer.parseInt(qtdParcelasString);
         String formaPagamento = (String) view.getjComboBoxFormaPagamento().getSelectedItem();
         int qtdPeca = peca.getQtd();
       
         
         
         
         

        Agendamento agendamento = new Agendamento(clienteId, servicoId, pecaId, valorServico, data, valorPeca, obs, valorTotal, formaPagamento, qtdParcelas);
       
       
      // if(view.getjTextValorTotal().getText()=="0")
        //System.out.print("Erro");
       
            
        try {
            
            
            Connection conexao = new Conexao().getConnection();
            AgendamentoDAO agendamentoDAO = new AgendamentoDAO(conexao);
            Boolean test = agendamentoDAO.insert(agendamento);
            if(test){
              
            JOptionPane.showMessageDialog(null, "Agendamento Cadastrado!");
            
            }else{
                JOptionPane.showMessageDialog(null, "Agendamento Não Cadastrado!");
            }
            atualizaTabela();
            helper.limparTela();
                 
                 
         int pecaId2 = peca.getId();
         String descricao = peca.getDescricao(); //Tive que criar getter e setter pra poder acessar os campos da view
        String marca = peca.getMarca();
        Float valor = peca.getValor();
        int qtd = peca.getQtd();
        
       
       /*
        Implementado novo pra teste em baixo e em cima
        */
        String descricaoPeca = peca.getDescricao(); //Tive que criar getter e setter pra poder acessar os campos da view
        String marcaPeca = peca.getMarca();
        Float valorPeca2 = peca.getValor();
        int id = peca.getId();
        int qtdPeca2 = peca.getQtd();

        
        Peca pecaDados = new Peca(id, descricaoPeca, marcaPeca, valorPeca2, qtdPeca2);
       
       
        try {
            
            if (peca.getQtd()>0) {
            Connection conexao2 = new Conexao().getConnection();
            PecaDAO servicodao = new PecaDAO(conexao2);
            servicodao.updatePeca(peca);
            
            
            JOptionPane.showMessageDialog(null, "Unidade da peça selecionada retirada do estoque!");
            atualizaTabela();
            
            
            
        } else {
               JOptionPane.showMessageDialog(null, "Peça com estoque = 0"); 
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(CadAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
                
       
        
                
        /*
        
        */ 
            
            
            
            
            
            //correios
            
        } catch (SQLException ex) {
            Logger.getLogger(CadAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void enviarPorEmail(){
    
         Cliente cliente = helper.obterCliente();
         int clienteId = cliente.getId();
         Servicos servicos = helper.obterServico();
         int servicoId = servicos.getId();
         Peca peca = helper.obterPeca();
         int pecaId = peca.getId();
         double valorServico = servicos.getValor();
         String data = view.getjTextData().getText();
         double valorPeca = peca.getValor();
         String obs = view.getjTextAreaObs().getText();
         String valorTotalString = view.getjTextValorTotal().getText();
         double  valorTotal = Double.parseDouble(valorTotalString);
         String qtdParcelasString = (String) view.getjComboBoxParcelas().getSelectedItem();
        int qtdParcelas = Integer.parseInt(qtdParcelasString);
        String formaPagamento = (String) view.getjComboBoxFormaPagamento().getSelectedItem();
    
        String nomeCliente = cliente.getNome();
        String nomeServico = servicos.getDescricao();
        String nomePeca = peca.getDescricao();
        
        
        //Criar um objeto do tipo Agendamento recebendo os parametros que eu recebi
        Agendamento agendamento2 = new Agendamento(nomeCliente, nomeServico, nomePeca, valorServico, data, valorPeca, obs, valorTotal, formaPagamento, qtdParcelas);
        
        Correios correios = new Correios();
        correios.NotificarPorEmail(agendamento2);
    
    
}
        
        //Fazer o atualiza tabela depois no relatório
       // helper.limparTela();
}
    
    // public void salvaAgendamento() { // Criei para chamar esse metodo quando o usuario clicar  no botao do CadServico
        
        
        
        
        //String nome = view.getjTextNome().getText(); //Tive que criar getter e setter pra poder acessar os campos da view
       // String telefone = view.getjTextTelefone().getText();
       // String cpf = view.getjTextCpf().getText();
       // String endereco = view.getjTextEndereco().getText();
       
    
    
    

