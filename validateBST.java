public class validateBST {

    static class Node{

        int val;
        Node left;
        Node right;

        Node(int val){

            this.val=val;
            this.left=null;
            this.right=null;
        }
    }

    static boolean isBST(Node root, long min, long max){

        if(root==null) return true;

        if(root.val <=min || root.val>=max){

            return false;
        }

        return isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
    }

    public static void main(String[] args) {

        Node root = new Node(5);

        root.left = new Node(3);
        root.right = new Node(7);

        root.left.left = new Node(1);
        root.left.right = new Node(4);

        System.out.println(
                isBST(root, Long.MIN_VALUE, Long.MAX_VALUE)
        );
        
    }
    
}
