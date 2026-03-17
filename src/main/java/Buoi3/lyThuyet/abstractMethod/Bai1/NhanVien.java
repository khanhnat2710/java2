package Buoi3.lyThuyet.abstractMethod.Bai1;

import java.util.Scanner;

public class NhanVien extends Person{
    private String bangCap;
    public NhanVien(String ma, String ten, String gioiTinh, String ngaySinh, String bangCap) {
        this.bangCap = bangCap;
    }

    public String getBangCap() {
        return bangCap;
    }

    public void setBangCap(String bangCap) {
        this.bangCap = bangCap;
    }

    public void hienThiThongTin() {
        System.out.println(super.toString());
        System.out.println("Bằng cấp: " + bangCap);
    }


}
