public class heighttree { 
    public static class Node{
        int data ;
        Node left ;
        Node right ;
        Node(int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }

    }
    public static int calcheight(Node root){
        if(root == null){
            return 0 ;
        }
        int lh = calcheight(root.left);
        int rh = calcheight(root.right);

        return Math.max(lh, rh)+1 ;

    }
    public static int calcnodes(Node root){
        if(root == null){
            return 0 ;
        }
        int lh = calcnodes(root.left);
        int rh = calcnodes(root.right);

        return lh + rh + 1 ;

    }
    public static int calcsumnodes(Node root){
        if(root == null){
            return 0   ;
        }
        int lh = calcsumnodes(root.left);
        int rh = calcsumnodes(root.right);

        return lh + rh + root.data ;

    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int ld = diameter(root.left);
        int rd = diameter(root.right);
        int lh = calcheight(root.left);
        int rh = calcheight(root.right);
        int selfdiam = lh + rh + 1;

        return Math.max(selfdiam , Math.max(ld,rd));

            
    }
    public static boolean isidentical(Node node , Node subroot){
        if(node == null && subroot ==  null){
            return true ;
        }
        else if( node == null || subroot == null || subroot.data != node.data){
            return false ;
        }
        return isidentical(node.left, subroot.left) && isidentical(node.right, subroot.right);

    }

    public static boolean isSubtree(Node root ,  Node subroot){
        if(root == null){
            return false ;
        }
        if(root.data == subroot.data){
            if(isidentical(root ,subroot)){
                return true ;
            }

            
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot)  ;
    }
 
    public static void main(String[] args) {
        Node root = new Node(1);

    // Level 1
    root.left = new Node(2);
    root.right = new Node(3);
    
    // Level 2
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

     // Level 3
    root.left.left.left = new Node(8);

    // Level 4 to 7 (Right-heavy branch)
    root.left.left.right = new Node(0);  // Optional placeholder if you need one
    root.left.left.right.right = new Node(9);
    root.left.left.right.right.right = new Node(10);
    root.left.left.right.right.right.right = new Node(11);
    root.left.left.right.right.right.right.right = new Node(12);


        // System.out.println(calcsumnodes(root));

        System.out.println(diameter(root));


        //-----------------------------------------------------/////////

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5) ;


        System.out.println(isSubtree(root,subroot));

    }
}
