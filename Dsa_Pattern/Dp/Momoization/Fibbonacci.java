package Dsa_Pattern.Dp.Momoization;

import java.util.Arrays;
import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(fib(n));

        //declare dp array
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1); //fil the dp state

        System.out.println(fibWithDp(n,dp));

        System.out.println(fibWithTabulation(n,dp));
        System.out.println(fibbonacciFinal(n));

    }

    //Recursion => Time : O(2^n)
    public static int fib(int n){
        if( n <= 1){
            return  n;
        }

        return fib(n-1) + fib(n-2);
    }

    //Dp memoization
    //create 1d array and store the computed values
    //check the values are already computed else compute and store it on array

    //Time : O(2^n) , space : O(n)
    public static int fibWithDp(int n, int[] dp){
        if( n <= 1){
            return  n;
        }
        //step 1: check the values exist in array
        if(dp[n] != -1){
            return dp[n];

        }
        //else compute the value and store
        dp[n] = fibWithDp(n-1,dp) + fibWithDp(n-2,dp);


        return dp[n];
    }

    //Tabulation
    //instead of recursion call will use the loop to reduce time complexity
    //Time : O(n) , space :O(n)
    public static int fibWithTabulation(int n, int[] dp){

        dp[0] = 0;
        dp[1] = 1;
        if( n == 0) return dp[0];
        if( n == 1) return dp[1];


        for (int i = 2; i < n ; i++) {
            dp[i] = dp[i-1] + dp [i-2];
        }

        return dp[n];
    }


    //Tabulation optimize
    //to reduce the space complexity , array => variable
    public static int fibbonacciFinal(int n){

        int prev2 = 0;
        int prev1 = 1;
        if( n == 0) return prev2;
        if( n == 1) return prev1;


        for (int i = 2; i <= n ; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }


}
