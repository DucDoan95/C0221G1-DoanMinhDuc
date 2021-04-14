package optional_bai_tap.decimal_exchange_binary;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DecimalExchange {
    public void Binary(int num){
        Stack stack = new Stack() {
        };
        int temp =0;
        while (num!=0){
            stack.push(num%2);
            num = num/2;
        }
        while (stack.size()>0){
            System.out.print(stack.pop());
        }
    }

    public static void main(String[] args) {
        DecimalExchange decimalExchange = new DecimalExchange();
        decimalExchange.Binary(10);
    }
}
