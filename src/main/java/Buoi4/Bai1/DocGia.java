package Buoi4.Bai1;

public class DocGia {
    private String maDocGia;
    private String tenDocGia;
    private int soDienThoai;
    private String loaiThe;
    private int ngayDangKy;

    public DocGia(String maDocGia, String tenDocGia, int soDienThoai, String loaiThe, int ngayDangKy) {
        this.maDocGia = maDocGia;
        this.tenDocGia = tenDocGia;
        this.soDienThoai = soDienThoai;
        this.loaiThe = loaiThe;
        this.ngayDangKy = ngayDangKy;
    }

    public String getMaDocGia() {
        return maDocGia;
    }

    public void setMaDocGia(String maDocGia) {
        this.maDocGia = maDocGia;
    }

    public String getTenDocGia() {
        return tenDocGia;
    }

    public void setTenDocGia(String tenDocGia) {
        this.tenDocGia = tenDocGia;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getLoaiThe() {
        return loaiThe;
    }

    public void setLoaiThe(String loaiThe) {
        this.loaiThe = loaiThe;
    }

    public int getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(int ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public String thongTinDocGia() {
        return "DocGia{" +
                "maDocGia='" + maDocGia + '\'' +
                ", tenDocGia='" + tenDocGia + '\'' +
                ", soDienThoai=" + soDienThoai +
                ", loaiThe='" + loaiThe + '\'' +
                ", ngayDangKy=" + ngayDangKy +
                '}';
    }
}
