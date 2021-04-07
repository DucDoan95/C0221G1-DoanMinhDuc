package bai_tap;

import java.lang.reflect.Member;

public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public Fan(){

    }
    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
       this.speed=speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setOn(boolean on) {
        this.on = on;
    }


    @Override
    public String toString() {
        if(on==true){
            return "{" +
                    "speed=" + speed +
                    ", color='" + color + '\'' +
                    ", radius=" + radius +
                    ", fan is on"+
                    '}';
        }
        return "{" +
                "color='" + color + '\'' +
                ", radius= " + radius +
                ", fan is off"+
                '}';
    }


    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setOn(false);
        System.out.println("Fan 1 "+fan1.toString());
        System.out.println("Fan 2 "+fan2.toString());
    }
}


