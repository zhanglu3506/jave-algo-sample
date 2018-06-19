// Insert a value in a sorted linked list.
//
// Examples
//
// L = null, insert 1, return 1 -> null
// L = 1 -> 3 -> 5 -> null, insert 2, return 1 -> 2 -> 3 -> 5 -> null
// L = 1 -> 3 -> 5 -> null, insert 3, return 1 -> 3 -> 3 -> 5 -> null
// L = 2 -> 3 -> null, insert 1, return 1 -> 2 -> 3 -> null

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
public class InsertLinkedList {
  public ListNode insert(ListNode head, int value) {
    if(head == null || value <= head.value) {
      ListNode newNode = new ListNode(value);
      newNode.next = head;
      return newNode;
    }
    ListNode i = head;
    while(i.next != null) { // while loop break at last listNode
      if(i.value <= value && value < i.next.value) {
        ListNode newNode = new ListNode(value);
        newNode.next = i.next;
        i.next = newNode;
        return head;
      }
      i = i.next;
    }
    i.next = new ListNode(value); // case:  value >= last.value;
    return head;
  }
}
