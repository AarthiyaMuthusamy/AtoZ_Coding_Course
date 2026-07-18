package ArrayProblems.MultipleArrays;

import java.util.Arrays;

public class CopyOneArrayIntoAnother {
    public static void main(String[] args) {
        int[] nums = {2,7,8,9,4};
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
