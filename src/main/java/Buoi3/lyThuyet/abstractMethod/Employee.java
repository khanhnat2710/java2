package Buoi3.lyThuyet.abstractMethod;
/*
* Được coi kà khuôn mẫu của các class để kế thừa
* Abstract class được khai báo bằng từ khóa abstract
* Không khởi tạo đối tượng được từ abstract class
* Trong abstract class có thể có: thuộc tính, phương thức thường, phuong thức trừu tượng
*/
public abstract class Employee {
    private String name;
    private int age;
    private String phongBan;

    public Employee(String name, int age, String phongBan) {
        this.name = name;
        this.age = age;
        this.phongBan = phongBan;
    }

/*
* Abstract Method:
* + Là phương thức không có thân hàm
* + Các lớp kế thừa lớp Abstract phải Override lại phương thức abstract
*/

    public abstract double tinhLuong();
    public abstract void diemDanh();

}
