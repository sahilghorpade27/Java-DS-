public class DecToBin {

    public static void dectobinary(int n){
        int bin = 0 ;
        int i=0 ;
        int rem ;
        while (n>0) {
            rem = n%2 ;
            bin = bin + (rem * (int)Math.pow(10,i));
            n= n/2 ;
            i++ ;          
        }
        System.out.println(bin);
    }
    public static void main(String[] args) {
        dectobinary(9);
    }
}
