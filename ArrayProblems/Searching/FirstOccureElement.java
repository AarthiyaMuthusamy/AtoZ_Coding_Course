package ArrayProblems.Searching;

public class FirstOccureElement {
    public static void main(String[] args) {
        int[] arr  = {3,5,3,6,3,4,7,4,1};
        int target = 4;
        System.out.println(firstElement(arr,target));
    }
    private static int firstElement(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
}
