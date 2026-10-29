package Dsa_Pattern.Dp.Momoization;

import static java.lang.Math.abs;

public class frogJump {
    public static void main(String[] args) {
        int n = 4;
        int[] heights = {10,20,30,10};
        System.out.println(frogJump(n,heights));

    }

    public static int frogJump(int n , int[] heights){
        int[] dp = new int[n];
        dp[0] = 0;

        for (int i = 1; i < n ; i++) {
            int firstStep = dp[i-1] + Math.abs(heights[i-1]- heights[i]);

            int twoStep = Integer.MAX_VALUE;
            if(i > 1){
                twoStep = dp[i-2] + Math.abs(heights[i-2] - heights[i]);
            }
            dp[i] = Math.min(firstStep,twoStep);
        }

        return dp[n-1];
    }
}
