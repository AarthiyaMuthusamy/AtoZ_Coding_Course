package Dsa_Pattern.MonotonicStack;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreater(nums1,nums2)));
    }
    public static int[] nextGreater(int[] nums1, int[] nums2){
        int[] ans = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = nums2.length-1;i>=0;i--){
            while (!stack.isEmpty() && stack.peek() <= nums2[i]){
                stack.pop();
            }
            int val = stack.isEmpty() ? -1: stack.peek();
            map.put(nums2[i], val);
            stack.push(nums2[i]);
        }

        for (int i = 0; i < nums1.length ; i++) {
            if(map.containsKey(nums1[i])){
                ans[i] = map.get(nums1[i]);
            }
        }
        return ans;
    }
}
