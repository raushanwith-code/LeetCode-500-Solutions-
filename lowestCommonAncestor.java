public class lowestCommonAncestor {

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

    static Node lca(Node root, int p, int q){

        if(root==null) return null;

        if(root.val==p || root.val==q){

            return root;
        }

        Node left=lca(root.left, p, q);
        Node right=lca(root.right, p, q);

        if(left !=null && right !=null){

            return root;
        }

        if(left !=null){

            return left;
        }
        return right;

    }

    public static void main(String[] args) {

         Node root = new Node(3);

        root.left = new Node(5);
        root.right = new Node(1);

        root.left.left = new Node(6);
        root.left.right = new Node(2);

        root.right.left = new Node(0);
        root.right.right = new Node(8);

        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);

         Node ans = lca(root, 5, 1);

           System.out.println("LCA = " + ans.val);
        
    }
    
}
