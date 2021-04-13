package optional_bai_tap.palindrome_use_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Queue<Character> queue = new LinkedList<>();
        Stack stack = new Stack();
        String palindrome = "Able was I ere I saw Elba";
        boolean check = true;
        palindrome = palindrome.toLowerCase();

        for(int i=0;i<palindrome.length();i++){
            stack.push(palindrome.charAt(i));
            queue.add((palindrome.charAt(i)));
        }
        for (int i=0;i<palindrome.length();i++){
            if(stack.pop()!=queue.remove()){
                check = false;
                break;
            }
        }
        if(check == true){
            System.out.println("đối xứng");
        }else {
            System.out.println("không đối xứng");
        }
//        for (int i = palindrome.length() - 1; i >= palindrome.length() / 2; i--) {
//            queue.add(palindrome.charAt(i));
//        }
////        for(int i=0;i<palindrome.length()/2;i++){
////            if(palindrome.charAt(i)!=queue.remove()){
////                check=false;
////                break;
////            }
////        }
////        System.out.println(check);

    }


}
