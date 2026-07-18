package Dsa_Pattern.BinarySearch.Search;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        int start =0;
        int end = nums.length-1;

        while(start<end){
            int mid = start + (end - start)/2;
            if(nums[mid]>nums[mid+1]){
                //decreasing part of array
                end= mid;
            }
            else{
                //ascending order
                start =mid+1;
            }
        }
        return start;
    }
}
