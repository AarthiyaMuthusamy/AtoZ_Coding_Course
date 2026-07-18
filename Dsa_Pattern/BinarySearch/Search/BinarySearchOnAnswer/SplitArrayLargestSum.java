package Dsa_Pattern.BinarySearch.Search.BinarySearchOnAnswer;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {1,4,4}; //7,2,5,10,8 //1,2,3,4,5
        int k = 3; //2 //2
        System.out.println(findSubArrays(nums,k));
    }

    public static int findMax(int[] nums){
        int max = 0;
        for(int num : nums){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
    public static int sumOfArray(int[] nums){
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        return sum;
    }
    public static int findSubArrays(int[] nums, int k){
        int left = findMax(nums);
        int right = sumOfArray(nums);

        while (left <= right){
            int mid = left + (right -left) /2;

            if(requiredSubArrays(mid,nums) <= k)
                right = mid-1;
            else
                left = mid+1;
        }
        return left;

    }

    public static int requiredSubArrays(int mid , int[] nums){
        int sum = 0;
        int subArrayRequired = 1;
        for (int num : nums){
            sum += num;
            if(sum > mid){
                subArrayRequired++;
                sum = num;
            }
        }
        return subArrayRequired;
    }

}
