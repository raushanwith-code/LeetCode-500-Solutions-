import java.util.*;
public class levelOrderTraversal {

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

  static void levelOrdertri(Node root){

    if(root==null) return;

    Queue<Node> q=new LinkedList<>();

    q.offer(root);

    while(!q.isEmpty()){

        Node current=q.poll();

        System.out.print(current.val+" ");

        if(current.left !=null){

            q.offer(current.left);
        }

        if(current.right !=null){

            q.offer(current.right);
        }
    }

      
  }

    public static void main(String[] args) {

         Node root=new Node(1);

        root.left=new Node(2);
        root.right=new Node(3);

        root.left.left=new Node(4);
        root.left.right=new Node(5);

      levelOrdertri(root);
        
    }
    
}
