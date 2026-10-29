package Dsa_Pattern;

public class FindFirstOccurence {
    public static void main(String[] args) {

        String haystack = "leetcode"; //leetcode //sadbutsad
        String needle = "leeto"; //leeto //sad
        System.out.println(strStr(haystack,needle));
    }
    public  static int strStr(String haystack, String needle) {
        int left = 0;
        int index = 0;
        int count = 0;


            while(index < haystack.length() && left < needle.length()) {
                if (haystack.charAt(index) == needle.charAt(left)) {
                    count++;
                }
                else{
                    count = 0;
                }
                left++;
                index++;

            }





        return left - index ;

    }
}
