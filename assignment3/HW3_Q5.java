public class HW3_Q5 {
    //Time: O(n) Space: O(1)
    public class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

    public ListNode nodemiddle(ListNode head) {
        ListNode slowone = head, fastone = head;

        while (fastone != null && fastone.next != null) {
            slowone = slowone.next;
            fastone = fastone.next.next;
        }
        return slowone;
    }
}
