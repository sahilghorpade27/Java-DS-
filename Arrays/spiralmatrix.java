import java.util.* ;
public class spiralmatrix {
    public static void main(String[] args) {
        int n = 4 , m= 4 ;
        Scanner sn = new Scanner(System.in);
        int matrix[][] = new int[n][m] ;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                matrix[i][j] = sn.nextInt();
            }
        }

        int sc = 0 ;
        int sr = 0 ;
        int er = n-1 ;
        int ec = m-1 ;

        while (sc <= ec && sr <= er) {
            for(int i= sc ; i<=ec ; i++){
                System.out.print(matrix[sr][i]+" ");
            }
            for(int i=sr+1 ; i<=er ; i++){
                System.out.print(matrix[i][ec]+" ");
            }
            for(int i=ec-1 ; i>sc ; i--){
                System.out.print(matrix[er][i]+" ");
            }
            for(int i=er-1 ; i>sr+1 ; i--){
                System.out.print(matrix[i][sc]+" ");
            }

            sc++ ;
            sr++ ;
            ec-- ;
            er-- ;
            
        }
    }
}
