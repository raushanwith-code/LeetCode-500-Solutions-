public class lcaBst {

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

        if(p<root.val && q<root.val) return lca(root.left, p,q);

        if(p>root.val && q>root.val){

            return lca(root.right, p, q);
        }
        return root;
    }

    public static void main(String[] args) {

          Node root = new Node(6);

        root.left = new Node(2);
        root.right = new Node(8);

        root.left.left = new Node(0);
        root.left.right = new Node(4);

        root.right.left = new Node(7);
        root.right.right = new Node(9);

        root.left.right.left = new Node(3);
        root.left.right.right = new Node(5);

        Node ans = lca(root, 2, 8);

        System.out.println(ans.val);
        
    }
    
}
