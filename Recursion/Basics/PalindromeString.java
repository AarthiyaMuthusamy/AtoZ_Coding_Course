package Recursion.Basics;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        if(s.length() <= 1) return true;

        return s.charAt(0) == s.charAt(s.length()-1) && isPalindrome(s.substring(1,s.length()-1));
    }
}
