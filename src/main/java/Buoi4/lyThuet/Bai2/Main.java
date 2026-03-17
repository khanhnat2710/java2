package Buoi4.lyThuet.Bai2;

public class Main {
    public static void main(String[] args) {
        Product p = new Product("p1", 3000);
        catalog c = new catalog("ca");
        c.addProduct(p);
    }
}
