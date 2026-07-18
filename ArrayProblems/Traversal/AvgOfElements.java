package ArrayProblems.Traversal;

public class AvgOfElements {
    public static void main(String[] args) {
          int[] arr = {4,3,1,2};
        System.out.println(avgOfElements(arr));
    }
    private static double avgOfElements(int[] arr){
        return (double) sumOfElement(arr) / 2;
    }
    public static int sumOfElement(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
