package Queue;


import java.util.LinkedList;
import java.util.Queue;

public class QueuePackage {
    public static void main(String[] args) {
        Queue<Integer> queue  = new LinkedList<>();
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());


    }
}
