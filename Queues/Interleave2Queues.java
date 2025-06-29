import java.util.LinkedList;
import java.util.Queue;

public class Interleave2Queues {

    public static void interleave(Queue<Integer> q){
        Queue<Integer> firsthalf = new LinkedList<>();

        int s = q.size() ;

        for(int i= 0 ; i< s/2 ; i++){
            firsthalf.add(q.remove());
        }
        while (! firsthalf.isEmpty()) {
            q.add(firsthalf.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interleave(q);

        while (! q.isEmpty()) {
            System.out.print(q.remove()+" ");   
        }
    }
}
