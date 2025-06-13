import java.util.Scanner;

public class swap {

    public static void swap(int a , int b){
        int temp ;
        temp = a ; 
        a = b ; 
        b = temp ;
        System.out.println("a b "+a+" "+b);4
    }
    public static void main(String[] args) {
        int a , b ;

        Scanner sc = new Scanner (System.in) ;
        a = sc.nextInt() ;
        b = sc.nextInt() ;
        swap(a, b);
        


    }
}
