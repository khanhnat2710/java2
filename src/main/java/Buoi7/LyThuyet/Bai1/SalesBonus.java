package Buoi7.LyThuyet.Bai1;

public class SalesBonus implements Bonus {
    @Override
    public double caculateBonus(double salary) {
        return salary * 0.2;
    }
}
