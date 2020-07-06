/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

/**
 *
 * @author Thang Mi
 */
public class Luong {

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Date getNgayBD() {
        return NgayBD;
    }

    public void setNgayBD(Date NgayBD) {
        this.NgayBD = NgayBD;
    }

    public Date getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(Date ThoiGian) {
        this.ThoiGian = ThoiGian;
    }

    public String getGioLamViec() {
        return GioLamViec;
    }

    public void setGioLamViec(String GioLamViec) {
        this.GioLamViec = GioLamViec;
    }

    public String getBoPhan() {
        return BoPhan;
    }

    public void setBoPhan(String BoPhan) {
        this.BoPhan = BoPhan;
    }

    public String getLuong() {
        return Luong;
    }

    public void setLuong(String Luong) {
        this.Luong = Luong;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    private String MaNV;
    private String TenNV;
    private String GioiTinh;
    private Date NgayBD;
    private Date ThoiGian;
    private String GioLamViec;
    private String BoPhan;
    private String Luong;
    private String GhiChu;
}
