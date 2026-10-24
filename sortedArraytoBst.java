public class sortedArraytoBst {

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

    static Node buildBst(int nums[], int start, int end){

        if(start> end){

            return null;
        }

        int mid=start+(end-start)/2;

        Node root=new Node(nums[mid]);

        root.left=buildBst(nums, start, mid-1);
        root.right=buildBst(nums, mid+1, end);

        return root;
    }

    static void preorder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");

        preorder(root.left);
        preorder(root.right);

    }

    public static void main(String[] args) {

         int[] nums = {-10, -3, 0, 5, 9};

        Node root =
                buildBst(nums, 0, nums.length - 1);

        preorder(root);
        
    }
    
}
