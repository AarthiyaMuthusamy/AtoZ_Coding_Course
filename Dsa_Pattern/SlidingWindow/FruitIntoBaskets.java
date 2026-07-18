package Dsa_Pattern.SlidingWindow;

import java.util.HashMap;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        int[] fruits = {1,2,3,2,2}; //{1,2,1} {0,1,2,2}
        System.out.println(countDistinctBasket(fruits));

    }
    public static int countDistinctBasket(int[] fruits){
        int left = 0;
        HashMap<Integer,Integer> map = new HashMap<>(fruits.length);

        int maxFruitTypes = 0;

        for (int right = 0; right < fruits.length; right++) {

            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);

            while (map.size() > 2){
                map.put(fruits[left],map.get(fruits[left])-1);
                if(map.get(fruits[left]) == 0){
                    map.remove(fruits[left]);
                }
                left++;

            }
            maxFruitTypes = Math.max(maxFruitTypes,right-left+1);
        }
        return maxFruitTypes;


        /* it works best
         Map<Integer,Integer> map =new HashMap<>();

        int i = 0;
        int j = 0;

        int maxFruit = 0;

        while(j<fruits.length){

            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);

            if(map.size()<=2){

             maxFruit = Math.max(maxFruit,(j-i+1));
            }else{
             map.put(fruits[i],map.get(fruits[i])-1);

             if(map.get(fruits[i])==0){
                map.remove(fruits[i]);
             }
             i++;
            }
            j++;
        }

        return maxFruit;
         */

    }
}
