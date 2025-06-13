import java.util.*;
public class fibonacci {
    public static int fibonaccin(int n){
        if(n==1 || n==0){
            return n ;
        }
        int fbnm1 = fibonaccin(n-1);
        int fbnm2 = fibonaccin(n-2);
        
        int fbn = fbnm1 + fbnm2 ;

        return fbn ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        System.out.println(fibonaccin(n));


    }
}
