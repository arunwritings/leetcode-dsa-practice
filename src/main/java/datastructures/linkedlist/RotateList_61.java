package datastructures.linkedlist;

public class RotateList_61 {

      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode rotateRight(ListNode head, int k) {
        if (head==null || head.next==null || k==0) return head;
        //find length and tail
        ListNode tail = head;
        int length=1;
        while (tail.next!=null) {
            tail = tail.next;
            length++;
        }
        //normalize k
        k = k % length;
        if (k==0) return head;
        //make the list circular
        tail.next=head;
        //find new tail
        int stepsToNewTail= length-k;
        ListNode newTail = head;
        for (int i=1;i<stepsToNewTail;i++) {
            newTail = newTail.next;
        }
        //break the cycle
        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        RotateList_61 rotateList61 = new RotateList_61();
        ListNode result = rotateList61.rotateRight(listNode,2);
        while (result!=null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
    }
}
