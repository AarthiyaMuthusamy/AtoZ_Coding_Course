package Dsa_Pattern.AdvancedProblem;

import java.util.ArrayList;

import java.util.List;

public class LeadersInArrayElement {
    public static void main(String[] args) {
        int[] nums = {16,17,4,3,5,2};
        System.out.println(findLeaders(nums));


    }
    public static List<Integer> findLeaders(int[] nums){
        List<Integer> ans = new ArrayList<>();
        int current = 0;
        int maxValue = Integer.MIN_VALUE;

        for (int j = nums.length-1; j > 0 ; j--) {
            if(nums[j] > maxValue){
                maxValue = nums[j];
                current = maxValue;
                ans.add(current);

            }
        }




        return ans.reversed();
    }
}
