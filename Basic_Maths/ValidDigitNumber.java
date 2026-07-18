public class ValidDigitNumber {
    public static void main(String[] args) {
        int n = 2121;
        int x = 2;
        System.out.println(validDigit(n,x));
    }

    public static boolean validDigit(int n, int x) {
        int original = n;
        int firstDigit = singleDigit(original);
        while(n>0){
            int digit = n%10;
            if(digit == x && firstDigit != x){
                return true;
            }
            n/=10;
        }

        return false;
    }

    public static int singleDigit(int n){
        while(n >=10){
            n/=10;
        }
        return n;
    }
}
