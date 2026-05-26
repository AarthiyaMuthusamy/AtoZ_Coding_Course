package Linkedlist;

public class Main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
//        list.addatEnd(1);
//        list.addatEnd(2);
//        list.addatEnd(3);
//        list.addatEnd(4);
//        list.addatEnd(5);
        list.addAtBeginning(6);


//        if(list.find(7) != null){
//            System.out.println("found");
//        }
//        else{
//            System.out.println("Not found");
//        }
//
//        list.insert(9,3);
//
//        list.display();
//        list.delete(4);
       list.display();

        int elementToBeFound = 3;
        int position = findPosition(elementToBeFound, list.getHead());
        if (position != 0)
            System.out.println("The position of the element is " + position);
        else
            System.out.println("The element is not found!");


    }

    public static int findPosition(int element, Node head) {
        //Implement your code here and change the return value accordingly
        int position = 0;
        Node temp = head;
        while (temp != null){
            position++;
            if(temp.getData() == element)
               return position;
            temp = temp.getNext();
        }
        return 0;
    }
}
