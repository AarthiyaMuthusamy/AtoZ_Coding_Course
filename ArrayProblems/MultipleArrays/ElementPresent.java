package ArrayProblems.MultipleArrays;

import java.util.Arrays;

public class ElementPresent {
    public static void main(String[] args) {
        int[] n1 = {9,2,3,4};
        int[] n2 = {1,6,3,2};

        int[] ans = new int[n1.length];

        boolean isfind = false;
        for (int i = 0; i < n1.length; i++) {
            for (int j = 0; j < n2.length; j++) {
                if(n1[i] == n2[j]){
                     isfind = true;

                }

            }
            if(isfind){
                ans[i] = n1[i];
            }else{
                ans[i] = -1;
            }


        }
        System.out.println(Arrays.toString(ans));
    }
}
