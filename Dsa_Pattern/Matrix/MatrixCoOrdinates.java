package Dsa_Pattern.Matrix;

import java.util.Arrays;

public class MatrixCoOrdinates {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        /*
        (0,0) (0,1) (0,2)  1 2 3
        (1,0) (1,1) (1,2)  4 5 6
        (2,0) (2,1) (2,2)  7 8 9
         */
        System.out.println(mat[1][2]);
        System.out.println(mat[0][0]);
        System.out.println(mat[2][2]);
        System.out.println(Arrays.toString(mat[0]));

    }


}
