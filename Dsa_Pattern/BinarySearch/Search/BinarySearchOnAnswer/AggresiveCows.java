package Dsa_Pattern.BinarySearch.Search.BinarySearchOnAnswer;

import java.util.Arrays;

public class AggresiveCows {
    public static void main(String[] args) {
        int[] stalls = {1,5,10,15,20}; //1,2,4,8,9 //10,1,2,7,5 //1,2,4,8,9,12 //10,20,30,40,50  //1,5,10,15,20 //1,3,7,10,14,20
        int k = 3; //3
        System.out.println(findMinDistance(stalls,k));

    }
    public static int findMax(int[] weights){
        int max = 0;
        for(int num : weights){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
    public static int findMin(int[] weights) {
        int min = 0;
        for (int num : weights) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public static int findMinDistance(int[] stalls,int k){
         Arrays.sort(stalls);
        int left = 1;
        int right = stalls[stalls.length-1] - stalls[0] ;
        //int ans = 0;

        while (left <= right){
            int mid = left + (right -left)/2;

            if(canPlace(mid,stalls,k)){

                left = mid + 1;
            }

            else{
                right = mid-1;
            }


        }
        return right;

    }

    public static boolean canPlace(int mid , int[] stalls, int k){
        int count = 1;
        int lastPlaced = stalls[0];

        for (int j = 1; j < stalls.length; j++) {
           int distance = stalls[j] - lastPlaced;
            if(distance >= mid){
                count++;
                lastPlaced = stalls[j];
            }

            if(count == k){
                return true;
            }

        }


        return false;
    }

}
