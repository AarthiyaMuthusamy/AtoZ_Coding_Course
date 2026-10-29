package Dsa_Pattern;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s = {"java","java","java"};  //{"flower","flow","flight","flip"}
        System.out.println(findLongPrefix(s));
    }

    public static String findLongPrefix(String[] s){
       String result = s[0];


        for (int i = 1; i < s.length; i++) {
            String prefix = "";
            String current = s[i];
            int index1 =0;
            int index2 = 0;

            while (index1 < result.length() && index2 < current.length() ){
                if(result.charAt(index1) == current.charAt(index2)){
                    prefix += result.charAt(index1);
                    index1++;
                    index2++;

                }else {
                    break;
                }

            }
            result = prefix;

        }
        return result;
    }
}
