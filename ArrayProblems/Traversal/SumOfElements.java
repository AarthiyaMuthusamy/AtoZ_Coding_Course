package ArrayProblems.Traversal;

public class SumOfElements {
    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        System.out.println(sumOfElement(arr));
    }

    private static int sumOfElement(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
