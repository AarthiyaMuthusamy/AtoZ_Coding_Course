package CodingQuestion;

public class BalancingWaterTanks {
    public static void main(String[] args) {
        int[] countWater = {4,0,0};
        int[] requiredWater = {0,0,4};
        int[] costs = {4,100};
        System.out.println(costofWater(countWater,requiredWater,costs));

    }
    public static int costofWater(int[] countWater, int[] requireWater,int[] costs){
        int totalcount = 0;
        int prefix =0;
        int t_water = 0;
        int req = 0;
        for (int c = 0; c < countWater.length; c++) {
            t_water += countWater[c];
        }
        for (int i = 0; i < requireWater.length; i++) {
            req += requireWater[i];
        }
        if(t_water != req){
            return -1;
        }

        for (int i = 0; i < countWater.length-1; i++) {
            prefix += countWater[i] - requireWater[i];
            totalcount += Math.abs(prefix) * costs[i];

        }
        return totalcount;

    }


}
