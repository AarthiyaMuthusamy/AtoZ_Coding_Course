package Dsa_Pattern.Dp.Momoization.Dp2;

public class FallingMinPathSum {
    public static void main(String[] args) {
        int[][] grid = {{2,1,3},{6,5,4},{7,8,9}};
        System.out.println(findFallingMin(grid));
    }
    public static int findFallingMin(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];

        dp[0][0] = grid[0][0];
        //fill rows
        for (int j = 0; j < n; j++) {
            dp[0][j] = grid[0][j];
        }

        for (int i = 1; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                int up = dp[i-1][j];

                int upLeft = Integer.MAX_VALUE;
                int upRight = Integer.MAX_VALUE;

                if(j > 0){
                    upLeft = dp[i-1][j-1];
                }
                if(j < n-1){
                    upRight = dp[i-1][j+1];
                }
                dp[i][j] = grid[i][j] + Math.min(up,Math.min(upLeft,upRight));
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans,dp[m-1][i]);
        }
        return ans;
    }
}
