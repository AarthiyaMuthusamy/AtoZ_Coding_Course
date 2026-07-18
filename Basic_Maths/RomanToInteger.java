public class RomanToInteger {
    public static void main(String[] args) {
        String str = "LVIII";
        System.out.println(romanIntegerConverter(str));
    }

    public static int romanIntegerConverter(String str){
        int ans = 0;
        for (int i = 0; i < str.length() ; i++) {
            int current  = getRomanValues(str.charAt(i));
            if(i == str.length()-1){
                ans += current;
            }
            else {
                int next = getRomanValues(str.charAt(i+1));
                if(current < next){
                    ans -= current;
                }
                else{
                    ans += current;
                }
            }
        }
        return ans;
    }

    public static int getRomanValues(char ch){
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;

        }
        return 0;
    }
}
