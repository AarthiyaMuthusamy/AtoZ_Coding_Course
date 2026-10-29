package Dsa_Pattern.HashMap;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(findFirstUniqueChar(s));
    }
    public static int findFirstUniqueChar(String s){
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        //this won't follow the original order so using string traversal to preserve the order
//        for (Map.Entry<Character,Integer> entry: map.entrySet()){
//            if(entry.getValue() == 1){
//                return s.indexOf(entry.getKey());
//            }
//        }

        //this will follow the first unique character for each character index
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
