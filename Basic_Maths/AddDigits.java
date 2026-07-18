public class AddDigits {
    public static void main(String[] args) {
        int n =  38;// 10; //199; //10\
        System.out.println(addDigits(n));
    }

    public static int addDigits(int num) {
        if(num <= 9){
            return num;
        }

        int digitVal = sumOfDigits(num);
        while (digitVal > 9){

            digitVal = sumOfDigits(digitVal);

        }

        return digitVal;


    }
    private  static int sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit;
            n/=10;
        }
        return sum;
    }
}
