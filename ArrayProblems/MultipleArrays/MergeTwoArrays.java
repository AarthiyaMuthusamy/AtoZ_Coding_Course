package ArrayProblems.MultipleArrays;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] n1 = {7,2,3,4};
        int[] n2 = {1,6,8,5};
        int[] result = new int[n1.length + n2.length];

        int k = 0;
        for(int i = 0; i < n1.length; i++) {
            result[k] = n1[i];
            k++;

        }
        for(int j = 0; j < n2.length; j++) {
            result[k] = n2[j];
            k++;
        }

        System.out.println(Arrays.toString(result));

    }

}
