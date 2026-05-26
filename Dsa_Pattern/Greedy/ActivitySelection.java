package Dsa_Pattern.Greedy;

import java.util.Arrays;

public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};
        System.out.println(activitySelection(start,end));

    }

    public static int activitySelection(int[] start, int[] end){
        int n = start.length;

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = start[i];
            arr[i][1] = end[i];
        }

        Arrays.sort(arr,(a,b)-> a[1] - b[1]);

        int count = 1;
        int lastEnd = arr[0][1];

        for (int i = 1; i < n ; i++) {
            if(arr[i][0] >= lastEnd){
                count++;
                lastEnd = arr[i][1];
            }

        }

        return count;
    }
}
