import java.util.Arrays;

public class MergeArrayWithoutLoop {
    public static void main(String[] args) {
        int[] A = {3,5,6,7};
        int[] B = {8,9,5,10};
        //System.out.println(Arrays.toString(mergeArray(A,B)));
        int[] result = mergeArray(A,B);
        System.out.println(Arrays.toString(Arrays.copyOf(result, count(result))));
    }
    private static int[] mergeArray(int[] A, int[] B){
        int i = 0, j = 0, k = 0;
        int[] C = new int[A.length + B.length];
        while (i < A.length && j < B.length){
            int value;
            if(A[i] < B[j]){
                value = A[i];
                i++;

            }
            else if(A[i] > B[j]){
                value = B[j];
                j++;
            }
            else{
                value = A[i];
                i++;
                j++;
            }
            if(k==0 || C[k-1] != value){
                C[k] = value;
                k++;
            }
        }
        while (i<A.length){
            if(k==0 || C[k-1] != A[i]){
                C[k++] = A[i];

            }

            i++;

        }
        while (j< B.length){
            if(k==0 || C[k-1] != B[j]){
                C[k++] = B[j];

            }
            j++;

        }
        return C;
    }

    private static int count(int[] arr){
        int c = 0;
        while (c < arr.length && arr[c] != 0){
            c++;
        }
        return c;
    }
}
