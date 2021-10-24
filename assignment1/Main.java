import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/*
public class Main {

    public static void main(String[] args){

        //region Assignment 1
        //Question 1 Testcase
        int[] nums = new int[]{2,0,2,1,1,0};
        int[] sorted_nums  = Midterm_Q1.sortColor(nums);
        System.out.println("Question 1: "+Arrays.toString(sorted_nums));


        //Question 2 Testcase
        ArrayList<Question_2.Interval> meetings = new ArrayList<>();
        //add a meeting time, must be int
        meetings.add(new Question_2.Interval(7,10));
        meetings.add(new Question_2.Interval(2,4));
        meetings.add(new Question_2.Interval(4,7));//sry no meeting breaks lol
        Question_2.Allmeeting(meetings);
        System.out.println("Question 2: "+Question_2.Allmeeting(meetings));


        //Question 3 Testcase
        int[] nums_2n = new int[]{6,2,6,5,1,2};
        System.out.println("Question 3: "+Question_3.maxsum(nums_2n));


        //Question 4 Testcase
        int[] nums_sorted = new int[]{-7,-3,2,3,11};
        System.out.println("Question 4: "+Arrays.toString(Question_4.sqnums(nums_sorted)));


        //Question 5 Testcase
        String s = "a";
        String t = "b";
        System.out.println("Question 5: "+Question_5.isAnagram(s,t));


        //Question 6 Testcase
        int[] evenoddnums = new int[]{3,1,2,4};
        System.out.println("Question 6: "+Arrays.toString(Question_6.evenFirst(evenoddnums)));
        //endregion
*/


        //region Assignment 2
        //Question 1 Testcase
        /*
        int[] nums ={3,3};
        int target = 6;
        System.out.println(Arrays.toString(Question1.twoSum(nums,target)));

        //Question 2 Testcase
        int[][] meetings =  {{7,10},{2,4}};
        System.out.println(Question2.minRooms(meetings));

        //Question 3 Testcase
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(Question3.intersection(nums1,nums2)));

        //Question 4 Testcase
        int[] numsQ4 = {2,3,3};
        System.out.println(Question4.majorityElement(numsQ4));

        //Question 5 Testcase
        int[] numsQ5 = {5,7,7,8,8,10};
        int targetQ5 = 8;
        System.out.println(Arrays.toString(Question5.searchRange(numsQ5,targetQ5)));

        //Question 6 Testcase
        int[][] grid = {{3,2},{1,0}};
        System.out.println(Question6.countNegatives(grid));

        //Question 7 Testcase
        int[] numsQ7 = {1,2,3,1};
        System.out.println(Question7.findPeakElement(numsQ7));

        //Question 8 Testcase
        int[] numsQ8 = {3,1,3,4,2};
        System.out.println(Question8.findDuplicate(numsQ8));

        //Question 9 Testcase
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(Question9.findKthPositive(arr,k));
*/
        //endregion
/*
        //Assignment 3
        //Question 1
        HW3_Q1.ListNode nodeHeadA = new HW3_Q1.ListNode();
        HW3_Q1.ListNode node2 = new HW3_Q1.ListNode();
        HW3_Q1.ListNode node3 = new HW3_Q1.ListNode();
        HW3_Q1.ListNode node4 = new HW3_Q1.ListNode();
        HW3_Q1.ListNode node5 = new HW3_Q1.ListNode();
        HW3_Q1.ListNode nodeHeadB = new HW3_Q1.ListNode();
        HW3_Q1.ListNode nodeB2 = new HW3_Q1.ListNode();
        HW3_Q1.ListNode nodeB3 = new HW3_Q1.ListNode();
        //listA = [4,1] + listC
        nodeHeadA.setVal(4);
        node2.setVal(1);
        nodeHeadA.next = node2;
        node2.next = node3;

        //listB = [5,6,1] + listC
        nodeHeadB.setVal(5);
        nodeB2.setVal(6);
        nodeB3.setVal(1);
        nodeHeadB.next = nodeB2;
        nodeB2.next = nodeB3;
        nodeB3.next = node3;

        // listC
        node3.setVal(8);
        node4.setVal(4);
        node5.setVal(5);// node5 is tail in this testcase
        node3.next = node4;
        node4.next = node5;

        HW3_Q1.getIntersection(nodeHeadA, nodeHeadB);

        //Question 2
        HW3_Q2.ListNode node_1 = new HW3_Q2.ListNode();
        HW3_Q2.ListNode node_2 = new HW3_Q2.ListNode();
        HW3_Q2.ListNode node_3 = new HW3_Q2.ListNode();
        HW3_Q2.ListNode node_4 = new HW3_Q2.ListNode();
        int val = 7;
        node_1.val = 7;
        node_2.val = 1;
        node_3.val = 7;
        node_4.val = 6;
        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;
        System.out.println(HW3_Q2.removeItems(node_1,val).val);
    }
}*/
