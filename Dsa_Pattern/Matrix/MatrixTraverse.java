package Dsa_Pattern.Matrix;

public class MatrixTraverse {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        for (int row = 0; row < mat.length ; row++) {
            for (int col = 0; col < mat[0].length ; col++) {
                System.out.print(mat[row][col] + " ");
            }

        }
        System.out.println(" ");


        //specific row
        //1^st row
        for (int col = 0; col < mat[0].length ; col++) {
            System.out.print(mat[0][col] + " ");
        }
        System.out.println(" ");
        //last row
        for (int col = 0; col < mat[0].length ; col++) {
            System.out.print(mat[2][col] + " ");
        }
        System.out.println(" ");

        //specific col
        //1^st col
        for (int row = 0; row < mat.length ; row++) {
            System.out.print(mat[row][0] + " ");
        }
        System.out.println(" ");
        for (int row = 0; row < mat.length ; row++) {
            System.out.print(mat[row][2] + " ");
        }

        


    }
}
