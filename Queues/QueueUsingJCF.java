import java.util.* ;
public class QueueUsingJCF {
   public static void main(String[] args){
    Queue <Integer> q = new LinkedList<>() ;     //ArrayDeque
    q.add(1);
    q.add(2);
    q.add(3);

    while(! q.isEmpty()){
        System.out.print(q.peek()+"->");
        q.remove();
    }
    System.out.print("null");
       
   } 
}
