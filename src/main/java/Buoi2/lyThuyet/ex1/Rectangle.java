package Buoi2.lyThuyet.ex1;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle() {
        this.width = 3;
        this.length = 5;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double value) {
        this.width = value;
        this.length = value;
    }

    public void display() {
        System.out.println("width: " + width + " length: " + length);
    }
}
