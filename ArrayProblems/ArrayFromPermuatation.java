package ArrayProblems;

import java.util.Arrays;

public class ArrayFromPermuatation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }

    // public int[] buildArray(int[] nums) {
    //     int[] ans = new int[nums.length];

    //    for(int i =0 ;i<nums.length;i++){
    //     ans[i] = nums[nums[i]];
    //    }

    //    return ans;

    // }



    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        permutations(nums, ans,0);
        return ans;

    }

    public static int permutations(int[] nums, int[] ans , int i){

        if(i==nums.length){
            return 0;
        }

        ans[i] = nums[nums[i]];
        return permutations(nums,ans,i+1);


    }
}
