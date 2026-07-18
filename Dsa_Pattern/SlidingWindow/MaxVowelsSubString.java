package Dsa_Pattern.SlidingWindow;

public class MaxVowelsSubString {
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 3;
        System.out.println(vowelMaxSubString(s,k));

    }

    public static int vowelMaxSubString(String s , int k){
        int maxVowelCount =0;
        int count = 0;
        int left =0;
        for (int right = 0; right < s.length()-1 ; right++) {
            if(isVowel(s.charAt(right))){
                count++;
            }
            if(right - left + 1 == k){
                maxVowelCount = Math.max(count, maxVowelCount);
                if(isVowel(s.charAt(left))){
                    count -= 1;
                }
                left++;
            }

        }

        return maxVowelCount;
    }
    public static boolean isVowel(char ch){
        return  ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
