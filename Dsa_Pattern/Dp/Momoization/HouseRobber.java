package Dsa_Pattern.Dp.Momoization;

public class HouseRobber {
    public static void main(String[] args) {
        int[] money = {2,7,9,3,1};
        int n = money.length;
        System.out.println(rob(money,n));

    }

    public static int rob(int[] money,int n){
        int[] dp = new int[n];
        dp[0] = money[0];
        dp[1] = Math.max(money[0],money[1]);
        for (int i = 2; i < n; i++) {
            int take = money[i] + dp[i-2];
            int notTake = dp[i-1];
            dp[i] = Math.max(take,notTake);
        }
        return dp[n-1];

    }

}
