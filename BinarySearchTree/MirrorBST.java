public class MirrorBST {
    public static class  Node {
        int data ;
        Node left ;
        Node right ;

        Node(int data){
            this.data = data ;
        }
    }

    public static Node mirrorbst(Node root){
        if(root == null){
            return null ;
        }
        Node leftsbt = mirrorbst(root.left) ;
        Node rightsbt = mirrorbst(root.right) ;

        root.left = rightsbt ;
        root.right = leftsbt ;

        return root ;
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
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        System.out.println("Before Mirror");
        preorder(root);
        System.out.println();
        root = mirrorbst(root);
        System.out.println("After Mirror");
        preorder(root);

    }
}
