package bai_tap.class_point_and_moveablepoint;

public class TestMove {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(3,5);
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(1,2,3,4);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
    }
}
