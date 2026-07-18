package ArrayProblems.InPlace;

import java.util.Arrays;

public class NegToPos {
    public static void main(String[] args) {
        int[] nums = {-2,-7,8,-9,4};
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0)
                nums[i] = -nums[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
