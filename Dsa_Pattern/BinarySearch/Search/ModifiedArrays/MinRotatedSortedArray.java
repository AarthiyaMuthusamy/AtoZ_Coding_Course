package Dsa_Pattern.BinarySearch.Search.ModifiedArrays;

public class MinRotatedSortedArray {
    public static void main(String[] args) {
       int[] nums = {11,13,15,17}; //3,4,5,1,2 //11,13,15,17 //4,5,6,7,0,1,2
        System.out.println(findMin(nums));

    }
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        while (left < right){
            int mid = left + (right-left)/2;
            if(nums[mid] > nums[right]){
                left = mid+1;
            }
            else{
                right = mid;
            }


        }
        return nums[left];
    }
}
