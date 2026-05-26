import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(checkPalindrom(n));

  }

  public static boolean checkPalindrom(int n){
    int reversed = n;
    int reverseNumber = 0;
    while (n > 0) {
      int lastDigit = n % 10; //it will return the reminder , so the last digit will retun
      
      n /= 10;  //it moves to next whole integer, when we divide we get the 778.9 so the whole integer are taking
      reverseNumber = (reverseNumber * 10 ) + lastDigit; // (0 * 10) + 9 = 9 this will add the lastdidgit
    }

    if(reversed == reverseNumber){
      return true;
    }
    return false;
    
  }
}
