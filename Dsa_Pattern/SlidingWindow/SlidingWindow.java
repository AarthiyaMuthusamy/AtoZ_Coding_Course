package Dsa_Pattern.SlidingWindow;

import java.util.HashSet;

public class SlidingWindow {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(LongestSubString(str));

    }

    public static int LongestSubString(String s){
        HashSet<Character> hash = new HashSet<>();

        int maxLen = 0;
        int left =0 ;
        for(int right =0; right < s.length() ;right++){
            while (hash.contains(s.charAt(right))){
                hash.remove(s.charAt(left));
                left++;
            }

            hash.add(s.charAt(right));
            maxLen = Math.max(maxLen , right- left + 1);


        }

        return maxLen;
    }
}
