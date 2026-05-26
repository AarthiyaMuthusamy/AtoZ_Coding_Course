import java.util.Scanner;

public class ArmStrongNumber {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(armStrong(n));

  }

  public static int digits(int n){
    int count = 0;
    while (n > 0) {
      int lastDigit = n % 10; //it will return the reminder , so the last digit will retun
      count++;
      n /= 10;  //it moves to next whole integer, when we divide we get the 778.9 so the whole integer are taking
    }

    return count;
  }
  public static boolean armStrong(int n){
    int reversed = n;
    int len = digits(n);
    int sum = 0;
    while (n > 0) {
      int lastDigit = n % 10;
      sum = sum + (int) Math.pow(lastDigit, len); // in java power of method return the double ,need to return int using casting to get integer value
      //the length we have an the value is calculating power
      n /= 10;  
    }

    if(reversed == sum){
      return true;
    }
    return false;
    
  }
}
