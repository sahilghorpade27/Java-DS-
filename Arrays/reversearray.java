public class reversearray {
    public static void main(String[] args) {
        int marks[] = {10,20,30,40,50,60,70};
        int reverse[] = new int [marks.length] ;

        int first = 0 ;
        int last = marks.length-1 ;
        while(last>=0){
            reverse[first]=marks[last];
            first++ ;
            last--;
        }

        for(int i=0 ; i<marks.length ; i++){
            System.out.print(reverse[i]+" ");
        }
    } 
}
