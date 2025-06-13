import java.util.ArrayList;

public class IndianCoins {
    public static void main(String[] args) {
        int coins[] = {2000,500,100,50,20,10,5,2,1};

        int amount = 590 ;
        int count = 0 ;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0 ; i < coins.length ; i++){
            if(coins[i] <= amount){
                while (coins[i] <= amount) {
                    count++ ;
                    amount = amount - coins[i] ;
                    list.add(coins[i]);
                                       
                }
            }
        }
        System.out.println(count);
        System.out.print(list);
    }
}
