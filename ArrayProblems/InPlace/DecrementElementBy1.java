package ArrayProblems.InPlace;

import java.util.Arrays;

public class DecrementElementBy1 {
    public static void main(String[] args) {
        int[] nums = {2,7,8,9,4};
        for (int i = 0; i < nums.length; i++) {
            nums[i]--;
        }
        System.out.println(Arrays.toString(nums));
    }

}
