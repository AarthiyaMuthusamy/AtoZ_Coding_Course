package ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(largest(arr,N));
        //System.out.println(LargestNumber(arr,N));
    }


    //brute force solution
    //Time O(N log N)
    public static int largest(int[] arr , int N){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    //Optimal Solution
    //Time O(N)
    public static int LargestNumber(int[] arr,int N){
        int max = arr[0];
        for (int i = 1; i < N ; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
