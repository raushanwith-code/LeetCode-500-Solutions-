import java.util.*;
class pathSum{


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

    static boolean Pathsum(Node root, int target){

        if(root==null) return false;

        if(root.left==null && root.right==null) return target==root.val;

       

          return Pathsum(
                root.left,
                target - root.val
        ) ||
        Pathsum(
                root.right,
                target - root.val
        );
    }

    public static void main(String[] args) {

       Node root = new Node(5);

        root.left = new Node(4);
        root.right = new Node(8);

        root.left.left = new Node(11);

        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);

        root.right.left = new Node(13);
        root.right.right = new Node(4);

        System.out.println(
            Pathsum(root, 22)
        );
        
    }
}