package Stack;

public class Main {
    public static void main(String[] args) {

      /*  StackArray stack = new StackArray(5);
        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        stack.display();
        */

       StackLinkedlist list = new StackLinkedlist();
       list.push(7);
        list.push(8);
        list.push(9);
        System.out.println(list.peek());
        System.out.println(list.pop());



    }
}
