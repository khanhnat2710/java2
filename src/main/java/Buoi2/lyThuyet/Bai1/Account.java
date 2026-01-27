package Buoi2.lyThuyet.Bai1;

public class Account {
    private  String owner;
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, String owner) {
        //1.contructor chaining
        this("123456789", "Nguyen Van A", 0);
    }

    public Account(String accountNumber, String owner, double balance) {
        //phân biệt parameter
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public Account deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return this;
    }

    public void transfer(Account target, double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            target.balance += amount;
            logTransaction(target, amount);
        }
    }

    private void logTransaction(Account target, double amount) {
        System.out.println(this.owner + " transfer" + amount + " to " + target.owner);
    }
}
