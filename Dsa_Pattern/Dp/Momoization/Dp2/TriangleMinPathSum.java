package Dsa_Pattern.Dp.Momoization.Dp2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class TriangleMinPathSum {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>(List.of(new ArrayList<>(List.of(2)),
                new ArrayList<>(List.of(3,4)),
                new ArrayList<>(List.of(6,5,7)),
                new ArrayList<>(List.of(4,1,8,3))));


        System.out.println(minPathSum(list));

    }
    public static int minPathSum(List<List<Integer>> triangle){
        int n = triangle.size();
        int[][] dp = new int[n][n];
        dp[0][0] = triangle.get(0).get(0);

        for (int i = 1; i < n ; i++) {
            for (int j = 0; j <= i; j++) {
                if(j == 0){
                    dp[i][j] = triangle.get(i).get(j) + dp[i-1][j];
                }else if(j == i){
                    dp[i][j] = triangle.get(i).get(j) + dp[i-1][j-1];
                }else {
                    dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i-1][j],dp[i-1][j-1]);
                }
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans,dp[n-1][i]);
        }
        return ans;
    }
}
