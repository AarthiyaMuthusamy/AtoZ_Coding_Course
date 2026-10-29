package Dsa_Pattern.Dp.Momoization.String;

public class MinInsertionsPalindrome {
    public static void main(String[] args) {
        String s = "mbadm";
        System.out.println(minLpsInsertions(s));

    }
    public static int minLpsInsertions(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        //substrings length 1
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        for (int len = 2; len <= n; len++) {
            for (int i = 0; len + i <= n; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = 2;
                    if (len > 2) {
                        dp[i][j] += dp[i + 1][j - 1];
                    }
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        int minimumInsertions = s.length();
        return minimumInsertions - dp[0][n - 1];
    }
}
