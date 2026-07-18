public class TrailingFactorialZeros {
    public static void main(String[] args) {
        int n = 25;
        System.out.println(trailingZeroes(n));

    }

    public static int trailingZeroes(int n) {
        if(n<5){
            return 0;
        }

        int count = 0;
        while(n > 0){
            n/=5;
            count += n;
        }
        return count;
    }
}
