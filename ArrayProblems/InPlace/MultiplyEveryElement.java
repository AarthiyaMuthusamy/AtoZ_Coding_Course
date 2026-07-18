package ArrayProblems.InPlace;

import java.util.Arrays;

public class MultiplyEveryElement {
    public static void main(String[] args) {
        int[] nums = {2,7,8,9,4};
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= 2;
        }
        System.out.println(Arrays.toString(nums));
    }
}
