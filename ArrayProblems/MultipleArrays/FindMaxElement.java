package ArrayProblems.MultipleArrays;

public class FindMaxElement {
    public static void main(String[] args) {
        int[] n1 = {9,2,3,4};
        int[] n2 = {1,6,8,5};

        int max = n1[0];
        for (int i = 1; i < n1.length; i++) {
            if(n1[i] > max){
                max = n1[i];
            }
        }

        for (int i = 0; i < n2.length; i++) {
            if(n2[i] > max){
                max = n2[i];
            }
        }

        System.out.println(max);
    }

}
