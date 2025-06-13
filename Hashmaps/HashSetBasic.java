
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetBasic {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(2);

        System.out.println(set);

        // set.remove(4);
        // System.out.println(set);

        // //set.clear();
        // System.out.println(set.size());

        // Iterator i = set.iterator();
        // while(i.hasNext()){
        //     System.out.println(i.next());
        // }

        // LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        // lhs.add(1);
        // lhs.add(2);
        // lhs.add(3);
        // lhs.add(4);
        // lhs.add(3);
        // lhs.add(2);

        // System.out.println(lhs);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("a");
        lhs.add("i");
        lhs.add("e");
        lhs.add("o");
        lhs.add("a");
        lhs.add("e");

        System.out.println(lhs);

        // TreeSet <Integer> ts = new TreeSet<>();
        // ts.add(1);
        // ts.add(2);
        // ts.add(3);
        // ts.add(4);
        // ts.add(3);
        // ts.add(2);

        // System.out.println(ts);


    }
}
