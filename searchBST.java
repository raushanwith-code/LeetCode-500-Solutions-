public class searchBST {

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

    static boolean search(Node root, int target){

        if(root==null) return false;

        if(root.val==target) return true;

        if(target<root.val){

            return search(root.left, target);
        }
        return search(root.right, target);
    }

    public static void main(String[] args) {

        Node root=new Node(8);
         root.left = new Node(3);
        root.right = new Node(10);

        root.left.left = new Node(1);
        root.left.right = new Node(6);

        root.right.right = new Node(14);

        System.out.println(search(root, 6));
        
    }
    
}
