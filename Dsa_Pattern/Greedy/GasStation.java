package Dsa_Pattern.Greedy;

public class GasStation {
    public static void main(String[] args) {
        int[] gas ={2,3,4};
        int[] cost = {3,4,2};
        System.out.println(findStartStation(gas,cost));
    }
    public static int findStartStation(int[] gas, int[] cost){
        int tank =0;
        int start = 0;
        int totalcost = 0;
        int totalgas = 0;
        for (int i = 0; i < gas.length; i++) {
            totalcost += cost[i];
            totalgas += gas[i];

            tank += gas[i] - cost[i];
            if(tank < 0){
                start = i+1;
                tank = 0;
            }

        }
        if(totalgas  != totalcost){
            return -1;
        }
        return start;
    }

}
