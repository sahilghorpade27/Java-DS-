import java.util.ArrayList;

public class RootToLeafpath {
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

    public static void printpath(ArrayList<Integer> path){
        for(int i=0 ; i<path.size() ; i++){
            System.out.print(path.get(i)+"->") ;
        }
        System.out.print("null") ;
        System.out.println();
    }

    public static void printroot2leaf(Node root , ArrayList<Integer> path){
        if(root == null){
            return ;
        }
        if(root.left == null && root.right == null){
            printpath(path) ;
        }
        path.add(root.data) ;
        printroot2leaf(root.left, path);
        printroot2leaf(root.right, path);
        path.remove(path.size()-1) ;
    }


    public static void main(String[] args) {
        int value[] = {8,5,3,1,4,6,10,11,14} ;
        Node root = null ;

        for(int i=0 ; i<value.length ; i++){
            root = insert(root , value[i]) ;
        }
        
        ArrayList<Integer> path = new ArrayList<>() ;
        printroot2leaf(root, path);
        

    }
}

