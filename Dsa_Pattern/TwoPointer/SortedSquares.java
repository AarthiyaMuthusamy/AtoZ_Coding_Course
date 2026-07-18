package Dsa_Pattern.TwoPointer;

public class SortedSquares {
    public static void main(String[] args) {

    }
    public int[] sortedSquares(int[] nums) {

        int[] ans = new int[nums.length];
        int left =0;
        int right = nums.length-1;
        int last = ans.length-1;


        while(left <= right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                ans[last] = nums[left] * nums[left];
                left++;

            }
            else{
                ans[last] = nums[right] * nums[right];
                right--;
            }

            last--;

        }

        return ans;

    }
}
