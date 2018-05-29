/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.KhachHangDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author longl
 */
public class KhachHangDAL {
    public static ArrayList<KhachHangDTO> KhachHang_DS() throws Exception{
        ArrayList<KhachHangDTO> arr = new ArrayList<>();
        String sql = "select * from KHACHHANG";
        DBConnect conn = new DBConnect();
        try {
            conn.getConnection();
            ResultSet rs = conn.excuteQuery(sql);
            while(rs.next()){
                KhachHangDTO kh = new KhachHangDTO();
                kh.setMaKH(rs.getString("MAKH"));
                kh.setHoTen(rs.getString("HOTEN"));
                kh.setDiaChi(rs.getString("DCHI"));
                kh.setSoDT(rs.getString("SODT"));
                kh.setNgayDK(rs.getDate("NGDK"));
                kh.setNgaySinh(rs.getDate("NGSINH"));
                kh.setDoanhThu(rs.getInt("DOANHSO"));
                arr.add(kh);
            }
        } catch (SQLException ex) {
            conn.displayError(ex);
        } finally{
            conn.Close();
        }
        return arr;
    }       
    public static void KhachHang_Add(KhachHangDTO kh) throws Exception{
        String sql = "INSERT INTO KHACHHANG (MAKH,HOTEN,DCHI,SODT,NGSINH,NGDK,DOANHSO) VALUES(?,?,?,?,?,?,?)";          
        DBConnect DBconnect = new DBConnect();
        PreparedStatement preparedStatement;
        try{
            DBconnect.getConnection();
            preparedStatement = DBConnect.conn.prepareStatement(sql);
            preparedStatement.setString(1, kh.getMaKH());
            preparedStatement.setString(2, kh.getHoTen());
            preparedStatement.setString(3, kh.getDiaChi());
            preparedStatement.setString(4, kh.getSoDT());
            preparedStatement.setDate(5, kh.getNgaySinh());   
            preparedStatement.setDate(6, kh.getNgayDK());
            preparedStatement.setInt(7, kh.getDoanhThu()); 
            preparedStatement.executeUpdate();
        }
        catch(SQLException ex){
            System.err.println(ex);
        }       
        finally{
            DBconnect.Close();
        }        
    }
    public static void KhachHang_Delete(KhachHangDTO kh) throws Exception{
        String sql = "DELETE FROM KHACHHANG WHERE MAKH = ?";
        DBConnect DBconnect = new DBConnect();
        PreparedStatement preparedStatement;
        try{
            DBconnect.getConnection();
            preparedStatement = DBConnect.conn.prepareStatement(sql);
            preparedStatement.setString(1, kh.getMaKH());
            preparedStatement.executeUpdate();
        }
        catch(SQLException ex){
            System.err.println(ex);
        }       
        finally{
            DBconnect.Close();
        }        
    }
    public static void KhachHang_Update(KhachHangDTO kh) throws Exception{
        String sql = "UPDATE KHACHHANG SET HOTEN=?,DCHI=?,SODT=?,NGSINH=?,NGDK=?,DOANHSO=? WHERE MAKH = ?";
        DBConnect DBconnect = new DBConnect();
        PreparedStatement preparedStatement;
        try{
            DBconnect.getConnection();
            preparedStatement = DBConnect.conn.prepareStatement(sql);       
            preparedStatement.setString(1, kh.getHoTen());
            preparedStatement.setString(2, kh.getDiaChi());
            preparedStatement.setString(3, kh.getSoDT());            
            preparedStatement.setDate(4, kh.getNgaySinh());  
            preparedStatement.setDate(5, kh.getNgayDK());
            preparedStatement.setInt(6, kh.getDoanhThu());
            preparedStatement.setString(7, kh.getMaKH());  
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
