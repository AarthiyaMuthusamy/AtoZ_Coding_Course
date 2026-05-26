package Dsa_Pattern.Dp.Momoization;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;

public class LongestSubSequence {
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(longestSub(nums));

    }

    public static int longestSub(int[] nums){
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxLen = 1;

        for (int i = 1; i < n ; i++) {
            for (int j = 0; j < i ; j++) {
                if(nums[j] <  nums[i]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }

            }
            maxLen = Math.max(dp[i],maxLen);
        }
        return maxLen;
    }
}
