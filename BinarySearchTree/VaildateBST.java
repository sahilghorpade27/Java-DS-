public class VaildateBST {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data < val) {
            root.right = insert(root.right, val);
        } else {
            root.left = insert(root.left, val);
        }

        return root;
    }

    public static boolean isBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        }
        if (max != null && max.data <= root.data) {
            return false;
        }

        return isBST(root.left, min, root) && isBST(root.right, root, max);
    }

    public static void main(String[] args) {
        int value[] = {1,1,1};
        Node root = null;

        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }

        if (isBST(root, null, null)) {
            System.out.println("It is a BST");
        } else {
            System.out.println("It is not a BST");
        }
    }
}