package bai_tap.access_modifier;

import bai_tap.access_modifier.Circle;

public class TestCircle extends Circle{
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}
