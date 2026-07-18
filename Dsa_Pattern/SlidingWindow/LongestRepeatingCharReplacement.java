package Dsa_Pattern.SlidingWindow;

import java.util.HashMap;

public class LongestRepeatingCharReplacement {
    public static void main(String[] args) {
        String str ="ABAB"; //"ABAB" "AABABBA"
        int k = 2;
        System.out.println(repeatingCharReplacement(str,k));

    }

    public static int repeatingCharReplacement(String s, int k){

        int start = 0;
        int end = 0;
        int result = 0;
        int[] freq = new int[26];
        int maxLength = 0 ;
        int maxFreq = 0;
        while(end < s.length()){
            char ch = s.charAt(end);
            freq[ch - 'A']++;
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);
            while((end-start + 1) - maxFreq > k){
                freq[s.charAt(start) - 'A']--;
                start++;
            }
            maxLength = Math.max(maxLength, end -start+1);
            end++;
        }
        return maxLength;


        /*
        int maxFreq = 0;
        int[] freq = new int[26];
        int maxLength = 0;
        int left =0;
        for (int right = 0; right < s.length(); right++) {

            freq[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq,freq[s.charAt(right) - 'A']);

            while ((right-left+1) - maxFreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength,right-left+1);

        }
        return maxLength;
         */
    }

}
