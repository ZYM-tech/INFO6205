import java.util.HashSet;
import java.util.Set;
public class HW3_Q1 {

    public static class ListNode<T> {
        int val;
        ListNode next;
        ListNode(){}
        public void setVal(int data){
            this.val = data;
        }
    }

//Time: O(N) Space: O(N)
   public static ListNode getIntersection(ListNode headA, ListNode headB){
       Set<ListNode> visited = new HashSet<>();
       while(headB != null){
           visited.add(headB);
           headB = headB.next;
       }
       while(headA != null){
           if(visited.contains(headA)){
               System.out.println("Intersected at "+headA.val);
               return headA;
           }
           headA = headA.next;
       }
       System.out.println("No intersection");
       return null;
   }
}
