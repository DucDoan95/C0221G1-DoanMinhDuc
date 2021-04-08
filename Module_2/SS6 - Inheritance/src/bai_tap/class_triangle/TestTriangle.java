package bai_tap.class_triangle;

import thuc_hanh.Shape;

public class TestTriangle {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        System.out.println(shape);
        triangle = new Triangle(2,2,2,"bule",false);

        System.out.println(triangle);
        System.out.println(shape);
    }
}
