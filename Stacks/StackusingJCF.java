import java.util.* ;
public class StackusingJCF {
    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();
        s.push(2);
        s.push(1);
        s.push(0);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();            
        }
    }
}
