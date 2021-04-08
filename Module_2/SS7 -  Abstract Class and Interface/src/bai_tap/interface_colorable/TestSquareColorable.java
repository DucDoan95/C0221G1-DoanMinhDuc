package bai_tap.interface_colorable;

public class TestSquareColorable {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];
        shape[0] = new Square();
        shape[1] = new Rectangle();
        for (Shape shape1 : shape) {
            System.out.println(shape1);
        }
        for (Shape colorable : shape) {
            if (colorable instanceof Colorable) {
                System.out.println(colorable + "\nCó colorable");
                ((Colorable) colorable).howToColor();
            } else {
                System.out.println(colorable + "\nKhông có colorable");
            }
        }

    }
}
