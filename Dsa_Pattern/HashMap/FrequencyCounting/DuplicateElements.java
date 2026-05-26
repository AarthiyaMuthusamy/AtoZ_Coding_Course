package Dsa_Pattern.HashMap.FrequencyCounting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/* Find duplicate elements:
Input : nums = {1,2,3,2,4,1}
ouput : [1,2]
* */

public class DuplicateElements {
    public static void main(String[] args) {
        //int[] nums = {1,2,3,2,4,1};
        //int[] nums = {1,2};
        int[] nums = { };
        System.out.println(duplicateElements(nums));

    }
    public static List<Integer> duplicateElements(int[] nums){
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> duplicatMap = new HashMap<>();

        if(nums.length == 0 | nums.length == 1){
            return null;
        }

        for (int num : nums){
            duplicatMap.put(num , duplicatMap.getOrDefault(num , 0) + 1);
        }

        for (Map.Entry<Integer,Integer> entry : duplicatMap.entrySet()){
            if(entry.getValue() > 1){
                list.add(entry.getKey());
            }

        }

        return list;

    }
}
