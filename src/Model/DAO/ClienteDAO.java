/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Cliente;
import java.awt.List;
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
public class ClienteDAO {
    
    private final Connection connection;

    public ClienteDAO(Connection connection) {
        this.connection = connection;
    }
    
    //public void insert(Cliente cliente) throws SQLException {
    public Cliente insert(Cliente cliente) throws SQLException {
            
        
         //String sql = "insert into servicos(descricao, valor) values('"+servico.getDescricao() +"','"+ servico.getValor()+"'); ";
            String sql = "insert into cliente(nome, telefone, cpf, endereco) values(?,?,?,?); ";
           
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, cliente.getNome());//Inseriondo no 1 ponto de ? a descrição
            statement.setString(2, cliente.getTelefone());
            statement.setString(3, cliente.getCpf());
            statement.setString(4, cliente.getEndereço());
           // Inserindo no segundo ponto o valor
            statement.execute();
            
            
            ResultSet resultSet = statement.getGeneratedKeys(); //inserido depois
            
            if(resultSet.next()) {
                int id = resultSet.getInt("id");
                cliente.setId(id);
            }
            return cliente;
            
    
            
    }
    
    public void update(Cliente cliente) throws SQLException {
        String sql = "update cliente set nome = ?, telefone = ? , cpf = ?, endereco = ? where id = ? ";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, cliente.getNome());//Inseriondo no 1 ponto de ? a descrição
            statement.setString(2, cliente.getTelefone());
            statement.setString(3, cliente.getCpf());// Inserindo no segundo ponto o valor
            statement.setString(4, cliente.getEndereço());
            statement.setInt(5, cliente.getId());
            //add um get de qual id vai ser alterado.
            statement.execute();
        
    }
    
    public void insertOrUpdate(Cliente cliente) throws SQLException {
        if (cliente.getId()>0){
            update(cliente);
        }
        else {
            insert(cliente);
        }
    }
    
    public void delete(Cliente cliente) throws SQLException{
         String sql = "delete from cliente where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setInt(1, cliente.getId());//Inseriondo no 1 ponto de ? a descrição
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
    
    public ArrayList<Cliente> selectAll() throws SQLException {
        String sql = "select * from cliente order by cliente.id desc"; //seleciona todos
        PreparedStatement statement = connection.prepareStatement(sql);
        
        return pesquisa(statement);
    }

    private ArrayList<Cliente> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Cliente> cliente = new ArrayList<Cliente>();  //Cria llista
        
        statement.execute();
        ResultSet resultSet = statement.getResultSet(); //pega os dados do banco
        
        while(resultSet.next()) { //percorre as linhas do codigo
            int id = resultSet.getInt("id");  //seta os dados na variavel
            String nome = resultSet.getString("nome");
            String telefone = resultSet.getString("telefone");
            String cpf = resultSet.getString("cpf");
            String endereco = resultSet.getString("endereco");
            
            Cliente clienteComDadosDoBanco = new Cliente(id, nome, telefone, cpf, endereco); //cria o servico com os dados do banco
            
            cliente.add(clienteComDadosDoBanco); //adc na lista servicos do Array list esse servico do banco
        }
        
        return cliente;
    }
    
    public Cliente selectPorId(Cliente cliente) throws SQLException{
        
        String sql = "select * from cliente where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setInt(1, cliente.getId());//Inseriondo no 1 ponto de ? a descrição
        return pesquisa(statement).get(0);
    }
    
     public ArrayList<Cliente> ler() throws SQLException {
        Connection conexao = new Conexao().getConnection();
        PreparedStatement statement = null;
        ResultSet rs= null;
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        try {
        statement = conexao.prepareStatement("select * from cliente order by cliente.id");
        rs = statement.executeQuery();
        
        while(rs.next()) {
            
            
            int id = rs.getInt("id");  //seta os dados na variavel
            String nome = rs.getString("nome");
            String telefone = rs.getString("telefone");
            String cpf = rs.getString("cpf");
            String endereco = rs.getString("endereco");
            
            Cliente cliente = new Cliente(id, nome, telefone, cpf, endereco); //cria o servico com os dados do banco
            
            clientes.add(cliente); //adc na lista servicos do Array list esse servico do banco
            
        }
        
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return clientes;
        
        
    }
    
    /**
     *
     * @return
     * @throws SQLException
     */
   

    
}
