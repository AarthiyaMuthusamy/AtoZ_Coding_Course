package Dsa_Pattern.BinarySearch.Search.ModifiedArrays;

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums ={1}; //4,5,6,7,0,1,2
        int target = 0; //0 //3
        System.out.println(searchInArray(nums,target));

    }
    public static int searchInArray(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int ans = -1;
        while (left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return mid;
            }
            if (nums[left] <= nums[mid]){
                if(target >= nums[left] && target < nums[mid]){
                    right = mid - 1;
                }
                else{
                    left = mid+1;
                }
            }
            else{
                if(target > nums[mid] && target <= nums[right]){
                    left = mid+1;

                }
                else{
                    right = mid - 1;
                }
            }

        }
        return -1;
    }

}
