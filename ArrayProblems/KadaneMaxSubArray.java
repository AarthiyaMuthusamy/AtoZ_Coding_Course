package ArrayProblems;


public class KadaneMaxSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        kadaneIndices(arr);

    }

    /*
    Kadane's algorithm used to find max subarray sum => when having negative value it should give the negative value so better to remove the negative value to max.
    If current sum becomes negative -> discard it
    Start fresh from next element
    Actually a special DP/Greedy optimization problem
    */

    public static void kadaneIndices(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int Start = 0;
        int begin = -1;
        int end = -1;


        for (int j = 0; j < arr.length; j++){
            if(sum == 0){
                Start = j;
            }
            sum += arr[j];
            if(sum > max){
                max = sum;
                begin = Start;
                end = j;
            }

            if(sum < 0){
                sum = 0;
            }


        }


        System.out.println("Max is : " +  max);
        System.out.println("Indices start with : " + begin + " to " + end);
    }
}
