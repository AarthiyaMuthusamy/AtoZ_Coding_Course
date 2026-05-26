package Dsa_Pattern.Dp.Momoization;

public class edit_distance {
    public static void main(String[] args) {

        String s1 = "horse";
        String s2 = "ros";
        System.out.println(editDistance(s1,s2));

    }

    public static int editDistance(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];

        for (int i = 0; i <= n ; i++) {
            dp[i][m] = n-i;
        }
        for (int j = 0; j <= m ; j++) {
            dp[n][j] = m-j;
        }

        for (int i = n-1; i >= 0 ; i--) {
            for (int j = m-1; j >= 0 ; j--) {
                if(s1.charAt(i) == s2.charAt(j)){
                    dp[i][j] = dp[i+1][j+1];
                }
                else{
                    int insert = dp[i][j+1];
                    int delete = dp[i+1][j];
                    int replace = dp[i+1][j+1];
                    dp[i][j] = 1 + Math.min(insert, Math.min(delete,replace));
                }

            }
        }
        return dp[0][0];
    }
}
