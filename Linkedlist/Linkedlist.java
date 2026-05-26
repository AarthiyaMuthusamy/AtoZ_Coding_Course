package Linkedlist;

class Node{
    private int data;
    private Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public void setData(int data){
        this.data = data;
    }
    public void setNext(Node node){
        this.next = node;
    }

    public int getData(){
       return this.data;
    }

    public Node getNext(){
        return this.next;
    }

}


public class Linkedlist {
    private Node head;
    private Node tail;

    public Node getHead(){
        return this.head;
    }
    public Node getTail(){
        return this.tail;
    }
    //O(1)
    public void addAtEnd(int data){
        Node node = new Node(data);

        //check no value is present
        if(this.head == null)
            this.head = this.tail = node;

        else{
            this.tail.setNext(node);
            this.tail = node;
            }

    }

    //O(1)
    public void addAtBeginning(int data){
        Node node = new Node(data);

        if (this.head == null)
            this.head = this.tail = node;
        else {
            node.setNext(head);
            this.head = node;
        }
    }

    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.getData() + " -> " );
            temp = temp.getNext();
        }
    }

    public Node find(int data){
        Node temp = head;

        while (temp != null){
            if(temp.getData() == (data)){
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    public void insertAfter(int data, int dataBefore) {
        Node node = new Node(data);

        if (this.head == null)
            this.head = this.tail = node;
        else {
            Node nodeBefore = find(dataBefore);
            if (nodeBefore != null) {
                node.setNext(nodeBefore.getNext());
                nodeBefore.setNext(node);

                if (nodeBefore == this.tail)
                    this.tail = node;

            } else
                System.out.println("Not found");

        }
    }

    public void delete(int data){
        if(this.head == null)
            System.out.println("lIst is empty");
        else{
            Node node = this.find(data);
            if(node == null)
                System.out.println("not found");
            else if(this.head == node) {
                this.head = this.head.getNext();
                node.setNext(null);

                if (this.tail == node)
                    tail = null;
            }

            else{
                Node nodeBefore = null;
                Node temp = this.head;
                while (temp != null){
                    if(temp.getNext() == node) {
                        nodeBefore = temp;
                        break;
                    }
                    temp = temp.getNext();
                }

                if(nodeBefore != null) {
                    nodeBefore.setNext(node.getNext());
                }
                if(node == this.tail)
                    this.tail = nodeBefore;
                node.setNext(null);
            }


        }
    }

}
