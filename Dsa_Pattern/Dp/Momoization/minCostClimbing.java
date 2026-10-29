package Dsa_Pattern.Dp.Momoization;

public class minCostClimbing {
    public static void main(String[] args) {
        int n = 3;
        int[] cost = {10,15,20};
        System.out.println(mincostClimbing(cost,n));
    }
    public static int mincostClimbing(int[] cost,int n){
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < n ; i++) {
            dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
}
