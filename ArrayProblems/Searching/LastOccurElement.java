package ArrayProblems.Searching;

public class LastOccurElement {
    public static void main(String[] args) {
        int[] arr  = {3,5,3,6,3,4,7,4,4};
        int target = 4;
        System.out.println(lastElement(arr,target));
    }
    private static int lastElement(int[] arr, int target){
        int last =-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                last = i;
        }
        return last;
    }
}
