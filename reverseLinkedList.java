import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class reverseLinkedList {

    public ListNode insert(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) return newNode;
        ListNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        return head;
    }

    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverseLinkedList obj = new reverseLinkedList();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        ListNode head = null;
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            head = obj.insert(head, val);
        }

        System.out.println("Original List:");
        obj.printList(head);

        head = obj.reverseList(head);
        System.out.println("Reversed List:");
        obj.printList(head);

        sc.close();
    }
}
