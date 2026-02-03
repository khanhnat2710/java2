package Buoi3.lyThuyet.abstractMethod;

public class Officer extends Employee{
    private double ngayCong;
    private double luongCoBan = 1000;

    public Officer(String name, int age, String phongBan) {
        super(name, age, phongBan);
    }

    @Override
    public double tinhLuong() {
        return ngayCong * luongCoBan;
    }

    @Override
    public void diemDanh() {
        System.out.println("Officer đang điểm danh");
    }
}
