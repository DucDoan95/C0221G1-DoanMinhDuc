package bai_tap.interface_resizeable;

public class TestResizeable {
    public static void main(String[] args) {
        Shape[] shape=new Shape[3];
        shape[0] = new Circle();
        shape[1] = new Square();
        shape[2] = new Rectangle();
        for(Shape shape1: shape){
            System.out.println(shape1);
        }
        double random = Math.random()*100;
        for(Shape shape2: shape){
            shape2.resize(random);
            System.out.println(shape2);
        }
    }
}
