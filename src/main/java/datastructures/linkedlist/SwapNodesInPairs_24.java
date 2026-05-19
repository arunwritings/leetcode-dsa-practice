package datastructures.linkedlist;

public class SwapNodesInPairs_24 {

      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy, curr = head;
        while (curr!=null && curr.next!=null) {
            ListNode nextPair = curr.next.next;
            ListNode second = curr.next;

            second.next = curr; //point to previous node
            curr.next = nextPair; //link to next pair
            prev.next = second; // point to next node

            prev = curr; // updating pointers
            curr = nextPair;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        SwapNodesInPairs_24 s = new SwapNodesInPairs_24();
        ListNode result = s.swapPairs(head);

        while (result!=null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
    }
}
