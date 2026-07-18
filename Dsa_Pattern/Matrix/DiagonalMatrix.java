package Dsa_Pattern.Matrix;

import java.util.ArrayList;
import java.util.Collections;

public class DiagonalMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3} , {4,5,6}, {7,8,9}};
        diagonalMatrix(matrix);
        diagonalTopRight(matrix);
        diagonalZigZag(matrix);
    }

    public static void diagonalMatrix(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int d = 0; d < rows + cols -1; d++) {
            int row = 0;
            int col = d;
            if(col >= cols){
                row = col -cols+1;
                col = cols-1;

            }

            while (row < rows && col >= 0){
                System.out.print(matrix[row][col] + " ");
                row++;
                col--;
            }
            System.out.println();
        }
    }

    public static void diagonalTopRight(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        //top row
        for(int startCol = cols-1;startCol >= 0;startCol--){
            int row = 0;
            int col = startCol;
            while (row < rows && col < cols){
                System.out.print(matrix[row][col] + " ");
                row ++;
                col++;
            }
            System.out.println();

        }

        //first column
        for(int startRow = 1;startRow < rows;startRow++){
            int row = startRow;
            int col = 0;
            while (row < rows && col < cols){
                System.out.print(matrix[row][col] + " ");
                row ++;
                col++;
            }
            System.out.println();

        }
    }

    public static void diagonalZigZag(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;


        for (int d = 0; d < rows + cols -1; d++) {
            ArrayList<Integer> diagonal = new ArrayList<>();
            int row = 0;
            int col = d;
            if(col >= cols){
                row = col -cols+1;
                col = cols-1;

            }

            while (row < rows && col >= 0){
                diagonal.add(matrix[row][col]);
                row++;
                col--;
            }
            if( d % 2 == 0){
                Collections.reverse(diagonal);
            }

            for (int num : diagonal){
                System.out.print(num + " ");
            }

        }
    }
}
