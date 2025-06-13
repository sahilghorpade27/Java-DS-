import java.util.*;
public class maxinAL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE ;
        
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(3);

        for(int i=0 ; i<list.size() ; i++){
            max = Math.max(max, list.get(i));
        }
        System.out.println(max);

        Collections.sort(list);
        System.out.println(list);
    }
}
