package bai_tap;

import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack();
        Stack<Integer> stackReverse= new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        while (!stack.isEmpty()){
            stackReverse.push(stack.pop());
        }
        System.out.println(stackReverse);
    }

}
