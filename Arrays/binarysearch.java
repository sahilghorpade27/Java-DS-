public class binarysearch {
    public static void main(String[] args) {
        int marks[]={10,20,30,40,50,60};
        int n= marks.length ;
        int start = 0 ;
        int end = n-1 ;
        int key = 30 ;
        while(start<= end){
            int mid = (start + end)/2 ;
            if(marks[mid] == key){
                System.out.println("Key found at index "+mid);
                break ;
            }
            else if(marks[mid] < key){
                start = mid+1 ;
            }
            else{
                end = mid-1 ;
            }
        }

    }
}
