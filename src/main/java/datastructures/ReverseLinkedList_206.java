package datastructures;

public class ReverseLinkedList_206 {

     public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
         ListNode previous = null;
         ListNode current = head;
         while (current!=null) {
             ListNode next = current.next;
             current.next = previous;
             previous = current;
             current = next;
         }
         return previous;
    }

    private void printList(ListNode head) {
         while (head!=null) {
             System.out.print(head.val+" ");
             head = head.next;
         }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        ReverseLinkedList_206 reverseLinkedList206 = new ReverseLinkedList_206();
        ListNode result =  reverseLinkedList206.reverseList(listNode);
        reverseLinkedList206.printList(result);
    }

}
