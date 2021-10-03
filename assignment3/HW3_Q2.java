public class HW3_Q2 {
    public static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  //Time: O(n)  Space: O(1)
    public static ListNode removeItems(ListNode head, int val){
        if(head == null){
            return head;
        }
        ListNode pointer = head;
        while(pointer.next != null){
            if(pointer.next.val == val){
                pointer.next = pointer.next.next;
            }
            else{
                pointer = pointer.next;
            }
        }
        if(head.val == val){
            return head.next;
        }
        return head;
    }
}
