public class MinimumAbsoluteDiffBst {

   static class Node{
        int val;
        Node  left;
        Node right;

        Node(int val){
            this.val=val;     
           }
    }

    static int minDiff=Integer.MAX_VALUE;
    static Node prev=null;

    static void inorder(Node root){

        if(root==null) return;

        inorder(root.left);

        if(prev !=null){

            minDiff=Math.min(minDiff, root.val-prev.val);
        }

        prev=root;
        inorder(root.right);
    }

    static int getMinDiff(Node root){

        inorder(root);

        return minDiff;
    }

    public static void main(String[] args) {

        Node root = new Node(4);

        root.left = new Node(2);
        root.right = new Node(6);

        root.left.left = new Node(1);
        root.left.right = new Node(3);

        System.out.println(
            getMinDiff(root)
        );
        
        
    }
    
}
