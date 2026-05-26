import java.util.Scanner;

import static java.lang.Math.log10;


public class Digits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(digits(n));
    System.out.println(logDigits(n));
    sc.close();

  }

  //Time O(log N)
  public static int digits(int n){
    int count = 0;
    while (n > 0) {
      int lastDigit = n % 10; //it will return the reminder , so the last digit will retun
      count++;
      n /= 10;  //it moves to next whole integer, when we divide we get the 778.9 so the whole integer are taking
    }

    return count;
  }

  //Time O(1) for arithmetic operation
   public static int logDigits(int n){
     int cnt = (int) (log10(n) + 1);
     return  cnt;
   }
}
