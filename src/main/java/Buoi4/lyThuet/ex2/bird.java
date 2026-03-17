package Buoi4.lyThuet.ex2;

public class bird implements Flyable {
    private String name;
    public bird(String name) {
        this.name = name;
    }
    @Override
    public void fly() {
        System.out.println("Bird can fly");
    }
}
