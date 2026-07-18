package Dsa_Pattern.BinarySearch.Search.BinarySearchOnAnswer;

public class PainterspartitionProblem {
    public static void main(String[] args) {
        int[] boards = {10,20,30,40};
        int k = 2;
        System.out.println(findMinPossibleMaxValue(boards,k));

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
    public static int findMinPossibleMaxValue(int[] boards, int k){
        int left = findMax(boards);
        int right = sumOfArray(boards);

        while (left <= right){
            int mid = left + (right -left) /2;

            if(requiredPainters(mid,boards) <= k)
                right = mid-1;
            else
                left = mid+1;
        }
        return left;
    }

    public static int requiredPainters(int mid , int[] boards){
        int sum = boards[0];
        int painterRequired = 1;
        for (int i = 1; i < boards.length; i++) {
            sum += boards[i];
            if(sum > mid){
                painterRequired++;
                sum = boards[i];
            }

        }
        return painterRequired;
    }

}
