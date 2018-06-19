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
public class middleNode {
  public ListNode middleNode(ListNode head) {
    if(head == null){
      return null;
    }
    ListNode slow = head;
    ListNode fast = head;
    while(fast != null && fast.next != null) { //1->2->3->4 take 3 as middle
      slow = slow.next;
      fast = fast.next.next;
    }
    // while(fast.next != null && fast.next.next != null) { // 1->2->3->4 take 2 as middle
    //   slow = slow.next;
    //   fast = fast.next.next;
    // }
    return slow;
  }
}
