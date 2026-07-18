package ArrayProblems.Searching;

public class CountTargetElement {
    public static void main(String[] args) {
        int[] arr  = {3,5,3,6,3,4,7,4,1};
        int target = 3;
        System.out.println(countElement(arr,target));
    }
    private static int countElement(int[] arr, int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                count++;
        }
        return count;
    }

}
