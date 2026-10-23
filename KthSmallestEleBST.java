import java.util.*;
public class KthSmallestEleBST {

    static class Node{

        int val;
        Node left;
        Node right;

        Node(int val){
            this.val=val;
        }
    }
   
    static ArrayList<Integer> list=new ArrayList<>();

    static void inorder(Node root){

        if(root==null) return;

        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    static int kthSmall(Node root, int k){

        list.clear();

        inorder(root);

        return list.get(k-1);
    }
    

    public static void main(String[] args) {

         Node root = new Node(5);

        root.left = new Node(3);
        root.right = new Node(7);

        root.left.left = new Node(1);
        root.left.right = new Node(4);

        int k = 3;

        System.out.println(kthSmall(root, k));
        
    }
    
}
