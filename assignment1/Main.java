import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args){
        //Question 1 Test
        int[] nums = new int[]{2,0,2,1,1,0};
        int[] sorted_nums  = Question_1.sortColor(nums);
        System.out.println("Question 1: "+Arrays.toString(sorted_nums));


        //Question 2 Test
        ArrayList<Question_2.Interval> meetings = new ArrayList<>();
        //add a meeting time, must be int
        meetings.add(new Question_2.Interval(7,10));
        meetings.add(new Question_2.Interval(2,4));

        Question_2.Allmeeting(meetings);
        System.out.println("Question 2: "+Question_2.Allmeeting(meetings));
    }


}
