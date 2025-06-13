import java.util.LinkedList;
import java.util.Queue;

public class KthLevel {
    public static class  Node {
        int data ;
        Node left ;
        Node right ;

        Node(int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }
    }

        static class Bt {
            static int idx = -1 ;
            public static Node buildTree(int nodes[]){
                idx ++ ;
                if(nodes[idx] == -1){
                    return null ;
                }
                Node newNode = new Node(nodes[idx]);
                newNode.left = buildTree(nodes) ;
                newNode.right = buildTree(nodes) ;

                return newNode ;
            }

            
        }

        public static void Klevel(Node root , int level , int k ){
            if(root == null){
                return  ;
            }
            if(level == k){
                System.out.print(root.data+" ");
                return ;
            }
            Klevel(root.left, level+1, k);
            Klevel(root.right, level+1, k);
        }

        // public static void levelorder(Node root , int k){
        //     if(root == null){
        //         return ;
        //     }
        //     if(k == 1){
        //         System.out.print(root.data+" ");
        //         return ;
        //     }
        //     Queue<Node> q = new LinkedList<>();
        //     q.add(root);
        //     q.add(null);

        //     while(! q.isEmpty()){
        //         Node currNode = q.remove();
        //         if(currNode == null){
        //             System.out.println();
        //             k++;
                    
        //             if(! q.isEmpty()){
        //                 q.add(null);
        //             }
        //         }
        //         else{
        //             System.out.print(currNode.data+" ");
        //             if(currNode.left != null){
        //                 q.add(currNode.left);
        //             }
        //             if(currNode.right != null){
        //                 q.add(currNode.right) ;
        //             }

        //         }
        //     }


        // }


    public static void main(String[] args) {

        Node root = new Node(1) ;
        root.left = new Node(2) ;
        root.right = new Node(3) ;
        root.left.left = new Node(4) ;
        root.left.right = new Node(5) ;
        root.right.left = new Node(6) ;
        root.right.right = new Node(7) ;

        int k = 3 ;

        Klevel(root, 1, k) ;
        
    }
}
