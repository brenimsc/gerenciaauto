/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import View.CadAgendamento;
import Model.Agendamento;
import Model.AgendamentoBD;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author breno
 *///tentando inserir objeto do tipo agendamento

public class AgendamentoDAO {
    
    private final Connection connection;

    public AgendamentoDAO(Connection connection) {
        this.connection = connection;
    }


   public boolean insert(Agendamento agendamento) throws SQLException {
        
            String sql = "insert into agendamento(id_cliente, id_servico, data, id_peca, observacao, valor_total, formapagamento, qtdparcelas) values(?,?,?,?,?,?,?,?); ";
           
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, agendamento.getIdCliente());//Inseriondo no 1 ponto de ? a descrição
            statement.setInt(2, agendamento.getIdServico());
            statement.setString(3, agendamento.getData());
            statement.setInt(4, agendamento.getIdPeca());
            statement.setString(5, agendamento.getObservacao());
            statement.setDouble(6, agendamento.getValorTotal());
            statement.setString(7, agendamento.getFormaPagamento());
            statement.setInt(8, agendamento.getQtdParcelas());
            
            
           
           int row = statement.executeUpdate();
           if (row >0){
               return true;
           }
               return false;
    
            
    }
   
    public boolean update(Agendamento agendamento) throws SQLException {
        
            String sql = "update agendamento SET id_cliente = ?, id_servico = ?, data = ?, id_peca = ?, observacao = ?, valor_total = ?)";
           
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, agendamento.getIdCliente());//Inseriondo no 1 ponto de ? a descrição
            statement.setInt(2, agendamento.getIdServico());
            statement.setString(3, agendamento.getData());
            statement.setInt(4, agendamento.getIdPeca());
            statement.setString(5, agendamento.getObservacao());
            statement.setDouble(6, agendamento.getValorTotal());
           // Inserindo no segundo ponto o valor
           int rowUpdate = statement.executeUpdate();
           if (rowUpdate >0){
               return true;
           }
               return false;
    
            
    }
    
    public ArrayList<AgendamentoBD> selectAll() throws SQLException {
        String sql = "select agendamento.id, cliente.nome, agendamento.data, servicos.descricao as servdesc, servicos.valor as servvalor,peca.descricao as pecadesc, peca.valor as pecavalor, agendamento.observacao, agendamento.valor_total, agendamento.formapagamento, agendamento.qtdparcelas from agendamento  inner join cliente on agendamento.id_cliente = cliente.id inner join servicos on agendamento.id_servico = servicos.id inner join peca on agendamento.id_peca = peca.id order by agendamento.id desc;"; //seleciona todos
        PreparedStatement statement = connection.prepareStatement(sql);
        
        return pesquisa(statement);
    }

    private ArrayList<AgendamentoBD> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<AgendamentoBD> agendamentobd = new ArrayList<AgendamentoBD>();  //Cria llista
        
        statement.execute();
        ResultSet resultSet = statement.getResultSet(); //pega os dados do banco
        
        while(resultSet.next()) { //percorre as linhas do codigo
            String nome = resultSet.getString("nome");  //seta os dados na variavel
            String data = resultSet.getString("data");
            String descricaoServico = resultSet.getString("servdesc");
            Double valorServico = resultSet.getDouble("servvalor");
            String descricaoPeca = resultSet.getString("pecadesc");
            Double valorPeca = resultSet.getDouble("pecavalor");
            String observacao = resultSet.getString("observacao");
            Double valorTotal = resultSet.getDouble("valor_total");
            String formaPagamento = resultSet.getString("formapagemento");
            int qtdParcelas = resultSet.getInt("qtdparcelas");
            
            
            
            AgendamentoBD agendamentoBDComDadosDoBanco = new AgendamentoBD(nome, data, descricaoServico, valorServico, descricaoPeca, valorPeca, observacao, valorTotal, formaPagamento, qtdParcelas); //cria o servico com os dados do banco
            
            agendamentobd.add(agendamentoBDComDadosDoBanco); //adc na lista servicos do Array list esse servico do banco
        }
        
        return agendamentobd;
    }
    
    public ArrayList<AgendamentoBD> ler() throws SQLException {
        Connection conexao = new Conexao().getConnection();
        PreparedStatement statement = null;
        ResultSet rs= null;
        
        ArrayList<AgendamentoBD> agendamentos = new ArrayList<>();
        
        try {
        statement = conexao.prepareStatement("select agendamento.id, cliente.nome, agendamento.data, servicos.descricao as servdesc, servicos.valor as servvalor,peca.descricao as pecadesc, peca.valor as pecavalor, agendamento.observacao, agendamento.valor_total, agendamento.formapagamento, agendamento.qtdparcelas from agendamento  inner join cliente on agendamento.id_cliente = cliente.id inner join servicos on agendamento.id_servico = servicos.id inner join peca on agendamento.id_peca = peca.id order by agendamento.id desc;");
        rs = statement.executeQuery();
        
        while(rs.next()) {
            
            int id = rs.getInt("id");
            String nome = rs.getString("nome");  //seta os dados na variavel
            String data = rs.getString("data");
            String descricaoServico = rs.getString("servdesc");
            Double valorServico = rs.getDouble("servvalor");
            String descricaoPeca = rs.getString("pecadesc");
            Double valorPeca = rs.getDouble("pecavalor");
            String observacao = rs.getString("observacao");
            Double valorTotal = rs.getDouble("valor_total");
            String formaPagamento = rs.getString("formapagamento");
            int qtdParcelas = rs.getInt("qtdparcelas");
            
            AgendamentoBD agendamentoBDComDadosDoBanco = new AgendamentoBD(id, nome, data, descricaoServico, valorServico, descricaoPeca, valorPeca, observacao, valorTotal, formaPagamento, qtdParcelas); //cria o agendamento com os dados do banco
            
            agendamentos.add(agendamentoBDComDadosDoBanco); //adc na lista servicos do Array list esse servico do banco
            
        }
        
        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return agendamentos;
        
        
    }
    
    public ArrayList<AgendamentoBD> lerForData(String dataa) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        PreparedStatement statement = null;
        ResultSet rs= null;
        
        ArrayList<AgendamentoBD> agendamentoss = new ArrayList<>();
        
        try {
        statement = conexao.prepareStatement("select agendamento.id, cliente.nome, agendamento.data, servicos.descricao as servdesc, servicos.valor as servvalor,peca.descricao as pecadesc, peca.valor as pecavalor, agendamento.observacao, agendamento.valor_total, agendamento.formapagamento, agendamento.qtdparcelas from agendamento  inner join cliente on agendamento.id_cliente = cliente.id inner join servicos on agendamento.id_servico = servicos.id inner join peca on agendamento.id_peca = peca.id where data like ?");
        statement.setString(1, "'%"+dataa+"%'");
        rs = statement.executeQuery();
        
        
        while(rs.next()) {
            
            int id = rs.getInt("id");
            String nome = rs.getString("nome");  //seta os dados na variavel
            String data = rs.getString("data");
            String descricaoServico = rs.getString("servdesc");
            Double valorServico = rs.getDouble("servvalor");
            String descricaoPeca = rs.getString("pecadesc");
            Double valorPeca = rs.getDouble("pecavalor");
            String observacao = rs.getString("observacao");
            Double valorTotal = rs.getDouble("valor_total");
            String formaPagamento = rs.getString("formapagamento");
            int qtdParcelas = rs.getInt("qtdparcelas");
            
            AgendamentoBD agendamentoBDComDadosDoBanco = new AgendamentoBD(id, nome, data, descricaoServico, valorServico, descricaoPeca, valorPeca, observacao, valorTotal, formaPagamento, qtdParcelas); //cria o agendamento com os dados do banco
         
            agendamentoss.add(agendamentoBDComDadosDoBanco); //adc na lista servicos do Array list esse servico do banco
            
        }
        
        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return agendamentoss;
        
        
    }
    
    public void delete(AgendamentoBD agendamento) throws SQLException{
         String sql = "delete from agendamento where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setInt(1, agendamento.getIdAgendamento());//Inseriondo no 1 ponto de ? a descrição
            statement.execute();
        
    }
}
    


