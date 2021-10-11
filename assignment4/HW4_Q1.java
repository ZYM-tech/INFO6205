public class HW4_Q1 {
    //Time: O(1)  Space: O(1)
    public static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }
   public static void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
   }
}
