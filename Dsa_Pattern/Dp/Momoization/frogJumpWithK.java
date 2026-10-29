package Dsa_Pattern.Dp.Momoization;

public class frogJumpWithK {
    public static void main(String[] args) {
        int n = 5;
        int[] heights = {10,20,30,10,40};
        int k = 3;
        System.out.println(frogJumpK(n,heights,k));

    }

     public static int frogJumpK(int n , int[] heights,int k){
        int[] dp = new int[n];
        dp[0] = 0;

        for (int i = 1; i < n ; i++) {
            int minEnergy = Integer.MAX_VALUE;
            for (int j = 1; j <= k && i-j >= 0 ; j++) {
                int energy = dp[i-j] + Math.abs(heights[i] - heights[i-j]);
                minEnergy = Math.min(minEnergy,energy);
            }
            dp[i] = minEnergy;

        }



        return dp[n-1];
     }
}
