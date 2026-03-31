package chuaBai;

public class TuitionCalculator {
    private static final long PRICE_PER_CREDIT = 450000;

    public static double calculate(Student s){
        return s.getRegisteredCredits() * PRICE_PER_CREDIT;
    }
}
