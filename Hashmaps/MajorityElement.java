
import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
       int nums[] = {1,3,2,5,1,3,1,5,1} ;
       HashMap <Integer , Integer > hm = new HashMap<>();
        for(int i=0 ; i< nums.length ; i++){
        //    int num = nums[i] ;
        //    if(hm.containsKey(num)){
        //     hm.put(num, hm.get(num)+1);
        //    }
        //    else{
        //     hm.put(num,1);
        //    }

        hm.put(nums[i] , hm.getOrDefault(nums[i], 0) + 1);
        }
        Set<Integer> setkey = hm.keySet();
        for(Integer key : setkey){
            if(hm.get(key) > nums.length/3){
                System.out.println(key);
            }
        }
    }
}
