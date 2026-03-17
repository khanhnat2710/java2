package Buoi7.LyThuyet.Bai1;

public class Employee {
    private double salary;
    private Bonus bonus;

    public Employee(double salary, Bonus bonus){
        this.salary = salary;
        this.bonus = bonus;
    }

    public void setBonus(Bonus bonus){
        this.bonus = bonus;
    }

    public double calculateTotalIncome(){
        return salary + bonus.caculateBonus(salary);
    }
}
