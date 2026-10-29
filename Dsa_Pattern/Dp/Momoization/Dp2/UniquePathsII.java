package Dsa_Pattern.Dp.Momoization.Dp2;

public class UniquePathsII {
    public static void main(String[] args) {
        int[][] grid ={{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(paths(grid));
    }
    public static int paths(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];

        if(grid[0][0] == 1){
            return 0;
        }
        dp[0][0] = 1;


        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                if(grid[i][j] == 1){
                    dp[i][j] = 0;
                }
                else if(i == 0 && j==0){
                    dp[i][j] = 1;
                }else{
                    int up =0;
                    int left = 0;
                    if(i > 0){
                        up = dp[i-1][j];
                    }
                    if(j > 0){
                        left = dp[i][j-1];
                    }
                    dp[i][j] = up + left;
                }
            }
        }
        return dp[m-1][n-1];

    }

}
