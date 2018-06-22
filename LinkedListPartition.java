// Given a linked list and a target value T,
// partition it such that all nodes less than T are listed before the nodes larger than or equal to target value T.
// The original relative order of the nodes in each of the two partitions should be preserved.
//
// Examples
//
// L = 2 -> 4 -> 3 -> 5 -> 1 -> null, T = 3, is partitioned to 2 -> 1 -> 4 -> 3 -> 5 -> null

/**
 * class ListNode {
 *   public int value;
 *   public ListNode next;
 *   public ListNode(int value) {
 *     this.value = value;
 *     next = null;
 *   }
 * }
 */
public class Solution {
  public ListNode partition(ListNode head, int target) {
    ListNode dummyLeft = new ListNode(-1);
    ListNode dummyRight = new ListNode(-2);
    ListNode dummyTarget = new ListNode(target);

    ListNode i = head;
    ListNode l = dummyLeft;
    ListNode r = dummyRight;
    ListNode t = dummyTarget;

    while(i != null) {
      if(i.value < target) {
        l.next = i;
        l = l.next;
      } else if(i.value == target) {

      } else {
        r.next = i;
        r = r.next;
      }
    }

  }
}
