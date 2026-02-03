package Buoi2.lyThuyet.ex5;

public class Parent {
    private String house;
    protected String car;

    public Parent(String house, String car) {
        this.house = house;
        this.car = car;
    }

    public void display() {
        System.out.println("Parent: House = " + house + ", Car = " + car);
    }
}
