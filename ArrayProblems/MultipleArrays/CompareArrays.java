package ArrayProblems.MultipleArrays;

import java.util.Arrays;

public class CompareArrays {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 2, 3};
        for (int i = 0; i < nums1.length && i < nums2.length; i++) {

                if (nums1[i] == nums2[i])
                    System.out.println("true");
                else
                    System.out.println("false");


        }

    }

}


