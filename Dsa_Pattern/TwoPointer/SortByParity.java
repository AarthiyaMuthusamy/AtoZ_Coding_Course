package Dsa_Pattern.TwoPointer;

import java.util.Arrays;

public class SortByParity {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};

        System.out.println(Arrays.toString(sortParity(arr)));

    }

    public static int[] sortParity(int[] nums){
        Arrays.sort(nums); // 1 2 3 4
        int i =0;
        int j = 1;

        while (j < nums.length){
            if(nums[i] % 2 == 0 || nums[j] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;

            }
            j++;
        }
        return nums;

    }
}
