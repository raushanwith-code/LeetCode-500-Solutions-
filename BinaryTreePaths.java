import java.util.*;

public class BinaryTreePaths {

    static class Node {

        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    static List<String> ans = new ArrayList<>();

    static void paths(Node root, String path) {

        if (root == null) {
            return;
        }

        path += root.val;

        if (root.left == null &&
            root.right == null) {

            ans.add(path);
            return;
        }

        path += "->";

        paths(root.left, path);
        paths(root.right, path);
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.right = new Node(5);

        paths(root, "");

        System.out.println(ans);
    }
}