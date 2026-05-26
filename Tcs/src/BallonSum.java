import  java.io.*;
import java.util.*;
public class BallonSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split(",");
        int N = Integer.parseInt(parts[0]);
        int X = Integer.parseInt(parts[parts.length-1]);
        System.out.println(N +" " + X);

        int[] S = new int[parts.length-2];
        int index = 0;
        for (int i = 1; i < parts.length-1; i++) {
            S[index] = Integer.parseInt(parts[i]);
            index++;
        }

        Arrays.sort(S);

        int sum = 0;
        int count = 0;
        for (int i = 0; i < S.length; i++) {
            sum += S[i];
            if( sum > X){
                break;
            }
            count ++;
        }

        System.out.println(count);
    }
}
