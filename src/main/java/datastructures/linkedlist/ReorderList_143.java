package datastructures.linkedlist;

public class ReorderList_143 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) { this.val = val; }
    }

    public void reorderList(ListNode head) {
        ListNode fast=head;
        ListNode slow = head;
        while (fast.next!=null && fast.next.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode secondHalf = slow.next;
        slow.next=null;

        ListNode previousNode = null;
        ListNode current = secondHalf;

        while (current!=null) {
            ListNode temp = current.next;
            current.next = previousNode;
            previousNode = current;
            current = temp;
        }

        ListNode firstHalfCurrent = head;
        ListNode secondHalfCurrent = previousNode;

        while (secondHalfCurrent!=null) {
            ListNode firstHalfNext = firstHalfCurrent.next;
            ListNode secondHalfNext = secondHalfCurrent.next;

            firstHalfCurrent.next = secondHalfCurrent;
            secondHalfCurrent.next = firstHalfNext;
            firstHalfCurrent = firstHalfNext;
            secondHalfCurrent = secondHalfNext;
        }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);

        ReorderList_143 r = new ReorderList_143();
        r.reorderList(node);
    }
}
