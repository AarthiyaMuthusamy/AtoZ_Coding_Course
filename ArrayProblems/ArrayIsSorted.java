package ArrayProblems;

import java.util.Scanner;

public class ArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        for(int i = 0;i<N;i++){
            array[i] = sc.nextInt();
        }

        System.out.println(isSortedOptimal(array,N));


    }


    //brute force approach
    //Time O(N^2) we are using two for loops
    public static boolean IsSorted(int[] arr, int N){
        if(N == 0 || N == 1){
            return true;
        }

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
              if(arr[j] < arr[i])
                  return false;
            }
        }
        return true;
    }


    //optimal approach

    public static boolean isSortedOptimal(int[] arr , int N){
        if(N == 0 || N == 1){
            return true;
        }

        for (int i = 1; i < N; i++) {
            if(arr[i-1] > arr[i])
                return false;
        }
        return true;
    }
}
