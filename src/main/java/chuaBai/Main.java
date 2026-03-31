package chuaBai;

import java.util.Scanner;

public class Main {
    private static IStudentService service = new StudentServiceImpl();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Dữ liệu mẫu
        service.addStudent(new Student("SV01", "Nguyen Van A", "IT", 3.8, 20));
        service.addStudent(new Student("SV02", "Le Thi B", "Business", 3.2, 18));
        while (true) {
            System.out.println("\n--- HỆ THỐNG QUẢN LÝ SINH VIÊN ---");
            System.out.println("1. Thêm sinh viên mới");
            System.out.println("2. Cập nhật thông tin sinh viên");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Tìm sinh viên theo mã");
            System.out.println("5. Lọc sinh viên xuất sắc");
            System.out.println("6. Sắp xếp theo GPA giảm dần");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> inputNewStudent();
                case 2 -> updateStudentInfo();
                case 3 -> {
                    System.out.println("\nDANH SÁCH SINH VIÊN:");
                    service.displayAll();
                }
                case 4 -> findStudent();
                case 5 -> service.getExcellentStudents().forEach(System.out::println);
                case 6 -> {
                    service.sortByGpaDescending();
                    service.displayAll();
                }
                case 0 -> System.exit(0);
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    // Chức năng THÊM MỚI (SRP: Tách biệt nhập liệu)
    private static void inputNewStudent() {
        System.out.println("--- NHẬP THÔNG TIN SINH VIÊN MỚI ---");
        System.out.print("Mã SV: "); String id = sc.nextLine();

        // Kiểm tra trùng mã ngay tại lớp UI trước khi gọi service
        if (service.findById(id) != null) {
            System.out.println("Lỗi: Mã sinh viên này đã tồn tại trên hệ thống!");
            return;
        }

        System.out.print("Họ tên: ");
        String name = sc.nextLine();
        System.out.print("Ngành học: ");
        String major = sc.nextLine();
        System.out.print("GPA: ");
        double gpa = Double.parseDouble(sc.nextLine());
        System.out.print("Số tín chỉ đăng ký: ");
        int credits = Integer.parseInt(sc.nextLine());

        Student newStudent = new Student(id, name, major, gpa, credits);
        service.addStudent(newStudent);
        System.out.println("Thêm thành công!");
    }

    // Chức năng CẬP NHẬT (Tìm trước - Sửa sau)
    private static void updateStudentInfo() {
        System.out.print("Nhập mã SV cần cập nhật: ");
        String id = sc.nextLine();
        Student existing = service.findById(id);

        if (existing == null) {
            System.out.println("Không tìm thấy sinh viên có mã: " + id);
            return;
        }

        System.out.println("Thông tin hiện tại: " + existing);
        System.out.println("--- NHẬP THÔNG TIN MỚI (Mã SV không được sửa) ---");
        System.out.print("Họ tên mới: "); String name = sc.nextLine();
        System.out.print("Ngành mới: "); String major = sc.nextLine();
        System.out.print("GPA mới: "); double gpa = Double.parseDouble(sc.nextLine());
        System.out.print("Tín chỉ mới: "); int credits = Integer.parseInt(sc.nextLine());

        service.updateStudent(id, name, major, gpa, credits);
        System.out.println("Cập nhật thành công!");
    }

    private static void findStudent() {
        System.out.print("Nhập mã SV cần tìm: ");
        String id = sc.nextLine();
        Student s = service.findById(id);
        if (s != null) {
            System.out.println(s);
            System.out.println("Học phí dự kiến: " + String.format("%,.0f", TuitionCalculator.calculate(s)) + " VNĐ");
        } else {
            System.out.println("Không tìm thấy!");
        }
    }
}
