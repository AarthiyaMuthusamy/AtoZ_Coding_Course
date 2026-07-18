package Dsa_Pattern.SlidingWindow;

import java.util.HashSet;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums ={1,2,3,1,2,3};
        int k = 2;
        System.out.println(checkContainsDuplicate(nums,k));
    }

    public static boolean checkContainsDuplicate(int[] nums, int k){
        HashSet<Integer> set = new HashSet<>(nums.length);
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            //check condition first
            if(set.contains(nums[right])){
                return true;
            }
            set.add(nums[right]);

            //shrink when the window size is exceed the k using left and right pointer
            if(right -left + 1 > k){
                set.remove(nums[left]);
                left++;
            }

        }
        return false;

    }
}
