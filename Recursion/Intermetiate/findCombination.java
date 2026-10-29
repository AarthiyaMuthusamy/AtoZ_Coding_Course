package Recursion.Intermetiate;

import java.util.ArrayList;
import java.util.List;

public class findCombination {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(combination(nums));
    }


    public static List<List<Integer>> combination(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,nums,new ArrayList<>(),ans);
        return ans;
    }
    public static void helper(int index,int[] nums,List<Integer> current,List<List<Integer>> ans){

        if(index == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]); //add
        helper(index+1,nums,current,ans); //recursion
        current.remove(current.size()-1); //backtrack
        helper(index+1,nums,current,ans); //recursion

    }
}
