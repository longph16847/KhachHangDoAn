package com.huongdancode.app_khachhangdoan.Model;

public class DonHangChiTiet {
    private String MaDonHangChiTiet;
    private String MaSP;
    private int SoLuong;
    private String MaDonHang;

    public DonHangChiTiet() {
    }

    public String getMaDonHangChiTiet() {
        return MaDonHangChiTiet;
    }

    public void setMaDonHangChiTiet(String maDonHangChiTiet) {
        MaDonHangChiTiet = maDonHangChiTiet;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String maSP) {
        MaSP = maSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public String getMaDonHang() {
        return MaDonHang;
    }

    public void setMaDonHang(String maDonHang) {
        MaDonHang = maDonHang;
    }

    public DonHangChiTiet(String maDonHangChiTiet, String maSP, int soLuong, String maDonHang) {
        MaDonHangChiTiet = maDonHangChiTiet;
        MaSP = maSP;
        SoLuong = soLuong;
        MaDonHang = maDonHang;
    }
}
