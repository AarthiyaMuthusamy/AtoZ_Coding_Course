import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintAllDivisors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //divisors(n);
    divisorsModified(n);
    sc.close();
 
  }


  //time complexity is O(n)
  public static void divisors(int n){
      for (int i = 1; i < n; i++) {
        if( n % i == 0){
          System.out.println(i);
        }
        
      }
  }

  public static void divisorsModified(int n){
    List<Integer> ls = new ArrayList<>();

    for (int i = 1; i <= Math.sqrt(n); i++) {
      if(n % i == 0){
        ls.add(i);
      
      if((n/i) != i){
        ls.add(n/i);
      }
    }

    }

    
    ls.sort(null);
    for (int i = 0; i < ls.size(); i++) {
      System.out.println(ls.get(i));
    }
  }


}
