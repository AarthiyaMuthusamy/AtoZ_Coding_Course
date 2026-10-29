package Dsa_Pattern.AdvancedProblem;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] nums = {1,2};//1,1,1,3,3,2,2,2
        System.out.println(findMajorityElement(nums));
    }
    public static List<Integer> findMajorityElement(int[] nums){

        int candidate1= 0;
        int candidate2= 0;
        int count1 = 0;
        int count2 = 0;

        //first pass for find the two major candidate
        for (int num : nums){
            if(num == candidate1){
                count1++;
            }
            else if(num == candidate2){
                count2++;
            }
            else if(count1 == 0) {
                candidate1 = num;
                count1 = 1;
            }
            else if(count2 == 0) {
                candidate2 = num;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        //second pass with 2 candidate
        count1 = 0;
        count2 = 0;

        for (int num : nums){
            if(num == candidate1){
                count1++;
            }
            else if(num == candidate2){
                count2++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        if (count1  > nums.length/3){
            ans.add(candidate1);
        }
        if(count2 > nums.length/3){
            ans.add(candidate2);
        }

        return ans;
    }
}
