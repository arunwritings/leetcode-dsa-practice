package datastructures.linkedlist;

public class AddTwoNumbers_2 {
    
      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry=0;
        while (l1!=null || l2!=null) {
            int x = (l1!=null) ? l1.val : 0;
            int y = (l2!=null) ? l2.val : 0;
            int sum = x+y+carry;
            carry = sum/10;
            current.next = new ListNode(sum%10);
            current = current.next;
            if (l1!=null) l1 = l1.next;
            if (l2!=null) l2 = l2.next;
        }
        if (carry>0) {
            current.next = new ListNode(carry);
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(2);
        listNode.next = new ListNode(4);
        listNode.next.next = new ListNode(3);

        ListNode listNode1 = new ListNode(5);
        listNode1.next = new ListNode(6);
        listNode1.next.next = new ListNode(4);

        AddTwoNumbers_2 addTwoNumbers2 = new AddTwoNumbers_2();
        ListNode result = addTwoNumbers2.addTwoNumbers(listNode, listNode1);

        while (result!=null) {
            System.out.print(result.val+ " -> ");
            result = result.next;
        }
    }

}
