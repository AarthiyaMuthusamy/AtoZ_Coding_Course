package Dsa_Pattern.BinarySearch.Search.BinarySearchOnAnswer;

public class CapacityToShipPackage {
    public static void main(String[] args) {
        int[] weights = {1,2,3,1,1}; //1,2,3,4,5,6,7,8,9,10 //3,2,2,4,1,4
        int days = 4; //5 //3
        System.out.println(findMinCapacity(weights,days));
    }
    public static int findMax(int[] weights){
        int max = 0;
        for(int num : weights){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
    public static int sumOfWeights(int[] weights){
        int sum = 0;
        for(int num : weights){
            sum += num;
        }
        return sum;
    }
    public static int findMinCapacity(int[] weights,int days){
        int left = findMax(weights);
        int right = sumOfWeights(weights);

        while (left <= right){
            int mid = left + (right -left) /2;

            if(requiredDays(mid,weights) <= days)
                right = mid-1;
            else
                left = mid+1;
        }
        return left;

    }
    public static int requiredDays(int mid , int[] weights){
        int capacity = 0;
        int daysRequired = 1;
        for (int num : weights){
            capacity += num;
            if(capacity > mid){
                daysRequired++;
                capacity = num;
            }
        }
        return daysRequired;
    }

}
