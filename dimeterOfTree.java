public class dimeterOfTree {

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

   static int heightOfTree(Node root){

        if(root==null) return 0;

        int leftHeight=heightOfTree(root.left);
        int rightHeight=heightOfTree(root.right);

        return Math.max(leftHeight, rightHeight)+1;
    }

    static int diameter(Node root){

        if(root==null) return 0;

        int leftDiameter=diameter(root.left);
        int rightDiameter=diameter(root.right);

        int rootDiameter=heightOfTree(root.left)+heightOfTree(root.right);

        return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
    }

    public static void main(String[] args) {

         Node root=new Node(1);

        root.left=new Node(2);
        root.right=new Node(3);

        root.left.left=new Node(4);
        root.left.right=new Node(5);

        System.out.print("Total tree NOde is:-"+diameter(root));
        
    }
    
}
