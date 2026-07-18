package ArrayProblems.MultipleArrays;

public class FindMinElement {
    public static void main(String[] args) {
        int[] n1 = {7,2,3,4};
        int[] n2 = {1,6,8,5};

        int min1 = n1[0];
        for (int i = 0; i < n1.length; i++) {
            if(n1[i] < min1){
                min1 = n1[i];
            }
        }

        for (int i = 0; i < n2.length; i++) {
            if(n2[i] < min1){
                min1 = n2[i];
            }
        }

        System.out.println(min1);
    }
}
