package Dsa_Pattern.MonotonicQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ShortestSubArraySumK {
    public static void main(String[] args) {
        int[] nums = {2,-1,2};
        int k = 3;
        System.out.println(findShortestSubArraySumK(nums,k));
    }
    public static int findShortestSubArraySumK(int[] nums,int k){
        int[] prefix = new int[nums.length + 1];
        prefix[0] = 0;

        for (int i = 1; i < nums.length+1; i++) {
            prefix[i] += nums[i-1] + prefix[i-1];
        }
        Deque<Integer> dq = new ArrayDeque<>();
        int short_length = Integer.MAX_VALUE;

        for (int i = 0; i < prefix.length; i++) {
            while (!dq.isEmpty() && prefix[i] - prefix[dq.peekFirst()] >= k){
                short_length = Math.min(short_length, i-dq.peekFirst());
                dq.pollFirst();
            }
            while (!dq.isEmpty() && prefix[i] <= prefix[dq.peekLast()]){
                dq.pollLast();
            }
            dq.addLast(i);
        }
        return short_length == Integer.MAX_VALUE ? -1: short_length;

    }
}
