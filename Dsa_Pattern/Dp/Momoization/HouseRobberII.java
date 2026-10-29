package Dsa_Pattern.Dp.Momoization;

public class HouseRobberII {
    public static void main(String[] args) {
        int[] money1 = {1,2,3};
        int[] money2 = {2,3,1};
        int n1 = money1.length;
        int n2 = money2.length;


        int case1 = rob(money1,n1);
        int case2 = rob(money2,n2);


        System.out.println(Math.max(case1,case2));

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
