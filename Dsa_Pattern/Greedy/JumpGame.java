package Dsa_Pattern.Greedy;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(isJumpSatisfied(nums));
    }
    public static boolean isJumpSatisfied(int[] nums){
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i > maxReach){
                return false;
            }
            maxReach = Math.max(maxReach,i + nums[i]);
        }
        return true;
    }
}
