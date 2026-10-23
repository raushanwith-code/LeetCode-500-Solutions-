public class invertTree {

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

    static Node InvertTree(Node root){

        if(root==null) return null;

       Node temp=root.left;
       root.left=root.right;
       root.right=temp;

       InvertTree(root.left);
       InvertTree(root.right);

       return root;


    }

    static void preorder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");

        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {

         Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        
         InvertTree(root);
          preorder(root);
    }
    
}
