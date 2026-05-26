package Dsa_Pattern.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class AnagramIndices {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(AnagramIndex(s,p));

    }

    public static  List<Integer> AnagramIndex(String s , String p){
        List<Integer> result = new ArrayList<>();
        int[] P_count = new int[26];
        int[] window = new int[26];
        if(s.length() < p.length()){
            return result;
        }

       for (char ch : p.toCharArray()){
           P_count[ch - 'a']++;
       }

       int k = p.length();

        for (int i = 0; i < s.length() ; i++) {
            window[s.charAt(i) - 'a']++;

            if(i >= k){
                window[s.charAt(i-k) - 'a'] --;
            }

            if(Arrays.equals(window,P_count)){
                result.add(i-k + 1);
            }
        }
        return result;
    }
}
