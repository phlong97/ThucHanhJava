/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author longl
 */
public class DBConnect {     
    String dbURL = "jdbc:sqlserver://localhost;databaseName=QLBH;user=sa;password=sa";
    private Connection conn = null;   
  
    public Connection getConnection() throws Exception
    {
        
        try{
            conn = DriverManager.getConnection(dbURL);               
        }
        catch(SQLException ex){
            throw new Exception("Khong the ket noi! - " + ex.getMessage());
        }        
        return conn;
    }
}
