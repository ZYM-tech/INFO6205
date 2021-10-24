import java.util.LinkedList;

public class Midterm_Q3 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode getmid(ListNode head){
        if(head  == null){
            return null;
        }
        if(head.next == null && head != null){
            return head;
        }

        ListNode start =  Midterm_Q3.detectCycle(head);

        int size = 0;
        ListNode cur = head;
        int flag = 0;
        while(true){
            if(cur == start){
                flag++;
            }
            cur = cur.next;
            size++;
            if(flag == 2) break;
        }
        size--;
        cur = head;
        //odd
        if(size % 2 != 0){
            int n = (size+1)/2 - 1;
            for(int i=0; i<n;i++){
                cur = cur.next;
            }
            return cur;
        }//even
        else if(size % 2 == 0){
            int n = size / 2 - 1;
            for(int i=0; i<n;i++){
                cur = cur.next;
            }
            return cur;
        }
        return null;
    }

    public static ListNode detectCycle(ListNode head) {
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
