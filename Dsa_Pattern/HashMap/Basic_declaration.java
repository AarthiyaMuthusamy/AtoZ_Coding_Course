package Dsa_Pattern.HashMap;

import java.util.HashMap;
import java.util.*;

public class Basic_declaration {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        //put()
        map.put("aarthiya",89);
        map.put("ravi",83);
        map.put("yara",85);

        //get()
        System.out.println(map.get("yara"));

        //remove()
        map.remove("yara");

        //containsKey()
        if(map.containsKey("ravi")){
            System.out.println("yes");
        }

        //containsValue()
        if(map.containsValue(83)){
            System.out.println("yes");
        }

        //size()
        System.out.println(map.size());

        //isEmpty()
        if(map.isEmpty()){
            System.out.println("true");
        }

        //clear
        map.clear();
        System.out.println(map.get("aarthiya")); //it will return null

        map.put("aarthiya",89);
        map.put("ravi",83);
        map.put("yara",85);

        //keySet()
        System.out.println(map.keySet());

        //values()
        System.out.println(map.values());

        //entrySet()
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.print(entry.getKey() + " " + entry.getValue() +", ");
        }
        System.out.println("");

        //getOrDefault
        System.out.println(map.getOrDefault("yara",0));
        System.out.println(map.getOrDefault("arun",0));

        //putIfAbsent
        map.putIfAbsent("aarav",89); //this one can add to the map
        System.out.println(map.get("aarav"));
        map.putIfAbsent("yara",89);  //this one already exist
        System.out.println(map.get("yara"));


        //replace()
        map.replace("yara",50);
        System.out.println(map.get("yara")); //replace the value 85 to 50

        //iterate using forEach

        map.forEach((key, value) -> System.out.println(key + " " + value)); //lambda function
        map.entrySet().forEach(e -> System.out.println(e.getKey() +" "+ e.getValue())); //using entrySet


        HashSet<Integer> set  = new HashSet<>();
        set.add(56);
        set.add(46);
        set.add(7);
        set.add(8);
        set.add(46);
        System.out.println(set);
    }
}
