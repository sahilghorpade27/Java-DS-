public class decitobin {
    public static void decitobinary(int n){
        int m = n ;
        int pow = 0 ;
        int bin = 0 ;
        
        while(n>0){
            int rem = n%2 ;
            bin = bin + (rem * ((int)Math.pow(10,pow)));
            pow ++ ;
            n = n / 2 ;
        }
        System.out.println("binary of "+m+" is "+bin);
    }
    public static void main(String[] args) {
        decitobinary(8);
    }
}
