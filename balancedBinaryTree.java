import java.util.*;
public class balancedBinaryTree {

   static  class Node{

        int val;
        Node left;
        Node right;

        Node(int val){

            this.val=val;
            this.left=null;
            this.right=null;
        }
    }

    static int height(Node root){

        if(root==null) return 0;

        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        return Math.max(leftHeight, rightHeight)+1;

    }

    static boolean  isBalanced(Node root){

        if(root==null) return true;

       int leftHeight=height(root.left);
       int rightHeight=height(root.right);

       if(Math.abs(leftHeight-rightHeight)>1){

        return false;
       }

        return isBalanced(root.left)
                && isBalanced(root.right);
    } 

    public static void main(String[] args) {

         Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(isBalanced(root));
        
    }
    
}
