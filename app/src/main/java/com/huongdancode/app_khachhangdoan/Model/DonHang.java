package com.huongdancode.app_khachhangdoan.Model;

import java.util.List;

public class DonHang {
    private String MaDonHang;
    private int ThoiGian;
    private int TongTien;
    private String TrangThai;
    private String GhiChu;
    private String MaKhachHang;
    private String MaNguoiGiaoHang;
    private List<DonHangChiTiet> donHangChiTiets;

    public DonHang() {
    }

    public DonHang(String maDonHang, int thoiGian, int tongTien, String trangThai, String ghiChu, String maKhachHang, String maNguoiGiaoHang, List<DonHangChiTiet> donHangChiTiets) {
        MaDonHang = maDonHang;
        ThoiGian = thoiGian;
        TongTien = tongTien;
        TrangThai = trangThai;
        GhiChu = ghiChu;
        MaKhachHang = maKhachHang;
        MaNguoiGiaoHang = maNguoiGiaoHang;
        this.donHangChiTiets = donHangChiTiets;
    }

    public String getMaDonHang() {
        return MaDonHang;
    }

    public void setMaDonHang(String maDonHang) {
        MaDonHang = maDonHang;
    }

    public int getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(int thoiGian) {
        ThoiGian = thoiGian;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int tongTien) {
        TongTien = tongTien;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String trangThai) {
        TrangThai = trangThai;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String ghiChu) {
        GhiChu = ghiChu;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        MaKhachHang = maKhachHang;
    }

    public String getMaNguoiGiaoHang() {
        return MaNguoiGiaoHang;
    }

    public void setMaNguoiGiaoHang(String maNguoiGiaoHang) {
        MaNguoiGiaoHang = maNguoiGiaoHang;
    }

    public List<DonHangChiTiet> getDonHangChiTiets() {
        return donHangChiTiets;
    }

    public void setDonHangChiTiets(List<DonHangChiTiet> donHangChiTiets) {
        this.donHangChiTiets = donHangChiTiets;
    }
}
