package Dsa_Pattern.BinarySearch.Search.LowerAndUpperBound;

public class Floor {
    public static void main(String[] args) {
        int[] nums ={1,2,4,6,8}; //1,2,4,6,8
        int target = 0; //5 4
        int ans = findSmallestAndGreaterThanTarget(nums,target);
        if(ans == -1)
            System.out.println(ans);
        else
            System.out.println(nums[ans]);
    }
    public static int findSmallestAndGreaterThanTarget(int[] nums, int target){
        int left=0;
        int right = nums.length-1;
        int ans = -1;

        while (left <= right){
            int mid = left + (right - left) /2;

            if(nums[mid] <= target){
                ans = mid;
                left = mid + 1;
            }
            right = mid -1;
        }
        return ans;
    }
}
