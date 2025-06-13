import java.util.Scanner;

public class power {

    public static double powerans(int n, int p){
        if(p==0){
            return 1 ;
        }
        if(p==1){
            return n ;
        }

        return n * (double) Math.pow(n, p-1) ;
    }
    public static void main(String[] args) {
        System.out.println(powerans(2, 5));
    }
}
