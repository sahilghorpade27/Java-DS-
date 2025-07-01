import java.util.*;

public class Basic {
    public static void main(String[] args) {
        HashMap<String,Integer>hm = new HashMap<>();
        hm.put("India", 1);
        hm.put("China", 2);
        hm.put("US",3);

        System.out.println(hm);

        int population = hm.get("China");
        // System.out.println(population);

        // System.out.println(hm.containsKey("China"));


        // System.out.println(hm.remove("China"));

        // System.out.println(hm);

        // System.out.println(hm.size());

        // System.out.println(hm.isEmpty());

        Set<String> keys = hm.keySet();
        System.out.print(keys);

        for( String k : keys){
            System.out.println("Key : "+k+" , Value : "+hm.get(k));
        }




    }
} 