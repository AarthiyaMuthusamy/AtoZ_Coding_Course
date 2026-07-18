public class perfectSquare {
    public static void main(String[] args) {
        int n = 28;
        System.out.println(divisorSum(n));
    }
    private static boolean divisorSum(int n){
        int original = n;
        int sum =1;
        if(n <= 1){
            return false;
        }

        for (int i = 2; i * i <= n  ; i++) {
            if(n%i == 0){
                sum += i;
                int pair = n/i;
                if( pair != i){
                    sum += pair;
                }
            }
        }

        return sum == original;
    }
}
