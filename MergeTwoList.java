class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeTwoList {

    public static ListNode merge(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        return dummy.next;
    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(10);
        l1.next = new ListNode(20);
        l1.next.next = new ListNode(40);
        ListNode l2 = new ListNode(15);
        l2.next = new ListNode(30);
        l2.next.next = new ListNode(50);
        System.out.println("First List:");
        print(l1);
        System.out.println("Second List:");
        print(l2);
        ListNode result = merge(l1, l2);
        System.out.println("Merged List:");
        print(result);
    }
}
