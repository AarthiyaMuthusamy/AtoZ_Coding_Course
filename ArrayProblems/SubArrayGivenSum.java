package ArrayProblems;

import java.util.HashMap;

public class SubArrayGivenSum {
    public static void main(String[] args) {
        int[] arr = {10, 2 ,-2 ,-20,10};
        int target = -10;
        SubArraySum(arr,target);

    }

    /*
    Prefix sum + hashmap => find the subarray sum when hashmap have the value
     */
    public static void SubArraySum(int[] arr, int target){

        HashMap<Integer, Integer> hash = new HashMap<>();
        int prefix = 0;
        hash.put(0,-1);
        for (int i = 0; i < arr.length ; i++) {

            prefix += arr[i];
            if(hash.containsKey(prefix-target)){
                int start = hash.get(prefix - target) + 1;
                System.out.println("start with " + start + " " + i);
                return;
            }
            hash.put(prefix, i);

        }
        System.out.println("Not found");



    }
}
