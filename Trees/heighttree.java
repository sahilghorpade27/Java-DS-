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
            return 0 ;
        }
        int leftdiam = diameter(root.left);
        int rightdiam = diameter(root.right);
        int rh = calcheight(root.right);
        int lh = calcheight(root.left);
        int selfdiam = rh + lh + 1 ;

        return Math.max(selfdiam , Math.max(leftdiam,rightdiam));
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
        root.right = new Node(3);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // System.out.println(calcsumnodes(root));

        // System.out.println(diameter(root));


        //-----------------------------------------------------/////////

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5) ;


        System.out.println(isSubtree(root,subroot));

    }
}
