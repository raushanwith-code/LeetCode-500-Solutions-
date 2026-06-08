import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class IntersectionTwoLinkedList {

    // Function to insert node at end
    public static ListNode insert(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) return newNode;
        ListNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        return head;
    }

    // Function to print list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Function to find intersection
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != p2) {
            p1 = (p1 == null) ? headB : p1.next;
            p2 = (p2 == null) ? headA : p2.next;
        }

        return p1; // either intersection node or null
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for List A
        System.out.print("Enter number of elements in List A: ");
        int n1 = sc.nextInt();
        ListNode headA = null;
        System.out.println("Enter elements of List A:");
        for (int i = 0; i < n1; i++) {
            headA = insert(headA, sc.nextInt());
        }

        // Input for List B
        System.out.print("Enter number of elements in List B: ");
        int n2 = sc.nextInt();
        ListNode headB = null;
        System.out.println("Enter elements of List B:");
        for (int i = 0; i < n2; i++) {
            headB = insert(headB, sc.nextInt());
        }

        // Example: manually create intersection (for demo)
        // Linking last node of B to second node of A
        if (headB != null && headA != null && headA.next != null) {
            ListNode tempB = headB;
            while (tempB.next != null) tempB = tempB.next;
            tempB.next = headA.next; // intersection at headA.next
        }

        System.out.println("List A:");
        printList(headA);
        System.out.println("List B:");
        printList(headB);

        ListNode intersection = getIntersectionNode(headA, headB);

        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.val);
        } else {
            System.out.println("No intersection");
        }

        sc.close();
    }
}
