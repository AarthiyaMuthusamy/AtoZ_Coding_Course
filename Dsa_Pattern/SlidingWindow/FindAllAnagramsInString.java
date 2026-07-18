package Dsa_Pattern.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInString {
    public static void main(String[] args) {
        String s = "abab"; //"cbaebabacd"
        String p = "ab"; //"abc"
        System.out.println(findAnagram(s,p));

    }
    public static List<Integer> findAnagram(String s, String p){
        List<Integer> ans = new ArrayList<>();
        int[] freq1 = new int[26];
        int i = 0;
        while(i < p.length()){
            freq1[p.charAt(i) - 'a']++;
            i++;
        }
        int[] freq2 = new int[26];
        int left = 0;
        int right =0;
        while(right < s.length()){
            freq2[s.charAt(right) - 'a']++;
            if(right-left + 1 > p.length()){
                freq2[s.charAt(left) - 'a']--;
                left++;
            }
            if(right-left + 1 == p.length()){
                if(compare(freq1,freq2)){
                    ans.add(left);
                }
            }
            right++;


        }
        return ans;
    }
    public static boolean compare(int[] freq1, int[] freq2){
        for (int i = 0; i <  26; i++) {
            if(freq1[i] != freq2[i])
                return false;
        }
        return true;
    }
}
