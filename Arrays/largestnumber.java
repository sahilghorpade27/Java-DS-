public class largestnumber {
    public static void main(String[] args) {
        int number[] = {10,20,30,40,50,60};
        int max= number[0];
        for(int i=0 ; i<number.length ; i++){
            if(number[i] > max){
                max = number[i] ;
            }
        }
        System.out.println("max number is : "+max);
    }
}
