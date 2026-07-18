package ArrayProblems;

import java.util.Arrays;

public class ShuffleArray {
    /*
    Input: nums = [2,5,1,3,4,7], n = 3
    Output: [2,3,5,4,1,7]
    Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
     */
    public static void main(String[] args) {
        int[] num ={2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(num,n)));

    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans  = new int[2*n];
        int j=0;
        for(int i=0; i<2*n; i=i+2){
            ans[i] = nums[j];
            ans[i+1] = nums[n+j];
            j++;
        }
        return ans;

    }

}
