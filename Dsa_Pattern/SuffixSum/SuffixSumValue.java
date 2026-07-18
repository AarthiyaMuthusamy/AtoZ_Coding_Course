package Dsa_Pattern.SuffixSum;

import java.util.Arrays;

public class SuffixSumValue {
    public static void main(String[] args) {
        int[] arr = {2,4,1,5,3};
        System.out.println(Arrays.toString(suffixSum(arr)));

    }

    public static int[] suffixSum(int[] arr){
        int[] result = new int[arr.length];
        int n = result.length;
        result[n-1] = arr[n-1];

        for (int i = arr.length-2; i >= 0; i--) {
            result[i] = result[i+1] + arr[i];
        }
        return result;
    }
}
