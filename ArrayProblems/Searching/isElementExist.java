package ArrayProblems.Searching;



public class isElementExist {
    public static void main(String[] args) {
        int[] arr  = {3,5,2,6,8,9,7,0,1};
        int target =11;
        System.out.println(isExist(arr,target));
    }
    private static boolean isExist(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                return true;
        }
        return false;
    }

}
