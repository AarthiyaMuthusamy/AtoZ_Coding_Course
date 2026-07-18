package ArrayProblems.Traversal;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,9,1};
        System.out.println(findMaxElement(arr));

    }
    private static int findMaxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
