public class DeleteNode {
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

    public static void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left) ;
        System.out.print(root.data+" ") ;
        inorder(root.right) ;
    }

    public static Node delete(Node root , int val){
        if(root.data < val){
            root.right = delete(root.right , val) ;
        }
        else if(root.data > val){
              root.left = delete(root.left , val) ;
        }
        else{
            //case 1: No child
            if(root.left == null && root.right == null){
                return null ;
            }
            //Case 2 : single child 
            if(root.left == null){
                return root.right ;
            }
            else if(root.right == null){
                return root.left ;
            }
            
            //Case 3 : 2 children
            
            else{
                Node IS = findInorderSuccessor(root.right) ;
                root.data = IS.data ;
                root.right = delete(root.right , IS.data) ;

            }

        }

        return root ;
    }

    public static Node findInorderSuccessor(Node root){
        while (root.left != null) {
            root = root.left ;            
        }
        return root ;
    }

    public static void main(String[] args) {
    int value[] = {5,1,3,4,2,7} ;
    Node root = null ;
    for(int i=0 ; i<value.length ; i++){
        root = insert(root , value[i]) ;
    }

    inorder(root) ;
    System.out.println() ;
    root = delete(root, 3) ;
    inorder(root) ;
}
}
