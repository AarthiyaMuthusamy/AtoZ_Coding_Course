package String;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        String reversed = "";

        for (int i = str.length()-1;i>=0;i--){
            reversed += str.charAt(i);
        }
        System.out.println(reversed);

        System.out.println(reverse(str));

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


}
