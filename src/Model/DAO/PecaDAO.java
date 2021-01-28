/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Peca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author breno
 */
public class PecaDAO {
    
    private final Connection connection;

    public PecaDAO(Connection connection) {
        this.connection = connection;
    }
    
   // public void insert(Peca peca) throws SQLException {
     public Peca insert(Peca peca) throws SQLException {
            
        
         //String sql = "insert into servicos(descricao, valor) values('"+servico.getDescricao() +"','"+ servico.getValor()+"'); ";
            String sql = "insert into peca(descricao, marca, valor, qtd) values(?,?,?,?); ";
           
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, peca.getDescricao());//Inseriondo no 1 ponto de ? a descrição
            statement.setString(2, peca.getMarca());
            statement.setFloat(3, peca.getValor());
            statement.setInt(4, peca.getQtd());
            statement.execute();
          
            ResultSet resultSet = statement.getGeneratedKeys();  //colocado depois
            
            if(resultSet.next()) {
                int id = resultSet.getInt("id");
                peca.setId(id);
            }
            return peca;
            
    }
            
    
    
    public void update(Peca peca) throws SQLException {
        // exemplo updatePeca
        
      //  String qtdString = "select peca set descricao = ?, marca = ? , valor = ? , qtd = ? where id = ? ";
        String sql = "update peca set descricao = ?, marca = ? , valor = ? , qtd = ? where id = ? ";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, peca.getDescricao());//Inseriondo no 1 ponto de ? a descrição
            statement.setString(2, peca.getMarca());
            statement.setFloat(3, peca.getValor());// Inserindo no segundo ponto o valor
            statement.setInt(4, peca.getQtd());
            statement.setInt(5, peca.getId());
            
            statement.execute();
        
    }
    
    public void updatePeca(Peca peca) throws SQLException {
        // exemplo updatePeca
        
      //  String qtdString = "select peca set descricao = ?, marca = ? , valor = ? , qtd = ? where id = ? ";
        String sql = "update peca set qtd = ? where id = ?";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, peca.getQtd()-1);
            statement.setInt(2, peca.getId());
            
            statement.execute();
        
    }
    
    
    
    
    public void insertOrUpdate(Peca peca) throws SQLException {
        if (peca.getId()>0){
            update(peca);
        }
        else {
            insert(peca);
        }
    }
    
    public void delete(Peca peca) throws SQLException{
         String sql = "delete from peca where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setInt(1, peca.getId());//Inseriondo no 1 ponto de ? a descrição
            statement.execute();
        
    }
    
    
   //   public ArrayList<Servicos> selectAll() throws SQLException {
       // String sql = "select * from usuario";
       // PreparedStatement statement = connection.prepareStatement(sql);
        
       // ArrayList<Servicos> servicos = new ArrayList<Servicos>();  //Cria llista
        
       // statement.execute();
      //  ResultSet resultSet = statement.getResultSet(); //pega os dados do banco
        
       // while(resultSet.next()) { //percorre as linhas do codigo
      //      int id = resultSet.getInt("id");  //seta os dados na variavel
         //   String descricao = resultSet.getString("descricao");
          //  Float valor = resultSet.getFloat("valor");
            
         //   Servicos servicoComDadosDoBanco = new Servicos(id, descricao,valor); //cria o servico com os dados do banco
            
         //   servicos.add(servicoComDadosDoBanco); //adc na lista servicos do Array list esse servico do banco
        //}
        
       // return servicos;
    
    public ArrayList<Peca> selectAll() throws SQLException {
        String sql = "select * from peca order by peca.id"; //seleciona todos
        PreparedStatement statement = connection.prepareStatement(sql);
        
        return pesquisa(statement);
    }

    private ArrayList<Peca> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Peca> peca = new ArrayList<Peca>();  //Cria llista
        
        statement.execute();
        ResultSet resultSet = statement.getResultSet(); //pega os dados do banco
        
        while(resultSet.next()) { //percorre as linhas do codigo
            int id = resultSet.getInt("id");  //seta os dados na variavel
            String descricao = resultSet.getString("descricao");
            String marca = resultSet.getString("marca");
            Float valor = resultSet.getFloat("valor");
            int qtd = resultSet.getInt("qtd");
            
            Peca pecaComDadosDoBanco = new Peca(id, descricao, marca, valor, qtd); //cria o servico com os dados do banco
            
            peca.add(pecaComDadosDoBanco); //adc na lista servicos do Array list esse servico do banco
        }
        
        return peca;
    }
    
    public Peca selectPorId(Peca peca) throws SQLException{
        
        String sql = "select * from peca where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setInt(1, peca.getId());//Inseriondo no 1 ponto de ? a descrição
        return pesquisa(statement).get(0);
    }
    
    public ArrayList<Peca> ler() throws SQLException {
        Connection conexao = new Conexao().getConnection();
        PreparedStatement statement = null;
        ResultSet rs= null;
        
        ArrayList<Peca> pecas = new ArrayList<>();
        
        try {
        statement = conexao.prepareStatement("select * from peca order by peca.id");
        rs = statement.executeQuery();
        
        while(rs.next()) {
            
            
            int id = rs.getInt("id");  //seta os dados na variavel
            String descricao = rs.getString("descricao");
            String marca = rs.getString("marca");
            Float valor = rs.getFloat("valor");
            int qtd = rs.getInt("qtd");
            
            Peca peca = new Peca(id, descricao, marca, valor, qtd); //cria o servico com os dados do banco
            
            pecas.add(peca); //adc na lista servicos do Array list esse servico do banco
            
        }
        
        } catch (SQLException ex) {
            Logger.getLogger(PecaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return pecas;
        
        
    }
    
    
    
}
