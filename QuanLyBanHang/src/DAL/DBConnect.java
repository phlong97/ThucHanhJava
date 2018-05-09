/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author longl
 */
public class DBConnect {     
    String dbURL = "jdbc:sqlserver://localhost;databaseName=QLBH;user=sa;password=sa";
    Connection conn;   
    public void displayError(SQLException ex){
       System.out.println(" Error Message:" + ex.getMessage());
       System.out.println(" SQL State:" + ex.getSQLState());
       System.out.println(" Error Code:" + ex.getErrorCode());
    }
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
    public void Close() throws Exception{
        try {
           if(conn!=null)
               conn.close();
       } catch (SQLException ex) {
           throw new Exception(ex);
       }
    }
    
    public ResultSet excuteQuery(String sql) throws Exception{
       ResultSet rs = null;
       try {
           Statement stm = (Statement) conn.createStatement();
           rs = stm.executeQuery(sql);
       } catch (SQLException ex) {
           throw new Exception(ex);
       }
       return rs;
   }
}
