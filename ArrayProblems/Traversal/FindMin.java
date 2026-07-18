package ArrayProblems.Traversal;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,9,1};
        System.out.println(findMinElement(arr));

    }
    private static int findMinElement(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
