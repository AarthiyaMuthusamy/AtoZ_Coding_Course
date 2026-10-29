package Dsa_Pattern.BinarySearch.Search.Matrix;

import java.util.Arrays;

public class FindPeakElementII {
    public static void main(String[] args) {
        int[][] matrix = {{10,8,10,10},{14,13,12,11},{15,9,11,21},{16,17,19,20}}; //{1,4},{3,2}
        System.out.println(Arrays.toString(findPeakElementInMatrix(matrix)));

    }
    public static int[] findPeakElementInMatrix(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int leftRow = 0;
        int rightRow = matrix.length;

        while (leftRow <= rightRow){
            int midRow = leftRow + (rightRow - leftRow)/2;
            int midCol = 0;
            for (int col = 1; col < matrix[0].length; col++) {
                if(matrix[midRow][col] > matrix[midRow][midCol]){
                    midCol = col;
                }
            }
            int up = (midRow > 0) ? matrix[midRow-1][midCol] : -1; //this for check the up element when there out of bound -1 need to check
            int down = (midRow < rows-1) ? matrix[midRow+1][midCol] : -1; //same for down so check it this will be boundry or else
            int current = matrix[midRow][midCol];
            if(current > up && current > down){
                return  new int[]{midRow,midCol};
            } else if (up > current) {
                rightRow = midRow-1;
            }
            else{
                leftRow = midRow + 1;
            }

        }

        return  new int[]{-1,-1};
    }

}
