package CodingQuestion;

import java.util.Scanner;

public class RemoveAtOneBarrier {
    static final long MOD = 1_000_000_007L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }

        long[][] f= new long[n][n];
        long[][] g = new long[n][n];

        f[0][0] = 1;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == '#'){
                    f[i][j] = 0;
                    continue;
                }
                if(i > 0){
                    f[i][j] = (f[i][j] + f[i-1][j]) % MOD;
                }
                if(j >0){
                    f[i][j] = (f[i][j] + f[i][j-1]) % MOD;
                }
            }
        }

        g[n-1][n-1] = 1;
        for (int i = n-1; i >=0 ; i--) {
            for (int j = n-1; j >= 0 ; j--) {
                if(grid[i][j] == '#'){
                    g[i][j] = 0;
                    continue;
                }
                if(i < n-1){
                    g[i][j] = (g[i][j] + g[i+1][j]) % MOD;
                }
                if(j < n-1){
                    g[i][j] = (g[i][j] + g[i][j+1]) % MOD;
                }
            }
        }
        long base = f[n-1][n-1];
        long answer = 0;
        long barriers = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == '#'){
                    barriers++;
                }
            }
        }

        answer = ((barriers + 1) % MOD * base ) % MOD;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] =='#'){
                    long in = 0;
                    long out =0;
                    if(i > 0){
                        in = (in + f[i-1][j]) % MOD;
                    }
                    if(j > 0){
                        in = (in + f[i][j-1]) % MOD;
                    }
                    if(i < n-1){
                        out = (out + g[i+1][j]) % MOD;
                    }
                    if(j < n-1){
                        out = (out + g[i][j+1]) % MOD;
                    }

                    long extra = (in * out) % MOD;

                    answer = (answer + extra) % MOD;
                }
            }
        }

        System.out.println(answer);
    }
}
