package Dsa_Pattern.Greedy;

import java.util.Arrays;

class Item{
    int value;
    int weight;
    Item(int value,int weight){
        this.value = value;
        this.weight = weight;
    }
}
public class fractionaKanpsack {
    public static void main(String[] args) {
        int[] value= {60,100,120};
        int[] weight = {10,20,30};
        Item[] items = new Item[value.length];
        for (int i = 0; i < value.length; i++) {
            items[i] = new Item(value[i],weight[i]);
        }
       int capacity = 50;
        System.out.println(fractionalKnapsack(capacity,items));

    }

    public static double fractionalKnapsack(int capacity, Item[] items){

        Arrays.sort(items,(a, b) -> Double.compare( (double) b.value/ b.weight,(double) a.value / a.weight));
        double totalvalue= 0.0;
        for(Item item : items){
            if(capacity == 0){
                break;
            }
            if(item.weight <= capacity){
                totalvalue += item.value;
                capacity -= item.weight;
            }
            else{
                totalvalue += (double) item.value * capacity / item.weight;
                capacity = 0;
            }
        }
        return totalvalue;
    }
}
