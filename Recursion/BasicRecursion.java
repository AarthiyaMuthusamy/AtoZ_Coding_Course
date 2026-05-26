package Recursion;

import java.util.Scanner;

public class BasicRecursion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = sc.nextInt();
   // printNTime(i, n);
  //printOneToN(i,n);
    printNToOne(n);

  }


  //TIME = o(N) , space = O(N)

  public static void printNTime(int i, int n){
    
    if(i > n) return;
    System.out.println("Aarthiya");
    
    printNTime(i+1,n);

  }

  public static void printOneToN(int i, int n){
    
    if(i > n) return;
    System.out.println(i);
    
    printOneToN(i+1,n);

  }

  public static void printNToOne(int n){
    
    if(n < 1) return;
    System.out.println(n);
    
    printNToOne(n-1);

  }
}
