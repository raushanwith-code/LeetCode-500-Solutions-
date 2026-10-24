import java.util.*;

public class BSTIteratorDemo {

    static class Node {

        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    static class BSTIterator {

        Stack<Node> stack = new Stack<>();

        BSTIterator(Node root) {
            pushAllLeft(root);
        }

        private void pushAllLeft(Node node) {

            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }

        public int next() {

            Node temp = stack.pop();

            pushAllLeft(temp.right);

            return temp.val;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(7);

        root.left = new Node(3);

        root.right = new Node(15);
        root.right.left = new Node(9);
        root.right.right = new Node(20);

        BSTIterator it = new BSTIterator(root);

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}