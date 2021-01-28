/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Servicos;
import View.CadServico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author breno
 *///Responsavel por manipular usuario pelo banco, salva, e editar deletar e etc
public class ServicoDAO {
    
    private final Connection connection;

    public ServicoDAO(Connection connection) {
        this.connection = connection;
    }
    
    public Servicos insert(Servicos servico) throws SQLException {
            
        
         //String sql = "insert into servicos(descricao, valor) values('"+servico.getDescricao() +"','"+ servico.getValor()+"'); ";
            String sql = "insert into servicos(descricao, valor) values(?,?); ";
           
            
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, servico.getDescricao());//Inseriondo no 1 ponto de ? a descrição
            statement.setFloat(2, servico.getValor()); // Inserindo no segundo ponto o valor
            statement.execute();
            
            ResultSet resultSet = statement.getGeneratedKeys();
            
            if(resultSet.next()) {
                int id = resultSet.getInt("id");
                servico.setId(id);
            }
            return servico;
            
    }
    
    public void update(Servicos servico) throws SQLException {
        String sql = "update servicos set descricao = ?, valor = ? where id = ? ";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, servico.getDescricao());//Inseriondo no 1 ponto de ? a descrição
            statement.setFloat(2, servico.getValor());
            statement.setInt(3, servico.getId());// Inserindo no segundo ponto o valor
            statement.execute();
        
    }
    
    public void insertOrUpdate(Servicos servico) throws SQLException {
        if (servico.getId()>0){
            update(servico);
        }
        else {
            insert(servico);
        }
    }
    
    public void delete(Servicos servico) throws SQLException{
         String sql = "delete from servicos where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setInt(1, servico.getId());//Inseriondo no 1 ponto de ? a descrição
            statement.execute();
        
    }
    
    
   //   public ArrayList<Servicos> selectAll() throws SQLException {
       // String sql = "select * from usuario";
       // PreparedStatement statement = connection.prepareStatement(sql);
        
        //ArrayList<Servicos> servicos = new ArrayList<Servicos>();  //Cria llista
        
       // statement.execute();
       // ResultSet resultSet = statement.getResultSet(); //pega os dados do banco
        
       // while(resultSet.next()) { //percorre as linhas do codigo
           // int id = resultSet.getInt("id");  //seta os dados na variavel
           // String descricao = resultSet.getString("descricao");
           // Float valor = resultSet.getFloat("valor");
            
            //Servicos servicoComDadosDoBanco = new Servicos(id, descricao,valor); //cria o servico com os dados do banco
            
          // servicos.add(servicoComDadosDoBanco); //adc na lista servicos do Array list esse servico do banco
        //}
        
       //return servicos;
    
      private ArrayList<Servicos> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Servicos> servicos = new ArrayList<Servicos>();  //Cria llista
        
        statement.execute();
        ResultSet resultSet = statement.getResultSet(); //pega os dados do banco
        
        while(resultSet.next()) { //percorre as linhas do codigo
            int id = resultSet.getInt("id");  //seta os dados na variavel
            String descricao = resultSet.getString("descricao");
            Float valor = resultSet.getFloat("valor");
            
            Servicos servicoComDadosDoBanco = new Servicos(id, descricao,valor); //cria o servico com os dados do banco
            servicos.add(servicoComDadosDoBanco); //adc na lista servicos do Array list esse servico do banco
        }
        
        return servicos;
    }
    
    
    
    
    
    public ArrayList<Servicos> selectAll() throws SQLException {
        String sql = "select * from servicos"; //seleciona todos
        PreparedStatement statement = connection.prepareStatement(sql);
        
        return pesquisa(statement);
    }

 
    
    public Servicos selectPorId(Servicos servico) throws SQLException{
        
        String sql = "select * from servicos where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, servico.getId());//Inseriondo no 1 ponto de ? a descrição
        
        return pesquisa(statement).get(0);
        
    }
    
    private boolean idSaoIguais(Servicos servico, Servicos servicoAComparar) {
        return servico.getId() ==  servicoAComparar.getId();
    }
    
     public ArrayList<Servicos> ler() throws SQLException {
        Connection conexao = new Conexao().getConnection();
        PreparedStatement statement = null;
        ResultSet rs= null;
        
        ArrayList<Servicos> servicos = new ArrayList<>();
        
        try {
        statement = conexao.prepareStatement("select * from servicos order by servicos.id");
        rs = statement.executeQuery();
        
        while(rs.next()) {
            
            
            int id = rs.getInt("id");  //seta os dados na variavel
            String descricao = rs.getString("descricao");
            Float valor = rs.getFloat("valor");
            
            Servicos servico = new Servicos(id, descricao, valor); //cria o servico com os dados do banco
            
            servicos.add(servico); //adc na lista servicos do Array list esse servico do banco
            
        }
        
        } catch (SQLException ex) {
            Logger.getLogger(ServicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return servicos;
        
        
    }
    
}
