package Buoi2.lyThuyet.Bai3;

public class NVVP extends NhanVien {
    private String chuyenMon;

    public NVVP(String mNV, String hoTen, int tuoi, String diaChi, String gioiTinh, String chuyenMon) {
        super(mNV, hoTen, tuoi, diaChi, gioiTinh);
        this.chuyenMon = chuyenMon;
    }
}
