package Dsa_Pattern.PrefixSum;

import java.util.Arrays;

//LeetCode : 303 solution
class NumArray{

    private int[] prefix;
   public NumArray(int[] nums){
       prefix = new int[nums.length];
       if(nums.length == 0) return;
       for (int i = 1; i < nums.length ; i++) {
           prefix[i] = prefix[i-1] + nums[i];
       }

   }

   public int sumRange(int left, int right){
       if(left == 0){
           return prefix[right];
       }
       return prefix[right] - prefix[left-1];
   }

    public static void main(String[] args) {
        int[] nums = {-2,0,3,-5,2,-1};
        NumArray obj = new NumArray(nums);
        System.out.println(obj.sumRange(0,2));
        System.out.println(obj.sumRange(2,5));
        System.out.println(obj.sumRange(0,5));
    }
}

public class RangeSumQuery {
    public static void main(String[] args) {

        int[][] arr = {{-2,0,3,-5,2,-1},{0,2},{2,5},{0,5}};
        int[] prefix = prefixSumValue(arr[0]);
        int[] result = new int[arr.length];
        for (int i = 1; i < arr.length ; i++) {
            result[i] = sumRange(arr[i][0] , arr[i][1],prefix);
        }
        System.out.println(Arrays.toString(result));


    }

    public static int[] prefixSumValue(int[] arr){
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length ; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        return prefix;
    }

    public static int sumRange(int left, int right,int[] arr){
        int sum = 0;

        if(left <= right){
            if(left == 0){
                sum = arr[right];
            }
            else {
                sum = arr[right] - arr[left - 1];
            }
        }
        return sum;
    }
}
