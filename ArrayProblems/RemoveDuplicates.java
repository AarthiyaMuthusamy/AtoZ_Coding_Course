package ArrayProblems;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicate(nums));

    }


    //brute force Time O(N) , Space O(N)
    public static int removeDuplicate(int[] nums){
        if(nums.length == 1){
            return 1;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums){
            if(!set.contains(num)){
                set.add(num);
            }
        }
        return set.size();
    }

    //optimal approach using two pointers without having space O(1)
    
 }
