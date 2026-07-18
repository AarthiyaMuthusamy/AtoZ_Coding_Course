package Dsa_Pattern.SlidingWindow;

public class MaxAvgSubArrayI {
    public static void main(String[] args) {
        int[] nums = {5};
        int k = 1;
        System.out.println(avgSubArray(nums,k));

    }
    public static double avgSubArray(int[] nums, int k){
        int maxCount =0;
        int left =0;
        int sum =0;
        for (int right = 0; right < nums.length ; right++) {
            sum += nums[right];
            if(right-left+1 == k){
                maxCount = Math.max(sum,maxCount);
                sum -= nums[left];
                left++;
            }
        }

        return (double)maxCount/k;

        /* its work better in O(n + (n-k)) Time
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
         */
    }
}
