public class BintoDeci {
    public static void bintodecimal(int n){
        int m =n ;
        int pow = 0 ;
        int deci = 0 ;
        
        while(n>0){
            int ld = n%10 ;
            deci = deci + (ld * (int)Math.pow(2, pow));

            pow ++;
            n = n/10 ;
        }
        System.out.println("Decimal of "+m+" is " +deci);
        
    }
    public static void main(String[] args) {
        bintodecimal(1111);
    }
}
