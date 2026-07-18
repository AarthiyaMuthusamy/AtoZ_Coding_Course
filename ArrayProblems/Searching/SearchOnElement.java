package ArrayProblems.Searching;

public class SearchOnElement {
    public static void main(String[] args) {
        int[] arr  = {3,5,2,6,8,9,7,0,1};
        int target = 6;
        System.out.println(searchElement(arr,target));
    }

    private static int searchElement(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
}
