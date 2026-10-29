package Dsa_Pattern.MonotonicStack;

import java.util.Stack;

public class EvaluateReversePolish {
    public static void main(String[] args) {
        String[] str = {"2","1","+","3","*"};
        System.out.println(evaluateExpression(str));
    }

    public static int evaluateExpression(String[] tokens){
        Stack<Integer> stack = new Stack<>();
        for (String ch : tokens){
            if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")){

                int second = stack.pop();
                int first = stack.pop();
                int result = switch (ch) {
                    case "+" -> first + second;
                    case "-" -> first - second;
                    case "*" -> first * second;
                    case "/" -> first / second;
                    default -> 0;
                };
                stack.push(result);
            }
            else {
                int val = Integer.parseInt(ch);
                stack.push(val);
            }

        }
        return stack.peek();
    }
}
