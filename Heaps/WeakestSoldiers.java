import java.util.PriorityQueue;

public class WeakestSoldiers {
    static class Row implements Comparable<Row>{
        int soldiers ;
        int idx ;

        public Row(int soldiers , int idx){
            this.soldiers = soldiers ;
            this.idx = idx ;
        }

        @Override
        public int compareTo(Row r2){
            if(this.soldiers == r2.soldiers){
                return this.idx - r2.idx ;
            }
            else{
                return this.soldiers - r2.soldiers ;
            }
        }
    }
    public static void main(String[] args) {
        int army[][] = {
            {1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,0,0,0}
        } ;
        int k = 2 ;

        PriorityQueue<Row> pq = new PriorityQueue<>();
        for(int i=0; i<army.length ; i++){
            int cnt = 0 ;
            for(int j= 0 ; j < army.length ; j++){
                cnt += army[i][j] == 1 ? 1 : 0 ;
            }
            pq.add(new Row(cnt,i));
        }

        for(int i=0 ; i<k ; i++){
            System.out.println("Row "+pq.remove().idx);
        }

    }
}
