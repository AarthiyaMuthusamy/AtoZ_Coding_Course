package Dsa_Pattern.HashMap;

import javax.print.DocFlavor;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "rat";//"car"
        String t = "car"; //""
        System.out.println(checkIfAnagram(s,t));

    }
    public static boolean checkIfAnagram(String s, String t){
        /*  using two hashmap but it have an better approach
        HashMap<Character, Integer> map1 =  new HashMap<>();
        for(char ch : s.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        HashMap<Character, Integer> map2 =  new HashMap<>();
        for(char ch : t.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        return map1.equals(map2);

         */
        //if same character found decrease the value count finaly traverse the values in hashmap if any values does'nt have an 0 return false otherwise return true.
        HashMap<Character, Integer> map1 =  new HashMap<>();
        for(char ch : s.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(char ch : t.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)-1);
        }
        for (int num : map1.values()){
            if(num != 0){
                return false;
            }
        }
        return true;


    }
}
