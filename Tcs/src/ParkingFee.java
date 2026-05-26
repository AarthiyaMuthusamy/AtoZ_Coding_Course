import java.util.Scanner;

public class ParkingFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N <= 1){
            System.out.println("error");
        }else {
            if(N == 2){
                System.out.println( N * 200);
            } else if (N == 3) {
                System.out.println(N * 100);
            } else if (N > 5) {
                System.out.println(N * 50);
            }
        }
    }
}
