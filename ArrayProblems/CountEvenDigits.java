package ArrayProblems;

public class CountEvenDigits {
    public static void main(String[] args) {
        int[] num = {12,345,2,6,7896};
        System.out.println(findNumbers(num));
    }

    public static int findNumbers(int[] nums) {
        int evenCount =0;
        for(int i = 0;i<nums.length;i++){
            if((countDigit(nums[i])) % 2 == 0){
                evenCount++;
            }


        }

        return evenCount;
    }
    private static int countDigit(int n){
        int count = 0;
        while(n > 0){
            count++;
            n/=10;
        }
        return count;
    }
}
