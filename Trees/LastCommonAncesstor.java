import java.util.ArrayList;

public class LastCommonAncesstor {
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

    public static boolean getpath(Node root , int n , ArrayList<Node>path){

        if(root == null){
            return false ;
        }

        path.add(root);

        if(root.data == n){
            return true ; 
        }

        boolean foundleft = getpath(root.left, n, path);
        boolean foundright = getpath(root.right, n, path);

        if(foundright || foundleft){
            return true ;
        }

        path.remove(path.size()-1);

        return false ;       

    }

    public static Node lca(Node root , int n1 , int n2 ){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getpath(root ,n1,path1);
        getpath(root,n2,path2);

        int i=0 ;
        for(;i<path1.size() && i<path2.size() ; i++){
            if(path1.get(i) != path2.get(i)){
                break ;
            }
        }

        Node lc = path1.get(i-1);

        return lc;
        


    }
    public static void main(String[] args) {
        Node root = new Node(1) ;
        root.left = new Node(2) ;
        root.right = new Node(3) ;
        root.left.left = new Node(4) ;
        root.left.right = new Node(5) ;
        root.right.left = new Node(6) ;
        root.right.right = new Node(7) ;

        int n1 = 4 , n2 = 5 ;

        System.out.println(lca(root , n1 , n2 ).data);

    }
}
