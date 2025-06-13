
import java.util.HashSet;

public class UnionandIntersection {
    public static void main(String[] args) {
        int arr1[] = {7,3,9} ;
        int arr2[] = {6,3,9,2,9,4} ;

        HashSet <Integer> un = new HashSet<>();
        HashSet <Integer> a1 = new HashSet<>();
        
        

        for(int i=0 ; i< arr1.length ; i++){
            un.add(arr1[i]);
            a1.add(arr1[i]);
        }
        for(int i=0 ; i< arr2.length ; i++){
            un.add(arr2[i]);
        }
        System.out.println("Union : "+un);

        int size = 0 ;

        for(int i=0 ; i< arr2.length ; i++){
            int ch = arr2[i] ;
            if(a1.contains(ch)){
                size++ ;
                a1.remove(ch);
            }
        }
        System.out.println(size);




    }
}