package Dsa_Pattern.TwoPointer;

public class TargetSumPairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,11};
        int target = 10;
        System.out.println(parisOfTarget(arr,target));
    }


    public static boolean parisOfTarget(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            if(arr[start] + arr[end] == target){
                return true;
            }
            start++;
            end--;
        }
        return false;
    }
}
