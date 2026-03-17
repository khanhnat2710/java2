package Buoi7.LyThuyet.Bai1;

public class PerformanceBonus implements Bonus {
    @Override
    public double caculateBonus(double salary) {
        return salary * 0.1;
    }
}
