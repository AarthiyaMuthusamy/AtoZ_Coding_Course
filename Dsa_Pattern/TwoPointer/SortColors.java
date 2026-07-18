package Dsa_Pattern.TwoPointer;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {1,0,2};
        sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    //dutch national flag algorithm
    public  static void sortColors(int[] nums) {
        int low =0;
        int high = nums.length-1;
        int mid = 0;

        while(mid <= high) {
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }

        }


    }

    //another approach

    public void sortColors1(int[] nums) {
        int[] ans = new int[nums.length];
        int index = 0;

        for (int color = 0; color <= 2; color++) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == color) {
                    ans[index++] = nums[i];
                }
            }
        }

        // Copy back to nums
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans[i];
        }
    }

}
