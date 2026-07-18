package ArrayProblems.Traversal;

public class PrintInReverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        printReverse(arr);
    }

    private static void printReverse(int[] arr){
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
