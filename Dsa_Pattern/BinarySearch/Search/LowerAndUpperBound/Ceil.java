package Dsa_Pattern.BinarySearch.Search.LowerAndUpperBound;

public class Ceil {
    public static void main(String[] args) {
        int[] nums ={1,2,4,6,8}; //1,2,4,6,8
        int target = 10; //5 4
        int ans = findsmallestAndLessvalue(nums,target);
        if(ans == -1)
            System.out.println(ans);
        else
            System.out.println(nums[ans]);
    }
    public static int findsmallestAndLessvalue(int[] nums, int target){
        int left=0;
        int right = nums.length-1;
        int ans = -1;

        while (left <= right){
            int mid = left + (right - left) /2;

            if(nums[mid] >= target){
                ans = mid;
                right = mid - 1;
            }
            left = mid  + 1;
        }
        return ans;
    }

}
