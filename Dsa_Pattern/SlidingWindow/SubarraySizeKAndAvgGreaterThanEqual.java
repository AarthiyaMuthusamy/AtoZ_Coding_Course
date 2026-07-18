package Dsa_Pattern.SlidingWindow;

public class SubarraySizeKAndAvgGreaterThanEqual {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,5,8};//{1,1,1,1,1};
        int k = 3;
        int threshold = 4;
        System.out.println(numberOfSubarray(arr,k,threshold));

    }

    public static int numberOfSubarray(int[] nums, int k , int threshold){
        int count = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        if(sum >= threshold * k){
            count++;
        }
        for (int  i= k; i < nums.length ; i++) {
            sum += nums[i] - nums[i-k];

            if(sum >= threshold * k){
                count++;
            }
        }
        return count;
    }


}
