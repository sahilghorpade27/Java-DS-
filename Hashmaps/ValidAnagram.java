
import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "sahil" ;
        String t = "lihsa" ;
        HashMap <Character , Integer > hm = new HashMap<>() ;

        for(int i=0 ; i< s.length() ; i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i=0 ; i< t.length() ; i++){
            hm.put(t.charAt(i), hm.getOrDefault(t.charAt(i), 0)-1);
        }

        Set<Character> set = hm.keySet();
        for(Character c : set ){
            if(hm.get(c) != 0){
                System.out.println("False");
                return ;
            }
        }

        System.out.println("True ");
        
    }
}
