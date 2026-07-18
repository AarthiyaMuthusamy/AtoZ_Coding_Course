package ArrayProblems.Tracking;

public class LargestNegativeNumber {
    public static void main(String[] args) {
        int[] nums = {3,-8,-2,-24,-1};
       findLargestNegative(nums);
    }
    private static void findLargestNegative(int[] nums){
        int max = Integer.MIN_VALUE;
        boolean flag = false;
        for (int i = 1; i < nums.length ; i++) {
           if(nums[i] < 0 && nums[i] > max){
               max = nums[i];
               flag = true;
           }
        }
        //suppose no negative numbers found in arrr it returns the min_value that not the output
        //only if true then we get largest negative that's why we include the
        if(flag){
            System.out.println(max);
        }else{
            System.out.println("No negative numbers");
        }
    }
}
