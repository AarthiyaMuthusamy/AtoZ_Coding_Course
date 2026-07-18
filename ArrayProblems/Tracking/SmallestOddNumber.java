package ArrayProblems.Tracking;

public class SmallestOddNumber {
    public static void main(String[] args) {
        int[] nums = {5,7,9,3,24,81};
        System.out.println(findSmallestOdd(nums));
    }
    private static int findSmallestOdd(int[] nums){
        int small = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] % 2 != 0 && nums[i] < small){
                small = nums[i];
            }
        }
        return small;
    }

}
