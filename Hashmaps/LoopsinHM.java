import java.util.HashMap;
import java.util.Set;

public class LoopsinHM {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 150);
        hm.put("China", 200);
        hm.put("US", 300);
        hm.put("France", 100);
        hm.put("UK", 50);

        Set<String> keys = hm.keySet();

        for(String k : keys){
            System.out.println("Key: "+k+","+ " Value: "+hm.get(k));
        }
                    
    
    }
}
