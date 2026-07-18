package ArrayProblems.Traversal;

public class CountEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,9,1};
        System.out.println(countEven(arr));

    }
    private static int countEven(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }

}
