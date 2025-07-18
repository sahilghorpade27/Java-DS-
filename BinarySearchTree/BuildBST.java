public class BuildBST{
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

    public static boolean searchinbst(Node root , int key){
        if(root == null){
            return false ;
        }
        if(root.data == key){
            return true ;
        }
        if(root.data < key){
            return searchinbst(root.right, key);
        }
        if(root.data > key){
            return searchinbst(root.left, key);
        }
        return false ;

    }


    public static void main(String[] args) {
        int value[] = {5,1,3,4,2,7} ;
        Node root = null ;

        for(int i=0 ; i<value.length ; i++){
            root = insert(root , value[i]) ;
        }

        // inorder(root) ;

        System.out.println(searchinbst(root, 6 )) ;

    }
}