
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "Knee" ;
        String t = "Keene" ;
        HashMap <Character , Integer > hm = new HashMap<>() ;

        for(int i=0 ; i< s.length() ; i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1) ;
            }
            else{
                hm.put(s.charAt(i), 1);
            }
        }
        for(int i=0 ; i< t.length() ; i++){
            char c = t.charAt(i);
            if(hm.containsKey(c)){
                hm.put(t.charAt(i),hm.get(t.charAt(i))-1) ;
                if(hm.get(c) == 0 ){
                    hm.remove(c);
                }
            }
            else{
                System.out.println(false);
                return ;
            }
            
        }
        
    }
}
