public class HW4_Q2 {
    //Definition for a Node
    static class Node {
        public int val;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    }
//Time: O(n) Space: O(1)
    public static Node insert(Node head, int insertVal){
        Node insert = new Node(insertVal);
        Node current = head;
        //分四种情况讨论
        //head为空时
        if(head == null){
            insert.next = insert;
            return insert;
        }
        //head.val == insertVal时
        if(head.val == insert.val){
            insert.next = head.next;
            head.next = insert;
            return head;
        }
        //head.val < insertVal时, 边界为loop的最大值
        if(head.val < insert.val){
            while(current.next.val >= current.val && current.next != head){
                if(current.next.val >= insertVal && current.val <= insertVal){
                    insert.next = current.next;
                    current.next = insert;
                    return head;
                }
                current = current.next;
            }
            //此时current是 loop max 或 loop end(如果loop 所有值都相等)
            if(current.val <= insertVal){
                insert.next = current.next;
                current.next = insert;
                return head;
            }
        }
        //head.val > insertVal时
        if(head.val > insert.val){
            while(current.next.val >= current.val && current.next != head){
                current = current.next;
            }
            //此时为相等loop, insert插入loop end后面
            if(current.next == head){
                insert.next = current.next;
                current.next = insert;
                return head;
            }
            //此时current是loop max
            //如果loop min大于等于insertVal, 在loop min 前插入
            if(current.next.val >= insertVal){
                insert.next = current.next;
                current.next = insert;
                return head;
            }else if(current.next.val < insertVal){//此时loop min 必小于insertVal
                current = current.next; //current = loopmin
                while(current.next.val <= insertVal){
                    current = current.next;
                }
                insert.next = current.next;
                current.next = insert;
                return head;
            }
        }
        return head;
    }
}
