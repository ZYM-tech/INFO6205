import java.util.*;

public class Midterm_main {
    public class TreeNode {
        int val;
        Midterm_Q4.TreeNode left;
        Midterm_Q4.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, Midterm_Q4.TreeNode left, Midterm_Q4.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args){
        //Q1
        int[] nums1  = {0,1,0,5,0};
        System.out.println(Arrays.toString(Midterm_Q1.movezero(nums1)));
        System.out.println();
        //Q2
        int[] nums = {0,1};
        System.out.println(Midterm_Q2.findmissing(nums));
        System.out.println();

        //Q3
        Midterm_Q3.ListNode head = new Midterm_Q3.ListNode(1);
        Midterm_Q3.ListNode h2 = new Midterm_Q3.ListNode(2);
        Midterm_Q3.ListNode h3 = new Midterm_Q3.ListNode(3);
        Midterm_Q3.ListNode h4 = new Midterm_Q3.ListNode(4);
        Midterm_Q3.ListNode h5 = new Midterm_Q3.ListNode(5);
        head.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h5;
        h5.next = h2;
        System.out.println(Midterm_Q3.getmid(head).val);
        System.out.println();

        //Q4
        Midterm_Q4.TreeNode root = new Midterm_Q4.TreeNode(0);
        Midterm_Q4.TreeNode t1 = new Midterm_Q4.TreeNode(1);
        Midterm_Q4.TreeNode t2 = new Midterm_Q4.TreeNode(2);
        Midterm_Q4.TreeNode t3 = new Midterm_Q4.TreeNode(3);
        Midterm_Q4.TreeNode t4 = new Midterm_Q4.TreeNode(4);
        Midterm_Q4.TreeNode t5 = new Midterm_Q4.TreeNode(5);
        Midterm_Q4.TreeNode t6 = new Midterm_Q4.TreeNode(6);

        root.left = t1;
        root.right = t2;
        t1.left = t3;
        t1.right =t4;
        t2.left =t5;
        t2.right=t6;
        Midterm_Q4.printTree(root);

    }
}
