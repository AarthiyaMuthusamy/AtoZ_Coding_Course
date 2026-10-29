package Dsa_Pattern.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupTheAnagrams(strs));
    }
    public static List<List<String>> groupTheAnagrams(String[] strs){
        HashMap<String ,List<String>> map = new HashMap<>();

        for (String str : strs){
            String key = str;
            char[] chars = key.toCharArray();
            Arrays.sort(chars);
            key = new String(chars);

            map.computeIfAbsent(key,k-> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }

}
