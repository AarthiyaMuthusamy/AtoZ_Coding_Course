package Dsa_Pattern.MonotonicQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;


public class SlidingWindowMax {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,2,7,1,6};
        System.out.println(Arrays.toString(maxEleWithK(nums,3)));
        System.out.println(Arrays.toString(maxElementwWithK(nums,3)));
    }

    //brute force
    private static int[] maxEleWithK(int[] nums, int k){
        int[] result = new int[nums.length - k];
        int idx = 0;

        for (int i = 0; i < nums.length-k; i++) {
           int max = nums[i];
            for (int j = i; j <= i+k-1 ; j++) {
                max = Math.max(max, nums[j]);
            }
            result[idx++] = max;
        }
        return result;
    }


    //optimal
    private static int[] maxElementwWithK(int[] nums, int k){
        int[] result = new int[nums.length - k];
        Deque<Integer> dq = new ArrayDeque<>();
        int idx = 0;
        for (int i = 0; i < nums.length-1 ; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i -k){
             dq.pollFirst();
            }

            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i >= k-1){
                result[idx++] = nums[dq.peekFirst()];
            }

        }
         return result;
    }
}
