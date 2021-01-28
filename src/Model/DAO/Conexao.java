/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author breno
 */
public class Conexao {
    public Connection getConnection() throws SQLException {
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/autoeletrica",  "postgres", "postgres");
        return conexao;
    }
    
    

}