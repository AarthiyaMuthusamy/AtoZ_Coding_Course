package Dsa_Pattern.SlidingWindow;

public class MaxConsuctiveOnesIII {
    public static void main(String[] args) {
        int[] nums = {0, 0,1, 1, 1, 0, 0}; //1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0
        int k = 0;
        System.out.println(consuctiveOne(nums,k));
    }
    public static int consuctiveOne(int[] nums,int k){
        int left =0;
        int zerosCount= 0;
        int maxOnes =0;
        for (int right = 0; right < nums.length; right++) {
            if(nums[right] == 0){
                zerosCount++;
            }
            while (zerosCount > k){
                if(nums[left] == 0){
                    zerosCount--;
                }
                left++;
            }
            maxOnes = Math.max(maxOnes,right-left+1);

        }
        return maxOnes;
    }

}
