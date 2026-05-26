package Dsa_Pattern.Dp.Momoization;

import java.util.Arrays;

public class MinCoin {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;

        System.out.println(MinimumCoinChange(coins,amount));

    }

    public static int MinimumCoinChange(int[] coins, int amount){
        int[] dp = new int[amount + 1];

        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int coin : coins){
            for(int a= coin;a<= amount;a++){
                dp[a] = Math.min(dp[a] , 1 + dp[a - coin]);
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}
