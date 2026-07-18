package Dsa_Pattern.BinarySearch.Search;

public class GuessHigherOrLower {
    public static void main(String[] args) {
        int n = 2; //10  1
        int pick = 1; //6
        System.out.println(guessNumber(n,pick));

    }
    /*
    Example 1:

Input: n = 10, pick = 6
Output: 6
Example 2:

Input: n = 1, pick = 1
Output: 1
Example 3:

Input: n = 2, pick = 1
Output: 1
     */

   public static int guessNumber(int n,int pick) {
        int left = 1;
        int right = n;
        int ans = 0;
        while (left <= right){
            int mid = left + (right - left)/2;
            if(guess(mid,pick) == 0){
                ans = mid;

            }else if(guess(mid,pick) == 1){
                left = mid +1;
            }
            else{
                right = mid-1;
            }

        }
        return ans;
   }

    public  static int guess(int num, int pick){
       if(num < pick)
           return 1;
       else if(num > pick)
           return -1;
       return 0;
    }
}
