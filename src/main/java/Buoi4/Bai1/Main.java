package Buoi4.Bai1;

import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("=============== MENU ===============");
        System.out.println("1. Thêm sách");
        System.out.println("2. Thêm độc giả");
        System.out.println("3. Hiển thị danh sách");
        System.out.println("4. Hiển thị độc giả");
        System.out.println("0. Thoát chương trình");
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        QuanLyThuVien qltv = new QuanLyThuVien();
        int choice;
        boolean next = true;
        do {
            menu();
            System.out.println("Nhap su lua chon cua ban: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:{
                    System.out.println("Them sach moi!");
                    qltv.themSach();
                    break;
                }
                case 3:{
                    System.out.println("Hien thi danh sach!");
                    qltv.HienThiDanhSach();
                    break;
                }
                case 0:{
                    System.out.println("Thoat chuong trinh!");
                    next = false;
                    break;
                }
            }
        } while (next);
    }
}
