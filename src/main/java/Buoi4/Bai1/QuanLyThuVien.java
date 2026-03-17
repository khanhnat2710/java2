package Buoi4.Bai1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyThuVien {
    List<Sach> dsSach;
    List<DocGia> dsDocGia;
    public static Scanner sc = new Scanner(System.in);

    public QuanLyThuVien() {
        dsSach = new ArrayList<>();
        dsDocGia = new ArrayList<>();
    }

    public void themSach() {
        //1. Mã sách (B001)
        String maSach;
        while (true) {
            System.out.print("Nhập mã sách (bắt đầu bằng 'B' và theo sau là các con số): ");
            maSach = sc.nextLine().trim();
            if (!maSach.startsWith("B")){
                System.out.println("Mã sách phải bắt đầu bằng chữ 'B'. Nhập lại!");
                continue;
            }
            String phanSo = maSach.substring(1);
            if (phanSo.isEmpty() || !phanSo.matches("\\d+")) {
                System.out.println("Sau chữ 'B' phải là các con số");
                continue;
            }
            break;
        }

        //2. Tên sách
        String tenSach;
        while (true) {
            System.out.println("Nhập tên sách: ");
            tenSach = sc.nextLine().trim();
            if (tenSach.isEmpty()) {
                System.out.println("Tên sách không được để trống. Nhập lại!");
                continue;
            }
            break;
        }

        //3. Tên tác giả
        String tenTacGia;
        while (true) {
            System.out.println("Nhập tên tác giả: ");
            tenTacGia = sc.nextLine().trim();
            if (tenTacGia.isEmpty()) {
                System.out.println("Tên tác giả không được để trống. Nhập lại!");
                continue;
            }
            break;
        }

        //4. thể loại
        String theLoai = null;
        while (true) {
            System.out.println("Chọn thể loại: ");
            System.out.println("1. Giáo khoa");
            System.out.println("2. Văn học");
            System.out.println("3. Khoa học");
            String input = sc.nextLine().trim();
            switch (input) {
                case "1":{
                    theLoai = "Giáo khoa";
                    break;
                }
                case "2":{
                    theLoai = "Văn học";
                    break;
                }
                case "3":{
                    theLoai = "Khoa học";
                    break;
                }
                default:{
                    System.out.println("Lựa chọn không hopej lệ!");
                    continue;
                }
            }
            break;
        }

        //5. Năm xuất bản
        String namXuatBan = NhapNamXuatBan();

        Sach s = new Sach(maSach, tenSach, tenTacGia, theLoai, namXuatBan);
        dsSach.add(s);
    }

    //Năm xuất bản
    private String NhapNamXuatBan() {
        while (true) {
            System.out.println("Nhập năm xuất bản (4 chữ số): ");
            String namXuatBan = sc.nextLine().trim();
            if (namXuatBan.length() != 4) {
                System.out.println("Độ dài của năm xuất bản không hopej lệ. Nhập lại!");
                continue;
            }
            if (!namXuatBan.matches("\\d{4}")) {
                System.out.println("Năm xuất bản phải là số. Nhập lại!");
                continue;
            }
            return namXuatBan;
        }
    }

    public void HienThiDanhSach() {
        if (dsSach.isEmpty()) {
            System.out.println("Danh sách sách trống!");
            return;
        }
        for (Sach s : dsSach) {
            System.out.println(s.thongTinSach());
        }
    }
}
