import java.util.* ;
public class ntoone{
    public static void printInc(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
        System.out.println(n);
        printInc(n-1);
        
    }
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
        printDec(n-1);
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        printDec(n);
    }
}
