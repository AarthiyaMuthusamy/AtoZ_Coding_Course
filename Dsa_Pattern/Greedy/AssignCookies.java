package Dsa_Pattern.Greedy;

import java.util.Arrays;

public class AssignCookies{
    public static void main(String[] args) {
        int[] greed = {1,2,3};
        int[] cookie = {2,1};
        System.out.println(MaxCookie(greed,cookie));

    }

    public static int MaxCookie(int[] greed, int[] cookie){
        Arrays.sort(greed);
        Arrays.sort(cookie);

        int i = 0;
        int j = 0;
        int count = 0;

        while (i < greed.length && j < cookie.length){
            if(cookie[j] >= greed[i]){
                count++;
                i++;
                j++;
            }
            else {
                j++;
            }

        }
        return count;
    }
}
