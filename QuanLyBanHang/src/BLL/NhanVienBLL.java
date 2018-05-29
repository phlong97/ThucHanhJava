/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.NhanVienDAL;
import DTO.NhanVienDTO;
import java.util.ArrayList;

/**
 *
 * @author longl
 */
public class NhanVienBLL {
    public static ArrayList<NhanVienDTO> NhanVien_DS() throws Exception{
        return NhanVienDAL.NhanVien_DS();
    }
    public static void NhanVien_Add(NhanVienDTO nv) throws Exception{
        NhanVienDAL.NhanVien_Add(nv);
    }
    public static void NhanVien_Delete(NhanVienDTO nv) throws Exception{
        NhanVienDAL.NhanVien_Delete(nv);
    }
    public static void NhanVien_Update(NhanVienDTO nv) throws Exception{
        NhanVienDAL.NhanVien_Update(nv);
    }
}
