package Dsa_Pattern.TwoPointer;

public class TrappedRainWater {
    /*
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
     */
    public static void main(String[] args) {
        int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(nums));
    }

    public static int trap(int[] height) {
        int left =0;
        int right = height.length-1;
        int leftMax = height[left];
        int rightMax = height[right];
        int waterUnits = 0;


        while(left < right){
            if(leftMax <=  rightMax){
                left++;
                leftMax = Math.max(leftMax, height[left]);
                waterUnits += leftMax - height[left];

            }else{
                right--;
                rightMax = Math.max(rightMax, height[right]);
                waterUnits += rightMax - height[right];
            }

        }
        return waterUnits;

    }
}
