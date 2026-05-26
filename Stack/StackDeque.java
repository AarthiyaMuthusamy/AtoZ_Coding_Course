package Stack;
//stack is an old class , modern java prefers interfaces
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

//this is main concept
public class StackDeque {
    public static void main(String[] args) {
      /*
        Deque<Integer> stack = new LinkedBlockingDeque<>(2); //using the fixed capacity in the deque it gives error when enter the value

        stack.offerFirst(3);
        stack.offerFirst(4);
        System.out.println(stack.offerFirst(5));

        */

        //it's faster than stack

        Deque<Integer> stack1 = new ArrayDeque<>();
        stack1.addFirst(3);
        stack1.addFirst(4);
        stack1.addFirst(5);
        stack1.addFirst(6);
        System.out.println(stack1.peekFirst());
        System.out.println(stack1);
    }
}
