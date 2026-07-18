package Dsa_Pattern.Matrix;

import java.util.Scanner;

public class MatrixInput {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = sc.nextInt();
            }
            System.out.println("");
        }


        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println(" ");
        }
    }
}
