package datastructures.linkedlist;

public class DeleteTheMiddleNodeOfALinkedList_2095 {
    
      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        assert slow.next != null;
        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);

        DeleteTheMiddleNodeOfALinkedList_2095 d = new DeleteTheMiddleNodeOfALinkedList_2095();
        ListNode listNode1 = d.deleteMiddle(listNode);
        while (listNode1!=null) {
            System.out.print(listNode1.val + " -> ");
            listNode1 = listNode1.next;
        }
    }
}
