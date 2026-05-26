import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
   // System.out.println(prime(N));
   System.out.println(prime1(N));
   sc.close();
  }

  //Brute force approach 
  public static boolean prime(int n){
    if(n <= 1){
      return  false; //edge case
    }
    int cnt = 0;
    for (int i = 1; i <= n; i++) {
      if(n%i == 0){
        cnt ++;
      }

    }
    return cnt == 2;
  }



  //Better approach
  public static boolean prime1(int n){
    int cnt = 0;
    for (int i = 1; i <= Math.sqrt(n); i++) {
      if(n%i == 0){
        cnt ++;
      
        if((n/i) != i){
          cnt++;
        } 
      }

    }
    return cnt == 2;
  }
}
