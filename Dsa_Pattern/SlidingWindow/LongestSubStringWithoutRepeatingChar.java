package Dsa_Pattern.SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubStringWithoutRepeatingChar {
    public static void main(String[] args) {
        String str ="pwwkew";//"abcabcbb" "bbbbb"
        System.out.println(longestSubString(str));

    }
    public static int longestSubString(String s){
        char[] arr = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int maxLength =0;
        int left =0;
        for (int right = 0; right < arr.length-1; right++) {
            while (set.contains(arr[right])){
                set.remove(arr[left]);
                left++;
            }
            set.add(arr[right]);
            maxLength = Math.max(maxLength,right-left+1);

        }
        return maxLength;
    }
}

