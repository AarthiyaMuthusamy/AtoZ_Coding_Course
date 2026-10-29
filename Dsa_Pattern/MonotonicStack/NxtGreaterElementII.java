package Dsa_Pattern.MonotonicStack;

import java.util.Arrays;
import java.util.Stack;

public class NxtGreaterElementII {
    public static void main(String[] args) {
        int[] nums = {1,2,1};

        System.out.println(Arrays.toString(nextGreaterInCircular(nums)));
    }
    public static int[] nextGreaterInCircular(int[] nums){
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans,-1);

        for (int i = 2 * n-1; i > 0 ; i--) {
            int index = i % n;
            while (!stack.isEmpty() && stack.peek() <= nums[index]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[index] = stack.peek();
            }
            stack.push(nums[index]);
        }
        return ans;
    }
}
