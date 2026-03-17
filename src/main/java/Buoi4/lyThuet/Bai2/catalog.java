package Buoi4.lyThuet.Bai2;

import java.util.ArrayList;
import java.util.List;

public class catalog {
    private String name;
    private List<Product> products;
    public catalog(String name) {
        this.name = name;
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }
}
