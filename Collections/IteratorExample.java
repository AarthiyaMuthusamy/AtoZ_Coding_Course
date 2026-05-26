package Collections;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("hi");
        arr.add("hello");

        //for loop for normal

        //in here iterate through any collection using iterator
        Iterator it = arr.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
