package Dsa_Pattern.HashMap;

import java.util.HashMap;

public class SingleNumber {
    //return the non-repetive number
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        HashMap<Integer,Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for (int key : map.keySet()){
            if(map.get(key) == 1){
                System.out.println( key + " ");
            }
        }


    }
}
