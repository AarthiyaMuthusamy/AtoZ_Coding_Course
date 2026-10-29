package Dsa_Pattern.HashMap.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindingDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,2,7,2,8,4,9,2};
        System.out.println(findDuplicates(arr));


    }
    public static List<Integer> findDuplicates(int[] arr){
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>(); //it won't allow the duplicate values
      //List<Integer> list = new ArrayList<>(); //it allows duplicates
        for(int num : arr){
            if(!seen.add(num)){ // set.add(num) gives true when it's a non-duplicate !true => false , false condition not run
                //!false => true condition run
                duplicates.add(num); //it always check duplicates exist or not
            }
            seen.add(num);
        }
        return new ArrayList<>(duplicates);
    }
}
