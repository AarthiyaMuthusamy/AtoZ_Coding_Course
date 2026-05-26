package Dsa_Pattern.HashMap.FrequencyCounting;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* boyer-moore  vs hashmap
 time O(n)         time O(n)
 space O(1)        space O(n)
 for large input it take some times in hashmap

 use boyer:
 majority element guaranteed , optimal space , size is very large

 use hashmap :
 majority element not guaranteed , need frequency of all elements , need multiple answers


 */

public class MajorityElement {
    public static void main(String[] args) {
      //int[] nums = {2,2,1,1,2};
      // int[] nums = {2,2,2};
       // int[] nums = {};
       // int[] nums = {1,2,3,4};
        int[] nums = {2};
        System.out.println(Majority(nums));
        System.out.println(boyerMajority(nums));
    }

    //using hashmap
    public static List<Integer> Majority(int[] nums){
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        if(n == 0){
            return list;
        }

        HashMap<Integer, Integer> majorityMap = new HashMap<>();

        for (int num : nums){
            majorityMap.put(num, majorityMap.getOrDefault(num , 0 ) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : majorityMap.entrySet()){
            if(entry.getValue() > n / 2){
                list.add(entry.getKey());
            }
        }

        return list;
    }


    //using Boyer-Moore algorithm
    public static int boyerMajority(int[] nums){
        int candidate = 0;
        int count = 0;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count ++;
            }
            else{
                count --;
            }
        }

        return candidate;
    }




}
