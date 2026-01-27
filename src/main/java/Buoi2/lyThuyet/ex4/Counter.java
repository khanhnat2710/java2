package Buoi2.lyThuyet.ex4;

public class Counter {
    private static int counter = 0;
    private int nonStaticCounter = 0;

    public Counter() {
        counter++;
        nonStaticCounter++;
    }

    public int getCounter() {
        return counter;
    }

    public int getNonStaticCounter() {
        return nonStaticCounter;
    }
}
