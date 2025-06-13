import java.util.*;
public class maxcontainer {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int totArea = 0 ;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                int width = j-i ;
                int height = Math.min(arr[j] , arr[i]);
                int area = height * width ;
                totArea = Math.max(totArea, area) ;
            }
        }
        System.out.println(totArea);
    }
}
