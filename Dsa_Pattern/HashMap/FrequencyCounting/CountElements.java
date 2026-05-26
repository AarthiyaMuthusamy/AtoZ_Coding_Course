package Dsa_Pattern.HashMap.FrequencyCounting;

//find the frequency of each elements
//input: num = [1,2,2,3,1]
//output: {1=2,2=2, 3= 1}

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Map;

public class CountElements {
    public static void main(String[] args) {
         int[] num = {5,6,2,6,2,4,5,1,4,3,8,9,3,3,5,2,6,2,5};
        // int[] num = {4};
        //int[] num = {1,2,2,3,1};
        System.out.println(countElement(num));

        //iterate using this
        HashMap<Integer,Integer> map = countElement(num);
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.print(entry.getKey()+ " : " + entry.getValue() + ", ");
        }


    }

    public static HashMap<Integer,Integer> countElement(int[] nums){
        HashMap<Integer, Integer> CountMap = new HashMap<>();

        if(nums.length == 0){
            return CountMap;
        }
        if(nums.length == 1){
           CountMap.put(nums[0],1);
           return CountMap;
        }

        for (int num : nums){
            CountMap.put(num , CountMap.getOrDefault(num, 0)+1);
        }

        return CountMap;
    }
}
