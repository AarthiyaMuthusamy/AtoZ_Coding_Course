package Dsa_Pattern.Dp.Momoization;

import java.util.Arrays;

public class MinCostPath {
    public static void main(String[] args) {
        int[][] paths = {
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };

        System.out.println(MinimumCostPath(paths));

    }

    public static int MinimumCostPath(int[][] paths){
         /* Time O(m * n), space O(m * n)

        int m = paths.length;
        int n = paths[0].length;

        int[][] dp = new int[m][n];
        dp[0][0] = paths[0][0];

        for (int i = 1; i < n ; i++)
            dp[0][i] = dp[0][i-1] + paths[0][i];

        for (int j = 1; j < m ; j++)
            dp[j][0] = dp[j-1][0] + paths[j][0];


        for (int i = 1; i < m ; i++) {
            for (int j = 1; j < n ; j++) {
                dp[i][j] = paths[i][j] + Math.min(dp[i-1][j] , dp[i][j-1])  ;
            }

        }

        return dp[m-1][n-1];


          */


        int m = paths.length;
        int n = paths[0].length;

        int[] dp = new int[n];
        dp[0] = paths[0][0];

        for (int i = 1; i < n ; i++)
            dp[i] = dp[i-1] + paths[0][i];

        for (int i = 1; i < m; i++) {
            dp[0] += paths[i][0];
            for (int j = 1; j < n; j++) {
                dp[j] = paths[i][j] + Math.min(dp[j], dp[j - 1]);
            }

        }

        return dp[n-1];


    }

}
