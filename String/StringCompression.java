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

        System.out.println(stringCompression(s));

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
}
