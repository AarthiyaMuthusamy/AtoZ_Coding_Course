package ArrayProblems;

public class Sum2D {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        int sum = 0;

        for(int i = 0;i<accounts.length;i++){
            for(int j =0;j < accounts[0].length;j++){
                sum += accounts[i][j];
            }
            if(max < sum){
                max = sum;

            }
            sum = 0;
        }

        return max;
    }
}
