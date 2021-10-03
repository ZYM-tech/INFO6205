public class HW3_Q3 {
    public class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  //Time: O(n) Space: O(n)
    public ListNode addTwoNumbers(ListNode headA, ListNode headB) {
        int countA = 1;
        int countB = 1;
        ListNode A = headA;
        ListNode B = headB;
        while(headA.next != null){
            headA = headA.next;
            countA++;
        }
        while(headB.next !=null){
            headB = headB.next;
            countB++;
        }
        ListNode big = new ListNode();
        ListNode small = new ListNode();
        if(countA>countB){
            //A位数大于等于B
            big = A;
            small = B;
        }else{
            //B位数大于A
            big = B;
            small = A;
        }
        ListNode sum = new ListNode();
        sum = big;
        while(big != null){
            int s = big.val + small.val;
            //相加小于10时
            if(s<10){
                big.val = s;
                big = big.next;
                small = small.next;
            }
            //相加大于等于10
            else if(s>=10 && s<20){
                if(big.next == null){
                    ListNode bigend = new ListNode();
                    big.next = bigend;
                }
                big.val = s - 10;
                big.next.val = big.next.val + 1;
                big = big.next;
                small = small.next;
            }
            //如果small的位数不够, 用0来补位
            if(small == null){
                ListNode smallend = new ListNode();
                smallend.val = 0;
                small = smallend;
            }
        }
        return sum;
    }
}
