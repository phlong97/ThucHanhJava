/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.KhachHangDAL;
import DTO.KhachHangDTO;
import java.util.ArrayList;

/**
 *
 * @author longl
 */
public class KhachHangBLL {
    public static ArrayList<KhachHangDTO> KhachHang_DS() throws Exception{
        return KhachHangDAL.KhachHang_DS();
    }
    public static void KhachHang_Add(KhachHangDTO kh) throws Exception{
        KhachHangDAL.KhachHang_Add(kh);
    }
    public static void KhachHang_Delete(KhachHangDTO kh) throws Exception{
        KhachHangDAL.KhachHang_Delete(kh);
    }
    public static void KhachHang_Update(KhachHangDTO kh) throws Exception{
        KhachHangDAL.KhachHang_Update(kh);
    }
}
