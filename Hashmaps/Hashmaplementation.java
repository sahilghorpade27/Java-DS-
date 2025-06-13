import java.util.LinkedList;

public class Hashmaplementation {

    static class Hashmap<K,V>{
        private class Node {
            K key ;
            V value ;

            public Node (K key , V value){
                this.key = key ;
                this.value = value ;
            }
        } // Moved closing brace here to end the Node class

        private int n ;
        private int N ;
        private LinkedList<Node> buckets[] ;

        public Hashmap(){
            this.N = 0 ;
            this.buckets = new LinkedList[4] ;
            for(int i=0 ; i<4 ; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % N ;
        }

        private int searchinLL(K key , int bi){
            LinkedList<Node> ll = buckets[bi];
            int di =0 ;

            for(int i=0 ; i<ll.size() ; i++){
                if(ll.get(i) == key){
                    return di ;
                }
                di++ ;
            }
            return -1 ;
        }

        public void put(K key , V value){
            int bi = hashFunction(key);  //output 0 - 1 
            int di = searchinLL(key, bi) ; 

            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value ;
            }
            else{
                buckets[bi].add(new Node(key, value));
                size++ ;
            }

            double lambda = (double) n/N ;
        }

    }

    public static void main(String[] args) {
        
    }
}