package Dsa_Pattern.BinarySearch.Search.FindOccurence;

import java.util.Arrays;

public class CountOccurencesInSoretedArray {
    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,4};//5,7,7,8,8,10
        int target = 2; //8 6
        System.out.println(firstAndLastoccurence(nums,target));

    }

    public static int firstAndLastoccurence(int[] nums, int target){

        int firstIndex = search(nums,target,true);
        int secondIndex = search(nums,target,false);
        if(firstIndex == -1){
            return 0;
        }
        return secondIndex - firstIndex +1;

    }
    public static int search(int[] nums, int target, boolean isFirstIndex){
        int left = 0;
        int right = nums.length-1;
        int ans = -1;
        while (left <= right){
            int mid = left + (right - left) / 2;

            if(target < nums[mid]){
                right = mid -1;
            }

            else if(target > nums[mid]) {
                left = mid + 1;
            }
            else {
                ans = mid;
                if (isFirstIndex)
                    right = mid - 1;
                else
                    left = mid + 1;

            }
        }
        return ans;
    }
}
