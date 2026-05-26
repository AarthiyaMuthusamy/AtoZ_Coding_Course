import java.util.Scanner;

public class Gcd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    //System.out.println(gcd(n1, n2));
    gcd1(n1, n2);
    
  }
  

  //brute force

  // public static int gcd(int n1, int n2){
  //   int gcd = 1;
  //   for (int i = 1; i <= n1; i++) {
  //     if((n1%i == 0) && (n2%i == 0)){
  //       gcd = i;
  //     }
  //   }
  //   return gcd;

  // }


  //better approach
   public static void gcd(int n1, int n2){
    
    for (int i = Math.min(n1, n2); i >= 1; i++) {
      if((n1%i == 0) && (n2%i == 0)){
        System.out.println(i);
        break;
      }
    }
   

  }

//using the euclidean algorithm
  public static void gcd1(int n1, int n2){
    while(n1 > 0 && n2 > 0){
      if(n1 > n2) n1 = n1 % n2;
      else n2 = n2 % n1;
    }
    if(n1 == 0) System.out.println(n2);
    if(n2 == 0) System.out.println(n1);


  }


}


