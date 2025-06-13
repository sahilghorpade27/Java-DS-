import java.util.*;


public class TopView {
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
        static class Info{
            int hd ;
            Node data ;
            Info(Node data , int hd){
                this.data = data ;
                this.hd = hd ;
            }   
        }

        public static void viewTop(Node root){
            Queue<Info> q = new LinkedList<>() ;
            HashMap<Integer,Node> map = new HashMap<>() ;
            
            int min =0 , max = 0 ;

            q.add(new Info(root,0)) ;
            q.add(null) ;

            while(! q.isEmpty()){
                Info curr = q.remove();
                if(curr == null){
                    if(q.isEmpty()){
                        break ;
                    }else{
                        q.add(null) ;
                    }
                }else{
                    if(! map.containsKey(curr.hd)){
                        map.put(curr.hd , curr.data) ;
                    }
                    if(curr.data.left != null){
                        q.add(new Info(curr.data.left,curr.hd-1)) ;
                        min = Math.min(min,curr.hd-1) ;
                    }
                    if(curr.data.right != null){
                        q.add(new Info(curr.data.right,curr.hd+1)) ;
                        max = Math.max(max,curr.hd+1) ;
                    }

                }
            }
            for(int i=min ; i<=max ; i++){
                System.out.print(map.get(i).data+" ");
            }


        }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(3);
        root.left = new Node(2);  
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.print("Top View of the tree is : " );
        viewTop(root);
        
    }
}
