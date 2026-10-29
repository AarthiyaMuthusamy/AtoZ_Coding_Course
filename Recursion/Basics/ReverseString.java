package Recursion.Basics;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverse(s));

    }
    public static String reverse(String s){
        if(s.length()== 0) return "";

        return reverse(s.substring(1)) + s.charAt(0);
    }

}
