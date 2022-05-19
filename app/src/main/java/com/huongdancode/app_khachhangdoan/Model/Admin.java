package com.huongdancode.app_khachhangdoan.Model;

import java.util.HashMap;
import java.util.Map;

public class Admin {
    private String TaiKhoan;
    private String MatKhau;
    private Permission permission;

    public Admin() {
    }

    public Admin(String taiKhoan, String matKhau, Permission permission) {
        TaiKhoan = taiKhoan;
        MatKhau = matKhau;
        this.permission = permission;
    }

    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        TaiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String matKhau) {
        MatKhau = matKhau;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public Map<String , Object> toMap(){
        HashMap<String , Object> map = new HashMap<String, Object>();
        map.put("MatKhau", MatKhau);
        map.put("permisson", permission);

        return map;
    }

}


