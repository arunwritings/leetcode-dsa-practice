package datastructures.linkedlist;

public class ReverseLinkedListII_92 {

      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head.next==null || left==right) return head;
        ListNode dummy = new ListNode(0,head);
        ListNode beforeReverse = dummy;
        for (int i=0;i<left-1;i++) {
            beforeReverse = beforeReverse.next;
        }
        ListNode connBeforeReverse = beforeReverse;
        ListNode firstNodeToReverse = beforeReverse.next;
        ListNode previous = beforeReverse;
        ListNode current = firstNodeToReverse;

        for (int i=0;i<right-left+1;i++) {
            ListNode nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        connBeforeReverse.next = previous;
        firstNodeToReverse.next = current;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ReverseLinkedListII_92 r = new ReverseLinkedListII_92();
        ListNode result = r.reverseBetween(head, 2,4);
        while (result!=null) {
            System.out.print(result.val+" -> ");
            result = result.next;
        }
    }
}
