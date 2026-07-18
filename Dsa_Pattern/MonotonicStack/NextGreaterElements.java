package Dsa_Pattern.MonotonicStack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElements {
    public static void main(String[] args) {
        int[] nums = {2,1,2,4,3};
        int[] nums1= {5,5,5,5,5};
        int[] nums2 = {5,5,6};
        System.out.println(Arrays.toString(nextLeader(nums2)));
    }
    //optimal
    private static int[] nextLeader(int[] num){
        int[] result = new int[num.length];
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = num.length-1; i >= 0 ; i--) {
            while (!st.isEmpty() && st.peekLast() <= num[i]){
                st.pollLast();
            }
            result[i] = st.isEmpty() ? -1 : st.peekLast();
            st.add(num[i]);

        }
        return result;
    }


}
