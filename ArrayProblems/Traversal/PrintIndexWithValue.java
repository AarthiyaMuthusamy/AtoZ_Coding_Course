package ArrayProblems.Traversal;

public class PrintIndexWithValue {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 9, 1};
        printIndexAndValues(arr);

    }
    private static void printIndexAndValues(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" \n Index: " + i + " Value: " + arr[i]);

        }
    }
}
