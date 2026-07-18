package Dsa_Pattern.BinarySearch.Search;

public class Badversion {
    public static void main(String[] args) {
        int n = 4;
        int bad = 1;
        System.out.println(firstBadVersion(n,bad));


    }
    /*
    Example 1:

Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.
Example 2:

Input: n = 1, bad = 1
Output: 1
     */

    public  static int firstBadVersion(int n, int bad) {
        int l = 1;
        int right = n;

        int ans = n;
        while (l < right){
            int mid = l + (right - l)/2;
            if(isBadVersion(mid,bad)){
                right = mid;

            }else{
                l = mid+1;
            }
        }
        return l;


    }
    public static boolean isBadVersion(int n, int bad){
        if(n == bad){
            return true;
        }
        return false;
    }
}
