/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author longl
 */
public class NhanVienDTO {

    private String MaNV,HoTen,SoDT;
    private Date NgayVL;
    /**
     * @param MaNV the MaNV to set
     */
    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    /**
     * @param HoTen the HoTen to set
     */
    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    /**
     * @param SoDT the SoDT to set
     */
    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }
    /**
     * @param NgayVL the NgayVL to set
     */
    public void setNgayVL(Date NgayVL) {
        this.NgayVL = NgayVL;
    }   
    
    public String getMaNV(){
        return MaNV;
    }
    public String getHoTen(){
        return HoTen;
    }
    public String getSoDT(){
        return SoDT;
    }
    public Date getNgayVL(){
        return NgayVL;
    }
}
