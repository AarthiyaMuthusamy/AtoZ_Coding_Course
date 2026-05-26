package Collections;

import java.util.HashSet;
import java.util.Stack;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hsh = new HashSet<>();
        hsh.add(1);
        hsh.add(2);
        hsh.add(1);//not consider the duplicate

        System.out.println(hsh);
        hsh.remove(1);
        System.out.println(hsh);
    }
}
