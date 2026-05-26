package String;

import java.util.Scanner;

public class StringBasicOpr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String s = sc.next(); // it won't take after the whitespace
        //System.out.println(s);
        String s1 = sc.nextLine();
        System.out.println(s1);


        String s2 = sc.nextLine();
        System.out.println(s2);


        //length
        System.out.println(s1.length());

        //charAt
        System.out.println(s1.charAt(1));

        //substring(start, end)
        System.out.println(s1.substring(0,2));

        //equals vs ==
        //string literal check the content and denoting the same object , it's considered as primitive
        String  s3 = "abc";
        String s4 = "abc";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));


        //but object creation different objects
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2 );

        System.out.println(s1.toCharArray());
        char[] c = s1.toCharArray();
        for (int i =0;i<s1.length();i++){
            System.out.println(c[i]);

        }
        System.out.println(s1.toUpperCase());



    }
}
