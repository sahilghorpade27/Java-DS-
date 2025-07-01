import java.util.* ;
public class DoublendedQueue {
    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();
        q.addFirst(1);
        q.addLast(2);
        q.addLast(3);
        q.addLast(4);
        q.addLast(5);
        q.addLast(6);

        q.removeLast();
        q.removeFirst();

        System.out.print(q);
        System.out.println();

        System.out.println(q.getFirst());
        System.out.println(q.getLast());
        


    }
}
