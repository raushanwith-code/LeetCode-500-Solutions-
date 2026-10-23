public class DeleteBST {

    static class Node {

        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    static Node findMin(Node root) {

        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    static Node delete(Node root, int key) {

        if (root == null) {
            return null;
        }

        if (key < root.val) {

            root.left = delete(root.left, key);

        } else if (key > root.val) {

            root.right = delete(root.right, key);

        } else {

            // Case 1 : Leaf Node
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2 : One Child

            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            // Case 3 : Two Children

            Node successor = findMin(root.right);

            root.val = successor.val;

            root.right =
                    delete(root.right, successor.val);
        }

        return root;
    }

    static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);

        System.out.print(root.val + " ");

        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(5);

        root.left = new Node(3);
        root.right = new Node(7);

        root.right.left = new Node(6);
        root.right.right = new Node(8);

        root = delete(root, 5);

        inorder(root);
    }
}