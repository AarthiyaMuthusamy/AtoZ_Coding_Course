package Stack;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data  = data;
    }

}
public class StackLinkedlist {
    Node top;

    public void push(int data){
        Node node = new Node(data);

        node.next = top;
        top = node;

    }

    public int pop(){
        if(top == null){
            System.out.println("Empty");
            return -1;
        }

        int value = top.data;
        top = top.next;
        return value;
    }

    public int peek(){
        if(top == null){
            System.out.println("Empty");
            return -1;
        }
        return top.data;
    }
    public void display(){
        Node temp =  top;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
