import java.util.Stack;

public class NextgreaterElement {

    public static void nextgreater(int arr[] , int greater[]){
        Stack<Integer> s = new Stack<>();
        int n = arr.length ;
        for(int i=n-1 ; i>=0 ; i--){
            while(! s.isEmpty() && arr[s.peek()] < arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                greater[i] = -1 ;
            }else{
                greater[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0 ; i<n ; i++){
            System.out.print(greater[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3} ;
        int greater[] = new int[arr.length] ;

        // for (int i = 0; i < arr.length; i++) {
        //     greater[i] = -1; // Initialize with -1
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[i] < arr[j]) {
        //             greater[i] = arr[j];
        //             break;
        //         }
        //     }
        // }
        // for(int i=0 ; i<arr.length ; i++){
        //     System.out.print(greater[i]+" ");
        // }

        nextgreater(arr, greater);
    }
}
