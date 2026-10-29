package Dsa_Pattern.Dp.Momoization.ThreeD;

public class MinInitialHealth {
    public static void main(String[] args) {
        int[][] dungeon= {{-3,5,-2},{-4,-6,3},{2,-2,-5}};
        System.out.println(minInitialHealth(dungeon));
    }

    public static int minInitialHealth(int[][] dungeon){
        int m = dungeon.length;
        int n = dungeon[0].length;

        int[][] dp =  new int[m][n];
        dp[m-1][n-1] = Math.max(1, 1 - dungeon[m-1][n-1]);

        for(int i = m-2;i>=0;i--){
            dp[i][n-1] = Math.max(1,dp[i+1][n-1] - dungeon[i][n-1]);
        }
        for (int j = n-2;j>=0;j--){
            dp[m-1][j] = Math.max(1,dp[m-1][j+1] - dungeon[m-1][j]);
        }

        for (int i = m-2; i >= 0 ; i--) {
            for (int j = n-2; j >= 0 ; j--) {
                int right = dp[i][j+1];
                int down = dp[i+1][j];

                int requiredHealth = Math.min(right,down) - dungeon[i][j];
                dp[i][j] = Math.max(1, requiredHealth);
            }
        }
        return dp[0][0];
    }
}
