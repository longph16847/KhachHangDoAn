package com.huongdancode.app_khachhangdoan.Model;

public class SanPham {
    private String MaSanPham;
    private String TenSanPham;
    private String MoTa;
    private int GiaBan;
    private float GiamGia;
    private int ThoiGianCheBien;
    private String HuongDanBaoQuan;
    private int ThoiGianBaoQuan;
    private String DinhDuong;
    private int SoLuongYeuThich;
    private String MaLoaiSP;

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, String moTa, int giaBan, float giamGia, int thoiGianCheBien, String huongDanBaoQuan, int thoiGianBaoQuan, String dinhDuong, int soLuongYeuThich, String maLoaiSP) {
        MaSanPham = maSanPham;
        TenSanPham = tenSanPham;
        MoTa = moTa;
        GiaBan = giaBan;
        GiamGia = giamGia;
        ThoiGianCheBien = thoiGianCheBien;
        HuongDanBaoQuan = huongDanBaoQuan;
        ThoiGianBaoQuan = thoiGianBaoQuan;
        DinhDuong = dinhDuong;
        SoLuongYeuThich = soLuongYeuThich;
        MaLoaiSP = maLoaiSP;
    }

    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        MaSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        TenSanPham = tenSanPham;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public int getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(int giaBan) {
        GiaBan = giaBan;
    }

    public float getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(float giamGia) {
        GiamGia = giamGia;
    }

    public int getThoiGianCheBien() {
        return ThoiGianCheBien;
    }

    public void setThoiGianCheBien(int thoiGianCheBien) {
        ThoiGianCheBien = thoiGianCheBien;
    }

    public String getHuongDanBaoQuan() {
        return HuongDanBaoQuan;
    }

    public void setHuongDanBaoQuan(String huongDanBaoQuan) {
        HuongDanBaoQuan = huongDanBaoQuan;
    }

    public int getThoiGianBaoQuan() {
        return ThoiGianBaoQuan;
    }

    public void setThoiGianBaoQuan(int thoiGianBaoQuan) {
        ThoiGianBaoQuan = thoiGianBaoQuan;
    }

    public String getDinhDuong() {
        return DinhDuong;
    }

    public void setDinhDuong(String dinhDuong) {
        DinhDuong = dinhDuong;
    }

    public int getSoLuongYeuThich() {
        return SoLuongYeuThich;
    }

    public void setSoLuongYeuThich(int soLuongYeuThich) {
        SoLuongYeuThich = soLuongYeuThich;
    }

    public String getMaLoaiSP() {
        return MaLoaiSP;
    }

    public void setMaLoaiSP(String maLoaiSP) {
        MaLoaiSP = maLoaiSP;
    }
}
