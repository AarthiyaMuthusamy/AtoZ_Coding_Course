package ArrayProblems.MultipleArrays;

public class FindCommonElements {
    public static void main(String[] args) {
        int[] n1 = {9,2,3,4};
        int[] n2 = {4,6,3,2};
        boolean ans = false;

        for (int i = 0; i < n1.length; i++) {
            for (int j = 0; j < n2.length; j++) {
                if(n1[i] == n2[j])
                     ans = true;
            }
            if(ans){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }

        }
    }
}
