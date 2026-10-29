package Recursion.Intermetiate;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        int[] num = {1,1,2,5};
        int target = 3;
        System.out.println(combinationSum(num,target));
    }
    public static List<List<Integer>> combinationSum(int[] num,int target){
        List<List<Integer>> ans = new ArrayList<>();
        int sum = 0;
        helper(0,num,target,new ArrayList<>(),ans,sum);
        return ans;
    }
    public static void helper(int start,int[] num,int target,List<Integer> current,List<List<Integer>> ans,int sum){
        if(sum == target){
            ans.add(new ArrayList<>(current));
            return;
        }
        if(sum > target){
            return;
        }
        for (int i = start; i < num.length; i++) {
            if(i > start && num[i] == num[i-1]){
                continue;
            }
            sum += num[i];
            current.add(num[i]);
            helper(i+1,num,target,current,ans,sum);
            sum -= num[i];
            current.remove(current.size()-1);
        }
    }
}
