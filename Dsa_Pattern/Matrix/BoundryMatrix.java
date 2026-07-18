package Dsa_Pattern.Matrix;

import java.util.Scanner;
//edge case
/*
single row , single column output will print that as output
 */
public class BoundryMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = sc.nextInt();
            }
            System.out.println("");
        }

        boundryPrint(matrix);
    }


    public static void boundryPrint(int[][] matrix){
        int rows = matrix.length-1;
        int cols = matrix[0].length-1;

        //top row
        for (int i = 0; i <= cols; i++) {
            System.out.print(matrix[0][i] + " ");
        }


        //right column
        for (int i = 1; i <= rows ; i++) {
            System.out.print(matrix[i][cols] + " ");
        }


        //bottom row
            for (int i = cols-1; i >= 0; i--) {
                System.out.print(matrix[rows][i] + " ");
            }



        //left column

            for (int i = rows-1; i > 0; i--) {
                System.out.print(matrix[i][0] + " ");
            }

    }
}
