public class Linkedlistbasics {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addmiddle(int idx, int data) {
        if (idx == 0) {
            addfirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void printll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int search(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = tail = null;
            return;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    public int helper(Node head , int key){
        if(head == null){
            return -1 ;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1 ;
        }
        return idx+1 ;
    }

    public int recSearch(int key){
        return helper(head , key);
    }

    public void revll(){
        Node prev = null ;
        Node curr =tail= head ;
        Node next ;
        while(curr != null){
            next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }
        head = prev ;
    }

    public void removenthfromend(int n){
        Node temn = head ;
        int sz = 1;
        while(temn.next != null){
            temn = temn.next ;
            sz++ ;
        }
        if(n == sz){
            head = head.next ;
        }
        int i=1 ;
        Node temp = head ;
        while(i<(sz-n)){
            temp = temp.next ;
            i++ ;
        }
        temp.next = temp.next.next ;
        
    }
    


    //slow fast approch 
    private Node findminNode(Node head) {
        Node slow = head;
        Node fast = head;
    
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    

    public boolean checkPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
    
        // Find Mid
        Node mid = findminNode(head);
    
        // Reverse second half
        Node Curr = mid;
        Node Prev = null;
        Node Next;
    
        while (Curr != null) {
            Next = Curr.next;
            Curr.next = Prev;
            Prev = Curr;
            Curr = Next;
        }
    
        Node right = Prev; // Reversed half
        Node left = head;
    
        // Check if equal
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        //Detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;  
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        //find meeting point 
        slow = head ;
        Node prev = null ;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
             

        //remove cycle
        prev.next = null; 
    }

    public static void main(String[] args) {
        // Linkedlistbasics ll = new Linkedlistbasics();
        // ll.addfirst(1);
        // ll.addfirst(2);
        // ll.addfirst(2);
        
        // ll.printll();
        // boolean isPalindrome = ll.checkPalindrome(head);
        // System.out.println("Is Palindrome: " + isPalindrome);

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);   
        head.next.next.next = head.next ;

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
    
}
