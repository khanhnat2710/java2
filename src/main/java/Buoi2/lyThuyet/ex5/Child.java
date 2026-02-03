package Buoi2.lyThuyet.ex5;

public class Child extends Parent{
    public Child(String house, String car) {
        super(house, car);
    }

    @Override
    public void display() {
        System.out.println("Child: Car = " + super.car);
    }
}
