/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DAL.TaikKhoanDAL;
import DTO.TaiKhoanDTO;
import java.sql.ResultSet;
/**
 *
 * @author longl
 */
public class TaiKhoanBLL {
    public static ResultSet TaiKhoan_Login(TaiKhoanDTO tk) throws Exception {
        return TaikKhoanDAL.TaiKhoan_Login(tk);
}
}
