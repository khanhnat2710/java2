package Buoi3.lyThuyet.abstractMethod.Bai1;

public class KhachHang extends Person {
    private String loaiKhachHang;
    public KhachHang(String ma, String ten, String gioiTinh, String ngaySinh, String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }
    public void hienThiThongTin() {
        System.out.println(super.toString());
        System.out.println("Loại khách hàng: " + loaiKhachHang);
    }
}
