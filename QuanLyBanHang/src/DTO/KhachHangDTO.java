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
public class KhachHangDTO {
    private String MaKH,HoTen,SoDT,DiaChi;
    private Date NgayDK,NgaySinh;
    private int DoanhThu;

    /**
     * @return the MaKH
     */
    public String getMaKH() {
        return MaKH;
    }

    /**
     * @param MaKH the MaKH to set
     */
    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    /**
     * @return the HoTen
     */
    public String getHoTen() {
        return HoTen;
    }

    /**
     * @param HoTen the HoTen to set
     */
    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    /**
     * @return the SoDT
     */
    public String getSoDT() {
        return SoDT;
    }

    /**
     * @param SoDT the SoDT to set
     */
    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    /**
     * @return the DiaChi
     */
    public String getDiaChi() {
        return DiaChi;
    }

    /**
     * @param DiaChi the DiaChi to set
     */
    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    /**
     * @return the NgayDK
     */
    public Date getNgayDK() {
        return NgayDK;
    }

    /**
     * @param NgayDK the NgayDK to set
     */
    public void setNgayDK(Date NgayDK) {
        this.NgayDK = NgayDK;
    }

    /**
     * @return the NgaySinh
     */
    public Date getNgaySinh() {
        return NgaySinh;
    }

    /**
     * @param NgaySinh the NgaySinh to set
     */
    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    /**
     * @return the DoanhThu
     */
    public int getDoanhThu() {
        return DoanhThu;
    }

    /**
     * @param DoanhThu the DoanhThu to set
     */
    public void setDoanhThu(int DoanhThu) {
        this.DoanhThu = DoanhThu;
    }
}
