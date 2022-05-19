package com.huongdancode.app_khachhangdoan.Model;

public class KhachHang {
    private String MaKhachHang;
    private String HinhAnh;
    private String HoTen;
    private String DiaChi;
    private int SoDienThoai;
    private String Passwork;
    private String Enable;

    public KhachHang() {
    }

    public KhachHang(String maKhachHang, String hinhAnh, String hoTen, String diaChi, int soDienThoai, String passwork, String enable) {
        MaKhachHang = maKhachHang;
        HinhAnh = hinhAnh;
        HoTen = hoTen;
        DiaChi = diaChi;
        SoDienThoai = soDienThoai;
        Passwork = passwork;
        Enable = enable;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        MaKhachHang = maKhachHang;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        HinhAnh = hinhAnh;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public int getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        SoDienThoai = soDienThoai;
    }

    public String getPasswork() {
        return Passwork;
    }

    public void setPasswork(String passwork) {
        Passwork = passwork;
    }

    public String getEnable() {
        return Enable;
    }

    public void setEnable(String enable) {
        Enable = enable;
    }
}
