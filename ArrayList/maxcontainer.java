import java.util.*;
public class maxcontainer {
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        int totArea = 0 ;
        /* 
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                int width = j-i ;
                int height = Math.min(arr[j] , arr[i]);
                int area = height * width ;
                totArea = Math.max(totArea, area) ;
            }
        }
        System.out.println(totArea);
        */

        int lp = 0 ;
        int rp = arr.length - 1 ;

        while(lp < rp){
            int width = rp-lp ;
            int height = Math.min(arr[rp], arr[lp]);
            int area = height*width ;
            totArea = Math.max(totArea, area);

            if(arr[lp] < arr[rp]){
                lp++ ;
            }else{
                rp-- ;
            }
        }
        System.out.println(totArea );
    }
}
