package Buoi2.lyThuyet.ex2;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.toString());
        Employee e1 = new Employee(2, "nguyen van a");
        System.out.println(e1.toString());
        Employee e2 = new Employee(3, "nguyen van b", 25);
        System.out.println(e2.toString());
        Employee e3 = new Employee(4, "nguyen van c", 36, "TH");
        System.out.println(e3.toString());
    }
}
