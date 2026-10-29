package Dsa_Pattern.Dp.Momoization.String;

public class LPS {
    public static void main(String[] args) {
        String s1 = "cbbd";
        String s2 = reversed(s1);
        System.out.println(longestCommonSubSequence(s1,s2));
        System.out.println(lps(s1));


    }
    public static String reversed(String s){

        String reversed = "";
        for (int i = s.length()-1; i >= 0 ; i--) {
            reversed += s.charAt(i);
        }
        return reversed;


    }

    public static int longestCommonSubSequence(String s1, String s2){
        if(s1.isEmpty() || s2.isEmpty()){
            return 0;
        }

        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i < m; i++) {
            dp[i][0]= 0;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <= n ; j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1]; //add to the diagonal value
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);//max with top and left
                }
            }
        }
        return dp[m][n];
    }

    public static int lps(String s){
        int n = s.length();
        int[][] dp = new int[n][n];
        //substrings length 1
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        for (int len = 2;len <= n;len++){
            for (int i = 0; len + i <= n ; i++) {
                int j = i + len-1;
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = 2;
                    if(len > 2){
                        dp[i][j] += dp[i+1][j-1];
                    }
                }
                else{
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        return dp[0][n-1];
    }
}
