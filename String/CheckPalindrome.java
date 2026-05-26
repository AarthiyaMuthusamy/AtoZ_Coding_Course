package String;


public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "madtd";
        String reversed = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reversed += str.charAt(i);
        }
        if(str.equals(reversed)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

        System.out.println(palindromeCheck(str));
    }

    public static boolean palindromeCheck(String s){
       int start = 0;
       int end = s.length()-1;
       char[] arr = s.toCharArray();

       while (start < end){
           if(arr[start] == arr[end]){
               return true;
           }
           start++;
           end--;
       }
       return false;

    }
}
