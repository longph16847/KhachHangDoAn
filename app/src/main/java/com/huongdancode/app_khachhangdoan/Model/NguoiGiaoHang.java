package com.huongdancode.app_khachhangdoan.Model;

public class NguoiGiaoHang {
    private String MaNguoiGiaoHang;
    private String HoTen;
    private int SoDienThoai;

    public NguoiGiaoHang() {
    }

    public NguoiGiaoHang(String maNguoiGiaoHang, String hoTen, int soDienThoai) {
        MaNguoiGiaoHang = maNguoiGiaoHang;
        HoTen = hoTen;
        SoDienThoai = soDienThoai;
    }

    public String getMaNguoiGiaoHang() {
        return MaNguoiGiaoHang;
    }

    public void setMaNguoiGiaoHang(String maNguoiGiaoHang) {
        MaNguoiGiaoHang = maNguoiGiaoHang;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        SoDienThoai = soDienThoai;
    }
}
