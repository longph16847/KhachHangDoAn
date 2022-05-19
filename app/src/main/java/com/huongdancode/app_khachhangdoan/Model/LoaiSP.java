package com.huongdancode.app_khachhangdoan.Model;

public class LoaiSP {
    private String MaLoaiSP;
    private String HinhDaiDien;
    private String TenLoaiSP;

    public LoaiSP() {
    }

    public LoaiSP(String maLoaiSP, String hinhDaiDien, String tenLoaiSP) {
        MaLoaiSP = maLoaiSP;
        HinhDaiDien = hinhDaiDien;
        TenLoaiSP = tenLoaiSP;
    }

    public String getMaLoaiSP() {
        return MaLoaiSP;
    }

    public void setMaLoaiSP(String maLoaiSP) {
        MaLoaiSP = maLoaiSP;
    }

    public String getHinhDaiDien() {
        return HinhDaiDien;
    }

    public void setHinhDaiDien(String hinhDaiDien) {
        HinhDaiDien = hinhDaiDien;
    }

    public String getTenLoaiSP() {
        return TenLoaiSP;
    }

    public void setTenLoaiSP(String tenLoaiSP) {
        TenLoaiSP = tenLoaiSP;
    }
}
