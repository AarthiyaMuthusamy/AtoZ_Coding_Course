package ArrayProblems;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(num)));
    }

    public static int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for(int i =1;i<nums.length;i++){
            sum[i] = sum[i-1] + nums[i];
        }
        return sum;
    }
}
