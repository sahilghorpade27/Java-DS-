public class Friendspairing {

    public static int pairingways(int n){
        //base 
        if(n==1 || n==2){
            return n ;
        }

        // single 
        int fnm1 = pairingways(n-1);

        //double
        int fnm2 = pairingways(n-2);
        int ways = (n-1) * fnm2 ;

        int totways = ways + fnm1 ;
        return totways ;
    }
    public static void main(String[] args) {
        System.out.println(pairingways(3));
    }
}
