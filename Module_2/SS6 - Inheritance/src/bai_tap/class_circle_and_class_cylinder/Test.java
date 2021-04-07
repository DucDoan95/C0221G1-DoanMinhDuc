package bai_tap.class_circle_and_class_cylinder;

public class Test {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(5.0);
        System.out.println(cylinder);
        cylinder = new Cylinder(4.0,"blue",8.0);
        System.out.println(cylinder);
    }
}
