public class basicTree {

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {

        // Tree Creation

        Node root=new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        /*
                 1
                / \
               2   3
              / \
             4   5
        */

        System.out.println(root.val); // 1
    }
}