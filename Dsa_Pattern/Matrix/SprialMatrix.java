package Dsa_Pattern.Matrix;

import java.util.Scanner;

public class SprialMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = sc.nextInt();
            }
            System.out.println("");
        }

        spiralPrinting(matrix);
    }

    public static void spiralPrinting(int[][] matrix){
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;


        while(top <= bottom && left <= right){
            //top row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            //right column
            for (int i = top; i <= bottom ; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            //bottom row

            if(top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }


            //left column
            if(left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }

        }
    }
}
