package bai_tap.interface_resizeable;

import bai_tap.interface_colorable.Colorable;

public class Square  extends Shape implements Colorable,Resizeable {
    double side =1;
    public Square() {
    }

    public Square(double side) {

    }

    public Square(double side, String color, boolean filled) {

    }

    public double getSide(){
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }



    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    public double geArea(){
        return side*side;
    }
    public double getPerimeter(){
        return 2*(side+side);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }


    @Override
    public void resize(double percent) {
        this.side= side+(side*percent/100);
    }
}
