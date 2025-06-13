import java.util.*;
public class sum {

    public static int sumn(int n){
        if(n==1){
            return 1 ;
        }
        int sumnm1 = sumn(n-1);
        int sumofn = n + sumnm1 ;
        return sumofn ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        System.out.println(sumn(n));
    }
}
