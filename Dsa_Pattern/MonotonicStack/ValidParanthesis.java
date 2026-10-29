package Dsa_Pattern.MonotonicStack;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "(])"; //]  //()  //([{}]) //([)] //{[()]} //{[(])} //((( // )))
         System.out.println(checkValid(s));

    }
    public static boolean checkValid(String s){
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{

                if(!stack.isEmpty()) {
                    if (ch == ')' && stack.peek() == '(') {
                        stack.pop();
                    } else if ( ch == '}' && stack.peek() == '{') {
                        stack.pop();
                    } else if ( ch == ']' && stack.peek() == '[') {
                        stack.pop();
                    }
                    else{
                        return false;
                    }

                }else {
                    return false;
                }


            }

        }
        return stack.isEmpty();
        /* leetcode optimized version
         Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{

                if(stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (ch == ')' && top != '(' || ch == '}' && top != '{' || ch == ']' && top != '[') {
                       return false;

                }

            }
        }
                  return stack.isEmpty();
         */
    }
}
