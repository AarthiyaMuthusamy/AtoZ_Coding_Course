package Dsa_Pattern.TwoPointer;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};

        System.out.println(Arrays.toString(duplicateZeros(arr)));

    }

    /*
    Example 1:

Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: arr = [1,2,3]


Output: [1,2,3]
Explanation: After calling your function, the input array is modified to: [1,2,3]
     */
    public static int[] duplicateZeros(int[] arr) {
        int[] result = new int[arr.length];

        int i = 0;
        int j = 0;
        while (j < result.length && i < arr.length){
            if(arr[i] == 0){
                result[j] = arr[i];
                result[j+1] = arr[i];
                j+=2;
            }else{
                result[j] = arr[i];
                j++;

            }
            i++;
        }
        return result;

    }

}
