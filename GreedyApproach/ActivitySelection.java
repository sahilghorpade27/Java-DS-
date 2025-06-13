import java.util.*;
public class ActivitySelection{
    public static void main(String[]args){
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        //By sorting 2d array 

        int activites [][] = new int[start.length][3];

        for(int i=0 ; i< start.length ; i++){
            activites[i][0] = i ;
            activites[i][1] = start[i];
            activites[i][2] = end[i];
            

        }
        //Lambda function

        Arrays.sort(activites , Comparator.comparingDouble(o -> o[2]));

        int maxact = 1 ;
        int lastend = activites[0][2];

        ArrayList <Integer> list = new ArrayList<>() ;
        list.add(activites[0][0]);

        for(int i=1 ; i< end.length ; i++){
            if(activites[i][1] >= lastend){
                list.add(activites[i][0]);
                maxact++ ;
                lastend = activites[i][2];
            }
        }

        System.out.println("Max activites : "+ list.size());
        for(int i=0 ; i< list.size() ; i++){
            System.out.print("A"+list.get(i)+" ");
        }






        // // ----------------------------------- end time basis sorted ----------------------------------- 

        // int maxact = 1 ;
        // int lastend = end[0];

        // ArrayList <Integer> list = new ArrayList<>() ;
        // list.add(0);

        // for(int i=1 ; i< end.length ; i++){
        //     if(start[i] >= lastend){
        //         list.add(i);
        //         maxact++ ;
        //         lastend = end[i];
        //     }
        // }

        // System.out.println("Max activites : "+ list.size());
        // for(int i=0 ; i< list.size() ; i++){
        //     System.out.print("A"+list.get(i)+" ");
        // }
        



    }
}