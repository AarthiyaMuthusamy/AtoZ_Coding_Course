package InputFormat;

import java.util.Scanner;

public class StringAndDigitSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3 ; i++) {
                String s1 = sc.next();
                int x = sc.nextInt();
                if(x >= 100){
                    System.out.printf("%-15s%3d",s1,x);
                }
                else{
                    System.out.printf("%-15s%03d",s1,x);
                }

        }
        System.out.println("================================");
    }
}
