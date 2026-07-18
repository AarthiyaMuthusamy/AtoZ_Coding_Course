package Dsa_Pattern.BinarySearch.Search.LowerAndUpperBound;

public class LowerBound {
    public static void main(String[] args) {
        int[] nums ={1,2,4,4,5,7}; //1,2,4,4,5,7
        int target = 8; //4 3
        System.out.println(findGreaterThan(nums,target));

    }
    public static int findGreaterThan(int[] nums,int target){
        int left=0;
        int right = nums.length-1;
        int ans = nums.length;

        while (left <= right){
            int mid = left + (right - left) /2;

            if(nums[mid] >= target){
                ans = mid;
                right = mid-1;
            }
            left = mid +1;
        }
        return ans;
    }


}
