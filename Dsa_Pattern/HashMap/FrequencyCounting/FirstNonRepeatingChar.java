package Dsa_Pattern.HashMap.FrequencyCounting;

import java.util.HashMap;
import java.util.Map;

/* given string input to find the first non-repeating character
input : s = "aabbcde"
output : c
*
* */
public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "aaabbbcccdddeeefhhdjo";//"aaaaaa"; //"e"; //" "; //"aaabbcde";
        //NonRepeatingChar(s);
        System.out.println(NonRepeatingChar(s));

    }
    public static char NonRepeatingChar(String s){
       if(s.isEmpty() || s.length() == 1){
           return s.charAt(0);
       }

        HashMap<Character, Integer> charMap = new HashMap<>();

       for (char ch : s.toCharArray()){
           charMap.put(ch,charMap.getOrDefault(ch,0) + 1);
       }


        for (Map.Entry<Character,Integer> entry : charMap.entrySet()){
           if(entry.getValue() == 1){
               return entry.getKey();

           }

        }

        return ' ';

    }
}
