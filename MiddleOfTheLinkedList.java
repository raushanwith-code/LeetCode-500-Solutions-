import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MiddleOfTheLinkedList {

    // Function to find middle node
    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of linked list
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        // Input values
        System.out.println("Enter values:");
        Node head = new Node(sc.nextInt());
        Node current = head;

        for (int i = 1; i < n; i++) {
            current.next = new Node(sc.nextInt());
            current = current.next;
        }

        // Find middle node
        Node middle = findMiddle(head);
        System.out.println("Middle node value: " + middle.data);

        sc.close();
    }
}
