import java.util.*;
public class BasicSorting {

    public static void bubblesort(int arr[]){
        int n= arr.length ;
        for(int turn =0 ; turn < n-1 ; turn++){
            for(int j=0 ; j < n-1-turn ; j ++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp ;
                }
            }
        }

    }

    public static void selectionsort(int arr[]){
        int n = arr.length ;
        for(int i=0 ; i<n-1 ; i++){
            int minpos = i ;
            for(int j=i+1 ; j < n  ; j++){
                if(arr[minpos] > arr[j]){
                    minpos = j ;
                }
            }
            //swap 
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp ;
        }
    }
    public static void insertionSort(int arr[]){
        for(int i=1 ; i<arr.length ; i++){
            int curr = arr[i];
            int prev = i-1 ;
            while (prev>=0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];   
                prev-- ;             
            }
            arr[prev+1] = curr ;
        }
    }

    public static void printarr(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void revarr(Integer arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        //int arr[]={5,4,1,3,2};
        Integer arr[]={5,4,1,3,2};
        Integer count[] = {1,4,1,3,4,3,7};
        //bubblesort(arr);
        
        Arrays.sort(count,0,7);
        
        revarr(count);
    } 
}
