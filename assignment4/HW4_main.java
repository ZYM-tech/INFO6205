public class HW4_main {
    public static void main(String[] args){
        //HW4_Q1 Testcase
        HW4_Q1.ListNode node1 = new HW4_Q1.ListNode(4);
        HW4_Q1.ListNode node2 = new HW4_Q1.ListNode(5);
        HW4_Q1.ListNode node3 = new HW4_Q1.ListNode(1);
        HW4_Q1.ListNode node4 = new HW4_Q1.ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        HW4_Q1.deleteNode(node2);
        HW4_Q1.ListNode current = node1;
        while(current != null){
            System.out.print(current.val+" ");
            current = current.next;
        }

        //HW4_Q2 Testcase: https://leetcode.com/problems/insert-into-a-sorted-circular-linked-list/

    }
}
