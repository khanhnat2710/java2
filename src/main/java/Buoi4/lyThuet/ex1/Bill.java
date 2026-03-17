package Buoi4.lyThuet.ex1;

public class Bill {
    private String name;
    private String phone;
    private String address;
    private Payment payment;

    public Bill(String name, String phone, String address, Payment payment) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.payment = payment;
    }
}
