package Queue;

public class Main {
    public static void main(String[] args) {
        /*
        QueueArray queue = new QueueArray(5);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.display();
        queue.peek();
        queue.dequeue();
        queue.peek();
        queue.enqueue(8);
        queue.display();
        //queue.enqueue(8);


         */

        /*
        QueueLinkedList queue = new QueueLinkedList();
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.display();
        queue.dequeue();
        queue.enqueue(6);
        queue.display();

         */

        QueueCircular queue = new QueueCircular(6);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.display();
        queue.dequeue();
        queue.enqueue(3);
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.display();
        queue.enqueue(2);
        queue.enqueue(1);
        queue.display();
        queue.enqueue(0);





    }
}
