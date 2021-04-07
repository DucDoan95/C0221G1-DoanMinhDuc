package bai_tap.class_circle_and_class_cylinder;

public class Cylinder extends Circle{
    private double high;

    public Cylinder() {
    }

    public Cylinder(double high) {
        this.high = high;
    }

    public Cylinder(double radius, String color, double high) {
        super(radius, color);
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
    public double getAreaCylinder(){
        return 2*Math.PI*(getRadius()*getHigh());
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "high=" + high +super.toString()+
                "Area Cylinder = "+getAreaCylinder()+
                '}';
    }
}
