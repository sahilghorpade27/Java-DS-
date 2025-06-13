public class invertedstar {
    public static void main(String[] args) {
        int n=4 ;
        for(int i=0 ; i<4 ; i++){
            for(int j=1 ; j< (n-i+1) ; j++){
                System.err.print("*");
            }
            System.out.println();
        }
    }
}
