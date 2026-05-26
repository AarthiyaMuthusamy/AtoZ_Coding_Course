package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubString {
    public static void main(String[] args) {
        String s = "abcabcdac";


        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            maxLength  = Math.max(maxLength, i - left + 1);
        }

        System.out.println(maxLength);

    }
}
