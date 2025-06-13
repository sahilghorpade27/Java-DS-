public class SortedArraytoBST {
    public static class  Node {
        int data ;
        Node left ;
        Node right ;

        Node(int data){
            this.data = data ;
        }
    }

    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+" ") ;
        preorder(root.left) ;
        preorder(root.right) ;
    }

    public static Node sortedarraytobst(int value[] , int start , int end){
        if(start>end){
            return null ;
        }
        int mid = (start+end)/2 ;
        Node root = new Node(value[mid]) ;
        root.left = sortedarraytobst(value, start, mid-1) ;
        root.right = sortedarraytobst(value, mid+1, end) ;

        return root ;
    }
    public static void main(String[] args) {
        int value[] = {3,5,6,8,10,11,12} ;
        Node root = null ;

        root = sortedarraytobst(value, 0, value.length-1) ;
        preorder(root) ;
        
    }
}
