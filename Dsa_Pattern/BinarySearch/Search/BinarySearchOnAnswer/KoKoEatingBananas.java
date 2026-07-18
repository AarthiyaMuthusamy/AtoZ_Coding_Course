package Dsa_Pattern.BinarySearch.Search.BinarySearchOnAnswer;

public class KoKoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20}; //3,6,7,11  //30,11,23,4,20
        int h = 6; //8  //5  //6
        System.out.println(findMinPossibleSpeed(piles,h));

    }
    public static int findMax(int[] piles){
        int max = 0;
        for(int num : piles){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

    public static int findMinPossibleSpeed(int[] piles, int h){
        int left = 1; //minPossibleAnswer
        int right = findMax(piles);//maxPossibleAnswer

        while (left <= right){
            int mid = left + (right -left)/2;

            if(isPossible(mid,piles) <= h)
                right = mid-1;

            else
                left = mid +1;

        }
        return left;
    }

    public static int isPossible(int mid,int[] piles){
        int i = 0;
        int hours = 0;
        while (i < piles.length){
            hours += (piles[i] + mid-1)/mid;
            i++;
        }
        return hours;
    }

    /* Leetcode solution
     public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = getMax(piles);
        int ans = right;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (canFinish(piles, h, mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    private boolean canFinish(int[] piles, int h, int speed) {

        long hours = 0;

        for (int pile : piles) {
            hours += (pile + speed - 1) / speed;
        }

        return hours <= h;
    }

    private int getMax(int[] piles) {
        int max = piles[0];

        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }

        return max;
    }
     */


}
