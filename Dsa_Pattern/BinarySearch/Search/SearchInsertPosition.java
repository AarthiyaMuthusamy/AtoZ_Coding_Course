package Dsa_Pattern.BinarySearch.Search;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        System.out.println(searchPosition(nums,target));
    }

    public static int searchPosition(int[] nums, int target){
        int left =0;
        int right= nums.length-1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target)
                return mid;
            else if (target < nums[mid])
                right = mid - 1;


            else
                left = mid + 1;
        }

        return left;
    }
}
