public class HW3_Q6 {
    //Time O(N) Space: O(1)

    class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast  !=null && fast.next !=null){

            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                ListNode start = head;
                while(slow != start){

                    slow = slow.next;
                    start = start.next;
                }
                return slow;
            }
        }
        return null;
    }
}
