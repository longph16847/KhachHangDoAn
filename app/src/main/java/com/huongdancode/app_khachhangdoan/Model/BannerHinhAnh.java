package com.huongdancode.app_khachhangdoan.Model;

public class BannerHinhAnh {
    private String HinhAnh;
    private String SanPham;

    public BannerHinhAnh() {
    }

    public BannerHinhAnh(String hinhAnh, String sanPham) {
        HinhAnh = hinhAnh;
        SanPham = sanPham;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        HinhAnh = hinhAnh;
    }

    public String getSanPham() {
        return SanPham;
    }

    public void setSanPham(String sanPham) {
        SanPham = sanPham;
    }
}
