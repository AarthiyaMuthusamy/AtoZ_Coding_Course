package String;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1,c2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not an Anagram");
        }


        System.out.println(Anagram(s1,s2));
    }

    public static boolean Anagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();

        for (char c: s1.toCharArray()){
            map1.put(c,map1.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char c1 : s1.toCharArray()){
            map2.put(c1,map2.getOrDefault(c1, 0) + 1);
        }

        for (int i = 0;i<map1.size();i++){
            if(map1.get(i) == map2.get(i)){
                return true;
            }
        }
        return false;
    }

}
