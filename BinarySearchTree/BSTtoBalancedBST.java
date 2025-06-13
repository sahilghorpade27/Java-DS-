import java.util.* ;
public class BSTtoBalancedBST {
    public static class  Node {
        int data ;
        Node left ;
        Node right ;

        Node(int data){
            this.data = data ;
        }
    }

    public static void inorderTraversal(Node root , ArrayList<Integer> inorder){
        if(root == null){
            return ;
        }
        inorderTraversal(root.left, inorder);
        inorder.add(root.data) ;
        inorderTraversal(root.right, inorder) ;
    }

    public static Node buildbst(ArrayList<Integer> inorder , int start , int end){
        if(start>end){
            return null ;
        }
        int mid = (start+end)/2 ;
        Node root = new Node(inorder.get(mid)) ;
        root.left = buildbst(inorder, start, mid-1) ;
        root.right = buildbst(inorder, mid+1, end) ;
        return root ;
    }

    public static Node buildBalancedBST(Node root){
        //inorder 
        ArrayList<Integer> inorder = new ArrayList<>() ;
        inorderTraversal(root, inorder) ;

        //sorted array to BST
        return buildbst (inorder, 0, inorder.size()-1) ;
    }


    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+" ") ;
        preorder(root.left) ;
        preorder(root.right) ;
    }

    
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.right = new Node(10);
        root.left.left = new Node(5);
        root.left.left.left  = new Node(3);

        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        Node newRoot = buildBalancedBST(root) ;
        System.out.println(newRoot.data) ;
        System.out.print("Preorder Traversal of Balanced BST : "); 
        preorder(newRoot) ;
        


    }
}
