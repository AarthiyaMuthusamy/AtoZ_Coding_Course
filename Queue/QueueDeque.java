package Queue;

import java.util.Deque;
import java.util.ArrayDeque;

public class QueueDeque {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.addLast(3);
        queue.addLast(5);
        queue.addLast(6);
        System.out.println(queue);
        System.out.println(queue.pollFirst());
        System.out.println(queue);
        System.out.println(queue.peekFirst());

    }
}
