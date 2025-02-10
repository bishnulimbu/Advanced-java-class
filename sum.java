/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNode {
  int val;
  ListNode next;
  // two varaible for the value and next value reference.

  ListNode() {
  };
  // initializing constructor

  ListNode(int val) {
    this.val = val;
  }
  // initail value prbably.

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

}

class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode c = new ListNode();
    c.val = l1.val + l2.val;
    c.next = l1.next + l2.next;
    return c;

  }
}

class sum {
  public static void main(String[] args) {
    ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
    ListNode l2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
    Solution s = new Solution();
    ListNode result = s.addTwoNumbers(l1, l2);
    System.out.println(result);

  }
}
