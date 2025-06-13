public class PrintInrange {
    public static class  Node {
        int data ;
        Node left ;
        Node right ;

        Node(int data){
            this.data = data ;
        }
    }

    public static Node insert(Node root , int val){
        if (root == null){
            root = new Node(val) ;
            return root ;
        }
        if(root.data < val){
            root.right = insert(root.right , val) ;
        }
        else{
            root.left = insert(root.left , val) ;
        }

        return root ;
    }

    public static void printinrangetree(Node root , int k1 , int k2){
        if (root == null){
            return ;            
        }
        if(root.data >= k1 && root.data <= k2){
            printinrangetree(root.left, k1, k2);
            System.out.print(root.data+" ") ;
            printinrangetree(root.right, k1, k2);
        }
        else if(root.data < k1){
            printinrangetree(root.right, k1, k2);
        }
        else if(root.data > k2){
            printinrangetree(root.left, k1, k2);
        }
    }
    public static void main(String[] args) {
        int value[] = {8,5,3,1,4,6,10,11,14} ;
        Node root = null ;

        for(int i=0 ; i<value.length ; i++){
            root = insert(root , value[i]) ;
        }

        printinrangetree(root, 1, 5);


    }
}
