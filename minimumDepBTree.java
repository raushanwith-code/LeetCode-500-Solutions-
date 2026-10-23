public class minimumDepBTree {


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

    static int minDepth(Node root){

        if(root==null) return 0;

        if(root.left==null && root.right==null) return 1;

        if(root.left==null) return minDepth(root.right)+1;

        if(root.right==null) return minDepth(root.left)+1;

        return Math.min(minDepth(root.left), minDepth(root.right)+1);
    }

    public static void main(String[] args) {

         Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);

        System.out.println(minDepth(root));
        
    }
    
}
