import java.util.Stack;

public class Stockspan {
    public static void calculateSpan(int[] Stocks, int[] span) {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        span[0] = 1;

        for (int i = 1; i < Stocks.length; i++) {
            int curr = Stocks[i];
            while(! s.isEmpty() && curr > Stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1 ;
            }else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh ;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stocks[] = {100,80,60,70,60,85,100} ; 
        int span[] = new int[stocks.length] ;

       calculateSpan(stocks, span);

        for(int i=0 ; i< span.length ; i++){
            System.out.print(span[i]+" ");
        }
        
    }
}
