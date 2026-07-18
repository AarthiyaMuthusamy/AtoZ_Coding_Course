package Dsa_Pattern.Matrix;

public class SearchMatrix {
    public static void main(String[] args) {

        int[][] matrix = {{1,4,7,11},{2,5,8,12},{3,6,9,16},{10,13,14,17}};
        int target = 9;
        System.out.println(findMatrixValue(matrix, target));

    }

    public static boolean findMatrixValue(int[][] matrix, int target){

        int row = 0;
        int col = matrix[0].length-1;

        while (row < matrix.length &&  col >= 0){
            if(matrix[row][col] == target)
                return true;
            else if (target < matrix[row][col])
                col--;

            else
                row++;
        }


        return false;
    }
}
