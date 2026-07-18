package Dsa_Pattern.SlidingWindow;

public class MaxOfEveryWindow {
    public static void main(String[] args) {
        int[] arr = {10,60,30,40,50};
        int k = 3;
        System.out.println(everyWindowMaximum(arr,k));
    }

    public static int everyWindowMaximum(int[] arr, int k){
        int sum = 0;
        for (int i = 0; i < k ; i++) {
            sum += arr[i];
        }

        int maxSum = sum;

        for (int i = k; i < arr.length ; i++) {
            sum = sum - arr[i-k] + arr[i];
            maxSum = Math.max(maxSum, sum);

        }
        return maxSum;
    }


}
