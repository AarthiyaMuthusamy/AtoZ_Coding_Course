package Dsa_Pattern.Dp.Momoization;

public class knapsack {
    public static void main(String[] args) {
        int[] weights = {1,3,4,5};
        int[] values = {1,4,5,7};
        int W = 7;
        System.out.println(knapsack01(weights,values,W));

    }

    public static int knapsack01(int[] weights, int[] values , int W){
        int n = weights.length;
        int[][] dp = new int[n+1][W+1];


        for (int i = 1; i <= n ; i++) {
            for (int w = 1; w <= W ; w++) {
                int skip = dp[i-1][w];

                int take = 0;
                if(weights[i-1] <= w){
                    take = values[i-1] + dp[i-1][w-weights[i-1]];
                }
                dp[i][w] = Math.max(skip, take);
            }

        }

        return dp[n][W];
    }
}
