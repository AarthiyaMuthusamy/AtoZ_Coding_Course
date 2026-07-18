package Dsa_Pattern.BinarySearch.Search.FindOccurence;

import java.util.Arrays;

public class FindFirstOcuurences {
    public static void main(String[] args) {
        int[] nums = {};//5,7,7,8,8,10
        int target = 0; //8 6
        System.out.println(Arrays.toString(firstAndLastoccurence(nums,target)));

    }

    public static int[] firstAndLastoccurence(int[] nums, int target){
        int[] ans = {-1,-1};
        int firstIndex = search(nums,target,true);
        int secondIndex = search(nums,target,false);
        ans[0] = firstIndex;
        ans[1] =  secondIndex;
        return ans;

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
