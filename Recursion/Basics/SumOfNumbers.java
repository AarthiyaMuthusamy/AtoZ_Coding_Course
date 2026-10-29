package Recursion.Basics;

public class SumOfNumbers {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(findSumOfN(n));
    }
    public static int findSumOfN(int n){
        if(n == 0) return 0;

        return n + findSumOfN(n-1);
    }
}
