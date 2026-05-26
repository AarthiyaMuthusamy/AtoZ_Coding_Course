package Collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.add(1);
        stk.add(2);
        System.out.println(stk.peek());
        System.out.println(stk);
        stk.remove(0);
        System.out.println(stk);

    }
}
