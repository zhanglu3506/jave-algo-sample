// Merge two sorted lists into one large sorted list.
//
// Examples
//
// L1 = 1 -> 4 -> 6 -> null, L2 = 2 -> 5 -> null, merge L1 and L2 to 1 -> 2 -> 4 -> 5 -> 6 -> null
// L1 = null, L2 = 1 -> 2 -> null, merge L1 and L2 to 1 -> 2 -> null
// L1 = null, L2 = null, merge L1 and L2 to null

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
  public ListNode merge(ListNode one, ListNode two) {
    ListNode dummyHead = new ListNode(-1);
    ListNode i = dummyHead;
    ListNode a = one;
    ListNode b = two;

    while(a != null && b != null) {
      if(a.value >= b.value) {
        i.next = b;
        b = b.next;
      } else {
        i.next = a;
        a = a.next;
      }
      i = i.next;
    }
    if(a != null) {
      i.next = a;
    }
    if(b != null) {
      i.next = b;
    }
    return dummyHead.next;
  }
}
