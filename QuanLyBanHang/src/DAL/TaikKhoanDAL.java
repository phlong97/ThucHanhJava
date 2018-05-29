/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.TaiKhoanDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author longl
 */
public class TaikKhoanDAL {
    public static ResultSet TaiKhoan_Login(TaiKhoanDTO tk) throws Exception{
        String sql="Select * from TAIKHOAN where ID = ? and PASSWORD= ?";
        DBConnect conn = new DBConnect();
        ResultSet rs = null;
        PreparedStatement preparedStatement;        
        try{
            conn.getConnection();            
            preparedStatement = DBConnect.conn.prepareStatement(sql);
            preparedStatement.setString(1, tk.getId());
            preparedStatement.setString(2, tk.getPass());           
            rs = preparedStatement.executeQuery();           
        }
        catch(SQLException ex){
            System.err.println(ex);
        }             
        return rs;
    }
}
