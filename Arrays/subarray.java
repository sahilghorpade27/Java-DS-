public class subarray {
    public static void main(String[] args) {
        int marks[] = {1,2,3,4,5,6,7,8,9};
        for(int i=0 ; i<marks.length ; i++){
            for(int j=i+1 ; j<=marks.length ; j++){
                for(int k=i ; k<j ; k++){
                    System.out.print(marks[k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
