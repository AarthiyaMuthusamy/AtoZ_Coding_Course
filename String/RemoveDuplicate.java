package String;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "programming";
        String result  = "";

        HashSet<Character> set = new HashSet<>();

        for (char s : str.toCharArray()){
            if(!set.contains(s)){
                set.add(s);
                result += s;
            }
        }

        System.out.println(result);
    }
}
