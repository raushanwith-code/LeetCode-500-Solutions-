public class heightOfTree {

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

    static int heightTree(Node root){

        if(root==null) return 0;

        int leftHeight=heightTree(root.left);
        int rightHeight=heightTree(root.right);

        return Math.max(leftHeight, rightHeight)+1;
    }

    public static void main(String[] args) {

         Node root=new Node(1);

        root.left=new Node(2);
        root.right=new Node(3);

        root.left.left=new Node(4);
        root.left.right=new Node(5);

        System.out.print("Total tree NOde is:-"+ heightTree(root));
        
    }
    
}
