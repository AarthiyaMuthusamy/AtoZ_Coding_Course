public class NumberToTitle {
    public static void main(String[] args) {
        int n = 703;
        String str = "AA";
        System.out.println(convertToTitle(n));
        System.out.println(titleToNumber(str));

    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            int rem = columnNumber % 26;
            char ch = (char) ('A' + rem);
            result.append(ch);
            columnNumber/=26;

        }

        return result.reverse().toString();

    }

    public static int titleToNumber(String columnTitle) {
        int len = 0;
        int result = 0;
        while(len < columnTitle.length()){
            char ch = columnTitle.charAt(len);
            int value = ch - 'A' + 1;
            result = result * 26 + value;
            len++;
        }
        return result;
    }
}
