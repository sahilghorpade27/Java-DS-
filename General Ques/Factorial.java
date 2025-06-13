import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1 ;
        for(int i=n ; i>0 ; i--){
            fact *=i ;
        }
        System.out.println("Factorial is : "+fact);
    }
}

