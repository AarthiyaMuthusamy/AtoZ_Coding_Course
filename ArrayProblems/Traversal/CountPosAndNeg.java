package ArrayProblems.Traversal;

import java.util.Arrays;

public class CountPosAndNeg {
    public static void main(String[] args) {
        int[] arr = {-2,4,-5,7,-9,1,8,3,-8};
        System.out.println(Arrays.toString(countPosNeg(arr)));

    }
    private static int[] countPosNeg(int[] arr){
        int posCount = 0;
        int negCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                posCount++;
            }
            else{
                negCount++;
            }
        }
        return new int[]{posCount,negCount};
    }
}
