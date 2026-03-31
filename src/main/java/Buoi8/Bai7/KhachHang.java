package Buoi8.Bai7;

public class KhachHang {
    private dichVu dichVu;

    public KhachHang(dichVu dichVu) {
        this.dichVu = dichVu;
    }

    public void thongBao(String tinNhan) {
        dichVu.thongBao(tinNhan);
    }
}
