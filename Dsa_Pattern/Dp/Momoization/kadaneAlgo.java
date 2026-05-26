package Dsa_Pattern.Dp.Momoization;

public class kadaneAlgo {
    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(kadaneSubArray(nums));

    }

    public static int kadaneSubArray(int[] nums){
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i] , currentSum + nums[i]);
            maxSum = Math.max(currentSum, maxSum);


        }

        return maxSum;
    }
}
