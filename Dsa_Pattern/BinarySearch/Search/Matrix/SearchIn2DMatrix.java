package Dsa_Pattern.BinarySearch.Search.Matrix;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchInMatrix(matrix,target));

    }
    public static boolean searchInMatrix(int[][] matrix,int target){
        int rows = matrix.length;
        int columns = matrix[0].length;
        int left = 0;
        int right = rows * columns -1; //visulaize 2d as 1D array so find the total length using this formula

        while (left <= right){
            int mid = left + (right -left)/2;
            //1D matrix to convert index as 2D matrix
            int row = mid / columns; //it points to the row index
            int col = mid % columns; //it points to the col index
            if(target == matrix[row][col]){
                return true;
            }
            else if(target < matrix[row][col]){
                right = mid-1;
            }
            else {
                left = mid +1;
            }
        }
        return false;
    }
}
