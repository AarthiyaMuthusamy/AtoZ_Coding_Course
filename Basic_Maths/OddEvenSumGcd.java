public class OddEvenSumGcd {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(gcdOfOddEvenSums(n));
    }

    public static int gcdOfOddEvenSums(int n) {
        int sumOfOdd = n*n; //16
        int sumOfEven = sumOfOdd + n; //20
        return gcd1(sumOfOdd, sumOfEven);

    }

    public static int gcd1(int n1, int n2){
        while(n1 > 0 && n2 > 0){
            if(n1 > n2) n1 = n1 % n2;
            else n2 = n2 % n1;
        }
        return (n1 == 0) ? n2 : n1;


    }
}
