package optional_bai_tap.check_bracket_use_stack;

import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String bracket = "s * (s – a)() * (s – b) * (s – c)";
        for (int i = 0; i < bracket.length(); i++) {
            if(bracket.charAt(i)=='('){
                stack.push(bracket.charAt(i));
            } else if(bracket.charAt(i)==')'&& !stack.isEmpty()){
                stack.pop();
            }else if(bracket.charAt(i)==')'){
                stack.push(bracket.charAt(i));
            }
        }
        if(stack.isEmpty() == true){
            System.out.println("true");
        }else
            System.out.println("false");
    }
}
