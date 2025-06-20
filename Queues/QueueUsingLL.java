public class QueueUsingLL {
    static class Node{
        int data ;
        Node next ;

        Node(int data){
            this.data = data ;
            this.next = null ;
        }

    }
    static class  Queue {
        static Node head = null ;
        static Node tail = null ;

        public static boolean isEmpty(){
            return head == null && tail == null ;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null && tail == null){
                head = tail = newNode ;
                return ;
            }
            tail.next = newNode ;
            tail = newNode ;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1 ;
            }
            int res = head.data ;
            head = head.next ;
            return res ;

        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue Empty");
                return -1 ;
            }
            return head.data ;
        }



        
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(! q.isEmpty()){
            System.out.print(q.peek()+"->");
            q.remove();
        }
  

    

    }
}
