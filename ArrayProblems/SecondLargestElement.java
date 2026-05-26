package ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr  = new int[N];

        for (int i = 0; i < N ; i++) {
            arr[i] = sc.nextInt();
        }

        //System.out.println(secondLargest(arr,N));
        System.out.println(secondLargestOptimal(arr,N));

    }


    //brute force solution
    //Time O(NlogN)
    public static int secondLargest(int[] arr , int N){
       if(N == 0 || N == 1){
           return -1;
       }
        Arrays.sort(arr);
        return arr[arr.length-2];
    }


    // Time O(N)
    public static int secondLargestOptimal(int[] arr,int N){
        if(N == 0 || N == 1){
            return -1;
        }
        int FirstLargest = arr[0];
        int SecondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < N ; i++) {
            if(arr[i] > FirstLargest){
                SecondLargest = FirstLargest;
                FirstLargest = arr[i];
            }else if(arr[i] < FirstLargest && arr[i] > SecondLargest){
                SecondLargest = arr[i];
            }
        }

        return SecondLargest;

    }
}
