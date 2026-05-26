import java.util.Scanner;

public class reverseNumber {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(reverseDigits(n));

  }

  public static int reverseDigits(int n){
    int reverseNumber = 0;
    while (n > 0) {
      int lastDigit = n % 10; //it will return the reminder , so the last digit will retun
      
      n /= 10;  //it moves to next whole integer, when we divide we get the 778.9 so the whole integer are taking
      reverseNumber = (reverseNumber * 10 ) + lastDigit; // (0 * 10) + 9 = 9 this will add the lastdidgit
    }

    return reverseNumber;
  }
}
