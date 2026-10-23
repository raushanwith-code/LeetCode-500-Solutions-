public class countNodeTree {

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

    static int countNode(Node root){

        if(root==null) return 0;

        return countNode(root.left)+countNode(root.right)+1;
    }

    public static void main(String[] args) {

        Node root=new Node(1);

        root.left=new Node(2);
        root.right=new Node(3);

        root.left.left=new Node(4);
        root.left.right=new Node(5);

        System.out.print("Total tree NOde is:-"+countNode(root));

        
    }
    
}
