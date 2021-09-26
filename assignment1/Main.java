import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){
/*
        //region Assignment 1
        //Question 1 Testcase
        int[] nums = new int[]{2,0,2,1,1,0};
        int[] sorted_nums  = Question_1.sortColor(nums);
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
        //Assignment 2
        //Question 1 Testcase
        int[] nums ={2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(Question1.twoSum(nums,target)));

    }
}
