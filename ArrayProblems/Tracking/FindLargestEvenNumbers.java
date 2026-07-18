package ArrayProblems.Tracking;

public class FindLargestEvenNumbers {
    public static void main(String[] args) {
        int[] nums = {3,8,2,24,81};
        System.out.println(findLargestEven(nums));
    }

    private static int findLargestEven(int[] nums){
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] % 2 == 0 && nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
}
