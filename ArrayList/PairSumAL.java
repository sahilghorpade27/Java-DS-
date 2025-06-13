import java.util.*;
public class PairSumAL {

    public static boolean pairsum(ArrayList<Integer> list , int target){
        int rp = list.size() -1 ;
        int lp = 0 ;

        while(lp!= rp){
            int sum = list.get(lp) + list.get(rp);
            if (sum == target) {
                return true ;                
            }
            if(sum > target){
                lp++ ;
            }
            if (sum<target) {
                rp-- ;
            }
            
        }
        return false ;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>() ;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        int target = 4 ;

        System.out.println(pairsum(list, target));
        
    }
}
