package Dsa_Pattern.MonotonicQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class FirstNegativeNumbers {
    public static void main(String[] args) {
        int[] nums = {12,-1,-7,8,-15,30,16,28};
        System.out.println(Arrays.toString(findFirstNegativeNumbers(nums,3)));

    }
    public static int[] findFirstNegativeNumbers(int[] nums,int k){
        Deque<Integer> dq = new ArrayDeque<>();
        int[] ans = new int[nums.length-k+1];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0){
                dq.addLast(i);
            }
            while (!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }
            if(i >= k-1){
                if(dq.isEmpty()){
                    ans[i-k+1] = 0;
                }
                else{
                    ans[i-k+1] = nums[dq.peekFirst()];
                }
            }
        }
        return ans;

    }
}
