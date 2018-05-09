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
    public static ArrayList<NhanVienDTO> NhanVienAll() throws Exception{
        return NhanVienDAL.NhanVienAll();
    }
}
