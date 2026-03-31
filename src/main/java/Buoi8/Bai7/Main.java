package Buoi8.Bai7;

public class Main {
    public static void main(String[] args) {
        dichVu sms = new SMS();
        dichVu email = new Email();
        KhachHang tbSMS = new KhachHang(sms);
        KhachHang tbEmail = new KhachHang(email);
        tbSMS.thongBao("Thong bao qua SMS");
        tbEmail.thongBao("Thong bao qua Email");
    }
}
