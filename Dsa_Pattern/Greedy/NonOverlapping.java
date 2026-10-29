package Dsa_Pattern.Greedy;

import java.util.Arrays;

public class NonOverlapping {
    public static void main(String[] args) {
        int[][] intervals= {{1,3},{2,6},{8,10},{9,12}};
        System.out.println(nonOverlapping(intervals));
    }
    public static int nonOverlapping(int[][] intervals){
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[1],b[1]));
        int removals = 0;
        int lastend = intervals[0][1];
        for (int i = 1; i < intervals.length ; i++) {
            if(intervals[i][0] >= lastend){
                lastend = intervals[i][1];
            }else{
                removals++;
            }
        }
        return removals;
    }
}
