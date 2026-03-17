package Buoi4.Bai1;

public class Sach {
    private String maSach;
    private String tenSach;
    private String tenTacGia;
    private String theLoai;
    private String namXuatBan;

    public Sach(String maSach, String tenSach, String tenTacGia, String theLoai, String namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.theLoai = theLoai;
        this.namXuatBan = namXuatBan;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(String namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public String thongTinSach() {
        return "Sach{" +
                "maSach='" + maSach + '\'' +
                ", tenSach='" + tenSach + '\'' +
                ", tenTacGia='" + tenTacGia + '\'' +
                ", theLoai='" + theLoai + '\'' +
                ", namXuatBan=" + namXuatBan +
                '}';
    }
}
