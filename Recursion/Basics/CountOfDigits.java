package Recursion.Basics;

public class CountOfDigits {
    public static void main(String[] args) {
        int n = 123489;
        System.out.println(countDigits(n));

    }

    public static int countDigits(int n){
        if(n == 0) return 0;

        return 1 + countDigits(n/10);
    }
}
