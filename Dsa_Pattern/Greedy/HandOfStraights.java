package Dsa_Pattern.Greedy;

import java.util.TreeMap;

public class HandOfStraights {
    public static void main(String[] args) {
        int[]  hand = {1,2,3,6,2,3,4,7,8};
        int groupSize = 3;
        System.out.println(isHandofStraights(hand,groupSize));

    }
    public static boolean isHandofStraights(int[] hand, int groupSize){
        if(hand.length % groupSize != 0){
            return false;
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int card :  hand){
            map.put(card,map.getOrDefault(card,0)+1);
        }
        while (!map.isEmpty()){
            int first = map.firstKey();
            for (int card = first;card < first + groupSize;card++){
                if(!map.containsKey(card)){
                    return false;
                }
                int count = map.get(card);
                if(count == 1){
                    map.remove(card);
                }
                else{
                    map.put(card,count -1);
                }
            }
        }
        return true;

    }

}
