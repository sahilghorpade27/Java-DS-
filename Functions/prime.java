public class prime {

    public static boolean isPrime(int n){
        if(n==2){
            return true ;
        }
        for(int i=2 ; i<=Math.sqrt(n) ; i++){
            if(n % i == 0 ){
                return false ;
            }
        }
        return true ;
    }
    public static void primeinRange(int n){
        for(int j=2 ; j<=n ; j++){
            if(isPrime(j)){
                System.out.println(j);
            }
        }
    }
    public static void main(String[] args) {
        primeinRange(11);
    }
}
