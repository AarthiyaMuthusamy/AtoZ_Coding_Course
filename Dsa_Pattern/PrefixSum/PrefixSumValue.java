package Dsa_Pattern.PrefixSum;

import java.util.Arrays;

public class PrefixSumValue {
    public static void main(String[] args) {
        int[] arr = {2,1,4,5,3};
        System.out.println(Arrays.toString(prefixArrayValue(arr)));
        System.out.println(Arrays.toString(prefixSpaceReduce(arr)));

    }

    //add the cumulative array values to get the subarray sum value easily. Instead of running loop
    //Time O(n) , Space O(n) => we are store it on another array
    public static int[] prefixArrayValue(int[] arr){
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length ; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        return prefix;
    }

    //Time O(n) , Space O(1) in-place cumulative sum of array values
    public static int[] prefixSpaceReduce(int[] arr){
        for (int i = 1; i < arr.length ; i++) {
            arr[i] = arr[i-1] + arr[i];
        }

        return arr;
    }




}
