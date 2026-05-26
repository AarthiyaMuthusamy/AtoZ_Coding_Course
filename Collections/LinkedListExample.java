package Collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        list.remove(0);

        System.out.println(list);

    }
}
