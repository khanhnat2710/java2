package Buoi2.lyThuyet.Bai3;

public class NVKD extends NhanVien{
    private String ngonNgu;
    public NVKD(String mNV, String hoTen, int tuoi, String diaChi, String gioiTinh, String ngonNgu) {
        super(mNV, hoTen, tuoi, diaChi, gioiTinh);
        this.ngonNgu = ngonNgu;
    }
}
