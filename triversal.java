public class triversal{

    // Node Class
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Preorder Traversal
    static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder Traversal
    static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Postorder Traversal
    static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // Count Nodes
    static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        return countNodes(root.left)
                + countNodes(root.right)
                + 1;
    }

    // Sum of Nodes
    static int sumNodes(Node root) {
        if (root == null) {
            return 0;
        }

        return sumNodes(root.left)
                + sumNodes(root.right)
                + root.data;
    }

    // Height of Tree
    static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {

        /*
                    1
                  /   \
                 2     3
                / \   / \
               4  5  6   7
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Preorder:");
        preorder(root);

        System.out.println("\n\nInorder:");
        inorder(root);

        System.out.println("\n\nPostorder:");
        postorder(root);

        System.out.println("\n\nTotal Nodes = "
                + countNodes(root));

        System.out.println("Sum of Nodes = "
                + sumNodes(root));

        System.out.println("Height = "
                + height(root));
    }
}