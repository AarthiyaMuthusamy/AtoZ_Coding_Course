package ArrayProblems.InPlace;

import java.util.Arrays;

public class ReplaceNegWIithZero {
    public static void main(String[] args) {
       int[] nums = {2,-5,7,-1,8,9,4,-3};

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0)
                nums[i] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }

}
