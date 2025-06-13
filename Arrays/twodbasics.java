import java.util.Scanner;

public class twodbasics {

    public static void largest(int matrix[][]){
        int max = Integer.MIN_VALUE ;
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
            
        }
        System.out.println(max);
                
    }
    public static void main(String[] args) {
        int n =4 , m = 3 ; 
        int matrix[][] = new int[n][m] ;
        Scanner sc = new Scanner(System.in);

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // for(int i=0 ; i<n ; i++){
        //     for(int j=0 ; j<m ; j++){
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        largest(matrix);




    }
}
