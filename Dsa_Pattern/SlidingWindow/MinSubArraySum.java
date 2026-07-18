package Dsa_Pattern.SlidingWindow;

public class MinSubArraySum {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1};
        int target = 11;
        System.out.println(subArraySum(nums,target));
    }
    public static int subArraySum(int[] nums, int target){
        int left =0;
        int minLength  = Integer.MAX_VALUE;
        int sum = 0;
        for (int right = 0; right < nums.length ; right++) {
            sum += nums[right];
            while(sum >= target){
                minLength = Math.min(minLength, right-left+1);
                sum -= nums[left];
                left++;
            }


        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

}
