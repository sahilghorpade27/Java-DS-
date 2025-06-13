public class maxinarray {
    public static void main(String[] args) {
        int marks[]={10,20,50,40,64,14};
        int max = Integer.MIN_VALUE ;
        for(int i=0 ; i<marks.length ; i++){
            if(marks[i]>max){
                max = marks[i];
            }
        }
        System.out.println(max);
    }
}

