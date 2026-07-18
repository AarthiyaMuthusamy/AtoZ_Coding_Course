public class Lcm {
    public static void main(String[] args) {
        int a = 4;
        int b= 6;
        System.out.println(lcm(a,b));

    }

    public static int lcm(int a,int b){
        return (a*b)/gcd1(a,b);
    }

    public static int gcd1(int n1, int n2){
        while(n1 > 0 && n2 > 0){
            if(n1 > n2) n1 = n1 % n2;
            else n2 = n2 % n1;
        }
        return (n1 == 0) ? n2 : n1;


    }

}
