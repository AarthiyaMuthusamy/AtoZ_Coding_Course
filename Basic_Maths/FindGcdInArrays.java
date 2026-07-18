public class FindGcdInArrays {
    public static void main(String[] args) {
       int[] nums = {2,5,6,9,10};
        System.out.println(findGCD(nums));
    }

    public static int findGCD(int[] nums) {
        int smallestNumber = findMin(nums);
        int largestNumber = findMax(nums);
        return gcd(smallestNumber, largestNumber);

    }
    public static int findMax(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
    public static int findMin(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            if(num < min){
                min = num;
            }
        }
        return min;
    }
    public static int gcd(int n1, int n2){
        while(n1 > 0 && n2 > 0){
            if(n1 > n2) n1 = n1 % n2;
            else n2 = n2 % n1;
        }
        return (n1 == 0) ? n2 : n1;
    }
}
