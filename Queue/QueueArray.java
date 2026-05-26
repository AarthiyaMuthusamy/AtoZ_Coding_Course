package Queue;

public class QueueArray {
    int[] arr;
    int size;
    int rear ;
    int front;

    QueueArray(int size){
        this.size = size;
        arr = new int[size];
        rear = -1;
        front = -1;
    }

    public void enqueue(int data){
        if(rear == arr.length-1){
            System.out.println("Queue is overflow");
            return;
        }
        if(front == -1){
            front = 0;
        }

        rear ++;
        arr[rear] = data;
    }

    public void dequeue(){
        if(front == -1 || front > rear){
            System.out.println("Queue is underflow");
            return;
        }
        System.out.println(arr[front] + " removed");
        front++;
    }

    public void peek(){
        if(front == -1 || front > rear){
            System.out.println("Queue is underflow");
            return;
        }
        System.out.println( "Front:" + arr[front]);

    }

    void display(){
        if(front == -1 || front > rear){
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <=  rear ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }




}
