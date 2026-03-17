package Buoi7.LyThuyet.Bai1;

public class Main {
    public static void main(String[] args) {
        Bonus salesBonus = new SalesBonus();
        Employee emp = new Employee(10000, salesBonus);

        System.out.println("Tong tien emp nhan duoc: " + emp.calculateTotalIncome());

        Bonus PerformanceBonus = new PerformanceBonus();
        emp.setBonus(PerformanceBonus);

        System.out.println("Tong tien emp nhan duoc: " + emp.calculateTotalIncome());
    }
}
