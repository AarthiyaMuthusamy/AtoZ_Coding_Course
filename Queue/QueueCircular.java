package Queue;

public class QueueCircular {
    int[] arr;
    int size;
    int rear ;
    int front;

    QueueCircular(int size){
        this.size = size;
        arr = new int[size];
        rear = -1;
        front = -1;
    }

    public void enqueue(int data){
        if(front == (rear + 1) % arr.length){
            System.out.println("Queue is overflow");
            return;
        }
        else if(front == -1 && rear == -1){
            front = 0;
            rear = 0;
            arr[rear] = data;
        }
        else{
            rear = (rear + 1) % arr.length;
            arr[rear] = data;
        }


    }

    public void dequeue() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is underflow");
            return;
        } else if (front == rear) {
            System.out.println(arr[front] + " removed");
            front = -1;
            rear = -1;
        } else {
            System.out.println(arr[front] + " removed");
            front = (front + 1) % arr.length;
        }

    }


    public void peek(){
        if(front == -1 || front > rear){
            System.out.println("Queue is underflow");
            return;
        }
        System.out.println( "Front:" + arr[front]);

    }

    void display(){
        if(front == -1 && rear == -1){
            System.out.println("Queue is Empty");
            return;
        }
        else{
            int i = front;
            while (i != rear){
                System.out.print(arr[i] +  " ");
                i = (i+1) % arr.length;
            }
            System.out.println(arr[rear]);
        }



    }

}
