package Dsa_Pattern.TwoPointer;

import java.util.Arrays;

public class BoatsToSavePeople {
    public static void main(String[] args) {
         int[] people  = {3,2,2,1};
         int limit = 3;
        System.out.println(numRescueBoats(people,limit));
    }
    /*
    Example 1:

Input: people = [1,2], limit = 3
Output: 1
Explanation: 1 boat (1, 2)
Example 2:

Input: people = [3,2,2,1], limit = 3
Output: 3
Explanation: 3 boats (1, 2), (2) and (3)
Example 3:

Input: people = [3,5,3,4], limit = 5
Output: 4
Explanation: 4 boats (3), (3), (4), (5)
     */

    public  static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count =0;
        int i = 0;
        int j = people.length-1;

        while (i <= j){
            if(people[i] + people[j] <= limit){
                i++;
            }
            j--;
            count++;  //each iteration one boat used
        }

        return count;
    }
}
