public class HeapSort {

    public static void heapifyasc(int arr[] , int i , int size){
        int left = 2*i+1 ;
        int right = 2*i + 2 ;
        int maxIdx = i ;

        if(left < size  && arr[left] > arr[maxIdx]){
            maxIdx = left ;
        }

        if(right < size  && arr[right] > arr[maxIdx]){
            maxIdx = right ;
        }

        if(maxIdx != i ){
            int temp = arr[i];
            arr[i] = arr[maxIdx] ;
            arr[maxIdx] = temp ;

            heapifyasc(arr, maxIdx, size);
        }
    }

    public static void heapsortingasc(int arr[]){
        // build max heap 

        int n = arr.length;
        for (int i = n / 2 -1; i >= 0; i--) {
            heapifyasc(arr, i, n);
        }

        // push largest at end
        for (int i = n - 1; i > 0; i--) {
            // swap largest with first
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapifyasc(arr, 0, i);
        }
        

    }

    /////////////////////////////////////////
    public static void heapifydsc(int arr[] , int i , int size){
        int left = 2*i+1 ;
        int right = 2*i + 2 ;
        int minIdx = i ;

        if(left < size  && arr[left] < arr[minIdx]){
            minIdx = left ;
        }

        if(right < size  && arr[right] < arr[minIdx]){
            minIdx = right ;
        }

        if(minIdx != i ){
            int temp = arr[i];
            arr[i] = arr[minIdx] ;
            arr[minIdx] = temp ;

            heapifydsc(arr, minIdx, size);
        }
    }

    public static void heapsortingdsc(int arr[]){
        // build max heap 

        int n = arr.length;
        for (int i = n / 2 -1; i >= 0; i--) {
            heapifydsc(arr, i, n);
        }

        // push largest at end
        for (int i = n - 1; i > 0; i--) {
            // swap largest with first
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapifydsc(arr, 0, i);
        }
        

    }
    public static void main(String[] args) {
        int arr[] ={1,2,4,5,3};

        heapsortingdsc(arr);
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
