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
        //Q2
        int[] nums = {0,1,2,5,4,6};
        System.out.println(Midterm_Q2.findmissing(nums));
        //Q3
        System.out.println();
        //Q4
        Midterm_Q4.TreeNode head = new Midterm_Q4.TreeNode(0);
        Midterm_Q4.TreeNode t1 = new Midterm_Q4.TreeNode(1);
        Midterm_Q4.TreeNode t2 = new Midterm_Q4.TreeNode(2);
        Midterm_Q4.TreeNode t3 = new Midterm_Q4.TreeNode(3);
        Midterm_Q4.TreeNode t4 = new Midterm_Q4.TreeNode(4);
        Midterm_Q4.TreeNode t5 = new Midterm_Q4.TreeNode(5);
        Midterm_Q4.TreeNode t6 = new Midterm_Q4.TreeNode(6);

        head.left = t1;
        head.right = t2;
        t1.left = t3;
        t1.right =t4;
        t2.left =t5;
        t2.right=t6;
        Midterm_Q4.printTree(head);

    }
}
