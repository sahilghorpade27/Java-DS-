import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int marks[] =new int[10] ;
        for(int i=0 ; i<marks.length ; i++){
            marks[i] = sc.nextInt();
        }

        int key = 15 ;

        for(int i=0 ;i< marks.length ; i++){
            if(key == marks[i]){
                System.out.println("Number found at index "+i);
            }
            
        }
    }
}
