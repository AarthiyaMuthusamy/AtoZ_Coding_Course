package String;

public class ReverseString {
    public static void main(String[] args) {
        String str = "I Love Zoho";
        String reversed = "";

        for (int i = str.length()-1;i>=0;i--){
            reversed += str.charAt(i);
        }
        System.out.println(reversed);

        System.out.println(reverse(str));
        System.out.println(reverseEachWord(str));
        System.out.println(reverseWords(str));

    }

    public static char[] reverse(String s){
        int start = 0;
        int end = s.length()-1;
        char[] arr = s.toCharArray();

        while (start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }

    public static String reverseEachWord(String str){
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word: words){
            result.append(new StringBuilder(word).reverse());
            result.append(" ");
        }

        return result.toString().trim();

    }

    public static String reverseWords(String str){
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length-1; i >= 0 ; i--) {
            result.append(words[i]);
            if( i!= 0){
                result.append(" ");
            }
        }

        return result.toString().trim();

    }


}
