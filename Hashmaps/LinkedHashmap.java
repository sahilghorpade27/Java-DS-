import java.util.* ;
import java.util.LinkedHashMap;

import Hashmaplementation.Hashmap;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap <String , Integer> lhm = new LinkedHashMap<>();
        lhm.put("China", 120);
        lhm.put("India", 200);
        lhm.put("UK", 21);

        System.out.println(lhm);

        HashMap <String , Integer> hm = new HashMap<>();
        hm.put("Sahil", 10);
        hm.put("Akku", 2);
        hm.put("Bob", 12);

        System.out.println(hm); 


        TreeMap <String,Integer> tm = new TreeMap<>();
        tm.put("Sahil", 10);
        tm.put("Akku", 2);
        tm.put("Bob", 12);

        System.out.println(tm);


    }
}
