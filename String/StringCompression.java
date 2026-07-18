package String;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {
    public static void main(String[] args) {
        String s = "aaabbbcaa";

        HashMap<Character,Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.print(entry.getKey()+""+entry.getValue());
        }

       // System.out.println(stringCompression(s));
        System.out.println();
        String s2 = "a3b3c2d4";
        System.out.println(stringUnCompression(s2));

    }

    public static String stringCompression(String s){
/// this will work only an orderded
        int count = 1;
        String result = "";

        for (int i = 1; i < s.length() ; i++) {
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            else{
                result += s.charAt(i-1) + "" +count;
                count = 1;
            }

        }

        result += s.charAt(s.length()-1) + "" + count;
        return result;
    }


    public static String stringUnCompression(String s){


        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length() ; i+=2) {
            char ch = s.charAt(i);
            int count = s.charAt(i+1) - '0';
            for (int j = 0; j < count; j++) {
                result.append(ch);
            }

        }


        return result.toString();
    }
}
