package CodingQuestion;

import java.util.Scanner;

public class LedgerRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] records = new int[N];
        for (int i = 0; i < N; i++) {
            records[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        System.out.println(ledgerIncrements(records,M));
    }
    public static int ledgerIncrements(int[] records, int M){
        int increments = 0;
        int prev = records[0];

        for (int i = 1; i < records.length ; i++) {
            if(records[i] <= prev){
                int required = prev + 1;
                if(required > M){
                    return  -1;
                }
                increments += required-records[i];
                records[i] = required;
            }
            prev = records[i];
        }
        return increments;
    }
}
