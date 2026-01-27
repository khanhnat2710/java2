package Buoi2.lyThuyet.ex2;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String address;

    public Employee(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Employee(int id, String name, int age) {
        this(id, name, age, "HN");
    }

    public Employee(int id, String name) {
        this(id, name, 18);
    }

    public Employee(int id) {
        this(id, "tran duc hieu");
    }

    public Employee() {
        this(1);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
