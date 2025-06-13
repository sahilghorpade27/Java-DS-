import java.util.Stack; 
public class ReverseStack {
    public static void pushatbottom(Stack <Integer> s ,  int data){
        if(s.isEmpty()){
            s.push(data);
            return ;
        }
        int top = s.pop();
        pushatbottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> stack) {
        if(stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        reverseStack(stack);
        pushatbottom(stack, top);
    }
    public static void printStack(Stack<Integer> stack) {
        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
     public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        

        reverseStack(stack);
        printStack(stack);

     }
}
