package Buoi2.lyThuyet.ex3;

public class Main {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
        System.out.println(db1);
        System.out.println(db2);
    }
}
