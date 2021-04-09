package thuc_hanh.refactoring_variable_constant;

import static thuc_hanh.refactoring_variable_constant.Calculator.*;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println(Calculator.calculate(20,10,ADDITION));
        System.out.println(Calculator.calculate(20,10,SUBTRACTION));
        System.out.println(Calculator.calculate(20,10,MULTIPLICATION));
        System.out.println(Calculator.calculate(20,10,DIVISION));
    }
}
