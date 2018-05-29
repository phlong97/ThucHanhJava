/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.NhanVienDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author longl
 */
public class NhanVienDAL {
    public static ArrayList<NhanVienDTO> NhanVien_DS() throws Exception{
        ArrayList<NhanVienDTO> arr = new ArrayList<>();
        String sql = "select * from NHANVIEN";
        DBConnect conn = new DBConnect();
        try {
            conn.getConnection();
            ResultSet rs = conn.excuteQuery(sql);
            while(rs.next()){
                NhanVienDTO nv = new NhanVienDTO();
                nv.setMaNV(rs.getString("MANV"));
                nv.setHoTen(rs.getString("HOTEN"));
                nv.setSoDT(rs.getString("SODT"));
                nv.setNgayVL(rs.getDate("NGVL"));
                arr.add(nv);
            }
        } catch (SQLException ex) {
            conn.displayError(ex);
        } finally{
            conn.Close();
        }
        return arr;
    }       
    public static void NhanVien_Add(NhanVienDTO nv) throws Exception{
        String sql = "INSERT INTO NHANVIEN (MANV,HOTEN,SODT,NGVL) VALUES(?,?,?,?)";          
        DBConnect DBconnect = new DBConnect();
        PreparedStatement preparedStatement;
        try{
            DBconnect.getConnection();
            preparedStatement = DBConnect.conn.prepareStatement(sql);
            preparedStatement.setString(1, nv.getMaNV());
            preparedStatement.setString(2, nv.getHoTen());
            preparedStatement.setString(3, nv.getSoDT());
            preparedStatement.setDate(4, nv.getNgayVL());   
            preparedStatement.executeUpdate();
        }
        catch(SQLException ex){
            System.err.println(ex);
        }       
        finally{
            DBconnect.Close();
        }        
    }
    public static void NhanVien_Delete(NhanVienDTO nv) throws Exception{
        String sql = "DELETE FROM NHANVIEN WHERE MANV = ?";
        DBConnect DBconnect = new DBConnect();
        PreparedStatement preparedStatement;
        try{
            DBconnect.getConnection();
            preparedStatement = DBConnect.conn.prepareStatement(sql);
            preparedStatement.setString(1, nv.getMaNV());  
            preparedStatement.executeUpdate();
        }
        catch(SQLException ex){
            System.err.println(ex);
        }       
        finally{
            DBconnect.Close();
        }        
    }
    public static void NhanVien_Update(NhanVienDTO nv) throws Exception{
        String sql = "UPDATE NHANVIEN SET HOTEN=?,SODT=?,NGVL=? WHERE MANV = ?";
        DBConnect DBconnect = new DBConnect();
        PreparedStatement preparedStatement;
        try{
            DBconnect.getConnection();
            preparedStatement = DBConnect.conn.prepareStatement(sql);            
            preparedStatement.setString(1, nv.getHoTen());
            preparedStatement.setString(2, nv.getSoDT());
            preparedStatement.setDate(3, nv.getNgayVL());  
            preparedStatement.setString(4, nv.getMaNV());  
            preparedStatement.executeUpdate();
        }
        catch(SQLException ex){
            System.err.println(ex);
        }       
        finally{
            DBconnect.Close();
        }        
    }
}

