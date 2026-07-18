public class IntegerToRoman {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(integerToRomanValues(num));
    }

    public static String integerToRomanValues(int num){
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String [] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < values.length ; i++) {
            while (num >= values[i]){
                ans.append(roman[i]);
                num -= values[i];
            }
        }
        return ans.toString();

    }
}
