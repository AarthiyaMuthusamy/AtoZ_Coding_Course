package Queue;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class QueueLinkedList {
    Node front = null;
    Node rear = null;

    public void enqueue(int data){
        Node node = new Node(data);

        if(rear == null){
            front = rear = node;
        }
        else{
            rear.next = node;
            rear = node;
        }

    }

    public void dequeue(){
        if(front == null){
            System.out.println("Can't remove");
            return;
        }
        System.out.println(front.data + " removed");
        front =front.next;
        if(front == null){
            rear = null;
        }
    }

    void display(){
        Node temp = front;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
