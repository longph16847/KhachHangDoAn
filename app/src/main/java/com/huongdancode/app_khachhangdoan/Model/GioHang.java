package com.huongdancode.app_khachhangdoan.Model;

public class GioHang {
    private String MaGioHang;
    private String MaKhachHang;
    private int SoLuong;

    public GioHang() {
    }

    public GioHang(String maGioHang, String maKhachHang, int soLuong) {
        MaGioHang = maGioHang;
        MaKhachHang = maKhachHang;
        SoLuong = soLuong;
    }

    public String getMaGioHang() {
        return MaGioHang;
    }

    public void setMaGioHang(String maGioHang) {
        MaGioHang = maGioHang;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        MaKhachHang = maKhachHang;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }
}
