package bai_tap.access_modifier;

public class Circle {
    private double radius = 1.0;
    private  String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }
    protected double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }
}
