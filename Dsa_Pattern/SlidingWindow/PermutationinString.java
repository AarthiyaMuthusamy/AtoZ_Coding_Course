package Dsa_Pattern.SlidingWindow;

public class PermutationinString {
    public static void main(String[] args) {
        String s1 = "adc";//"ab"
        String s2 = "dcda"; //"eidbaooo" "eidboaoo"
        System.out.println(checkPermutationInString(s1,s2));

    }

    public static boolean checkPermutationInString(String s1, String s2){
        int[] freq1 = new int[26];
        int i = 0;
        while(i < s1.length()){
            freq1[s1.charAt(i) - 'a']++;
            i++;
        }
        int[] freq2 = new int[26];
        int left = 0;
        int right =0;
        while(right < s2.length()){
            freq2[s2.charAt(right) - 'a']++;
            if(right-left + 1 > s1.length()){
                freq2[s2.charAt(left) - 'a']--;
                left++;
            }
            if(right-left + 1 == s1.length()){
                if(compare(freq1,freq2)){
                    return true;
                }
            }
             right++;


        }
        return false;


    }

    public static boolean compare(int[] freq1, int[] freq2){
        for (int i = 0; i <  26; i++) {
            if(freq1[i] != freq2[i])
                return false;
        }
        return true;
    }
}
