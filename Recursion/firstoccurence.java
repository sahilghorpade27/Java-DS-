public class firstoccurence {

    public static int findfirstOccurrence(int arr[] , int key , int i){
        if( i ==  arr.length-1  ){
            System.out.println("not found");
            return -1 ;
        }
        if(arr[i] == key){
            System.out.println("found");
            return i ;
        }

        return findfirstOccurrence(arr, key, i+1);

    }
    public static int findlastOccurrence(int arr[] , int key , int i){
        if( i == 0 ){
            System.out.println("not found");
            return -1 ;
        }
        if(arr[i] == key){
            System.out.println("found");
            return i ;
        }

        return findfirstOccurrence(arr, key, i-1);

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3,7,85,1,3};
        int i = arr.length-1 ;
        System.out.println(findlastOccurrence(arr, 3, i));
    }
}
