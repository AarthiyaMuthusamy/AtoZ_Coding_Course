package ArrayProblems.MultipleArrays;

import java.util.Arrays;

public class IntersectionArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));

    }
    /*
    Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
     */

    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] result = new int[Math.min(nums1.length,nums2.length)];
        int k=0;

        for(int i =0;i<nums2.length;i++){
            for(int j =0;j<nums1.length;j++){
                if(nums2[i] == nums1[j]){
                    if(!checkDuplicate(result)){
                        result[k] = nums2[i];
                        k++;
                        break;
                    }

                }

            }
        }


        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = result[i];
        }

    return  ans;



    }

    public static boolean checkDuplicate(int[] nums){
        int index = nums.length-1;
        while(index > 0){
            if(nums[index] == nums[index-1]){
                return false;

            }
            index--;

        }
        return true;
    }
}
