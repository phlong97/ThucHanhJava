/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.NhanVienDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author longl
 */
public class NhanVienDAL {
    public static ArrayList<NhanVienDTO> NhanVienAll() throws Exception{
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
}

