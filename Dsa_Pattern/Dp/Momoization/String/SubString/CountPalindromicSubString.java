package Dsa_Pattern.Dp.Momoization.String.SubString;

public class CountPalindromicSubString {
    public static void main(String[] args) {
        String s = "abba";
        System.out.println(countPalindrome(s));
    }
    public static int countPalindrome(String s){
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int count = 0;
        for (int len = 1; len <=n ; len++) {
            for (int i = 0; i <= n-len ; i++) {
                int j = i + len -1;
                if(s.charAt(i) == s.charAt(j)){
                    if(len <= 2 || dp[i+1][j-1]){
                        dp[i][j] = true;
                        count++;

                    }
                }
            }
        }
        return count;
    }
}
