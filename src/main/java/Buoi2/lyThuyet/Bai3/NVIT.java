package Buoi2.lyThuyet.Bai3;

public class NVIT extends NhanVien{
    private String ngonNguLapTrinh;
    private int soDuAnDangLam;
    public NVIT(String mNV, String hoTen, int tuoi, String diaChi, String gioiTinh, String ngonNguLapTrinh, int soDuAnDangLam) {
        super(mNV, hoTen, tuoi, diaChi, gioiTinh);
        this.ngonNguLapTrinh = ngonNguLapTrinh;
        this.soDuAnDangLam = soDuAnDangLam;
    }
}
