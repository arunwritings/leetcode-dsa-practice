package datastructures.linkedlist;

public class IntersectionOfTwoLinkedLists_160 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pointerA = headA;
        ListNode pointerB = headB;

        while (pointerA != pointerB) {
            pointerA = (pointerA == null) ? headB : pointerA.next;
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }
        return pointerA;
    }

    public static void main(String[] args) {
        // Create nodes for the intersecting part
        ListNode common = new ListNode(8);
        common.next = new ListNode(10);

        // Create first linked list: 4 -> 1 -> 8 -> 10
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;

        // Create second linked list: 5 -> 6 -> 1 -> 8 -> 10
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;

        // Run intersection finder
        IntersectionOfTwoLinkedLists_160 solver = new IntersectionOfTwoLinkedLists_160();
        ListNode intersection = solver.getIntersectionNode(headA, headB);
        if (intersection != null)
            System.out.println("Intersection at node with value: " + intersection.val);
        else
            System.out.println("No intersection found.");
    }
}
