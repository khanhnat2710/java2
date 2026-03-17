package Buoi4.lyThuet.Bai3;

import java.util.List;

public class MoveableCircle implements Moveable {
    public int radius;
    public MoveablePoint center;

    public MoveableCircle(int radius, MoveablePoint moveablePoint) {
        this.radius = radius;
        this.center = moveablePoint;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MoveableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
