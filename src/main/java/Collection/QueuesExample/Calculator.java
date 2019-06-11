package Collection.QueuesExample;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Calculator {

    public static int calculate( final String input){

        Deque<String> stack = new ArrayDeque<>();

        String[] token = input.split(" ");
        Arrays.stream(token).forEach( t -> {
            stack.push(t);
        });

        while (stack.size() >1){
            int left = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int right = Integer.parseInt(stack.pop());
            int result = 0;

            switch (operator){
                case "+":
                {
                     result = left + right;
                    break;
                }
                case "-":{
                    result = left - right;
                    break;
                }

            }
            stack.push(result +"");
        }
        return Integer.parseInt(stack.pop());
    }

    public static void main(String[] args) {
        System.out.println(Calculator.calculate("2 - 3"));
    }
}
