package bai_tap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class QuadraticEquation {
    double a ,b,c;
    public QuadraticEquation(){

    }
    public QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getDiscriminant(){
        return (Math.pow(b,2) - (4*a*c));
    }
    public double getRoot1(){
        return ((-b+Math.sqrt(getDiscriminant()))/(2*a));
    }
    public double getRoot2(){
        return ((-b-Math.sqrt(getDiscriminant()))/(2*a));
    }
    public double getValueX(){
        return (-b/(2*a));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant()>0){
            System.out.print("The equation has two roots: "+quadraticEquation.getRoot1()+" and "+quadraticEquation.getRoot2());
        }else if(quadraticEquation.getDiscriminant()==0){
            System.out.print("The equation has two roots: "+ quadraticEquation.getValueX());
        }else {
            System.out.print("The equation has no real roots");
        }
    }
}
