import java.util.Arrays;

public class Question_3 {
    //Time: O(nlog(n)) Space: O(1)
    public static int maxsum(int[] nums){
        //first, sort nums; second, in each pair of 2 numbers, choose the smaller one, add them all.
        Arrays.sort(nums);
        int sum=0;
        for(int i=0; i<nums.length-1; i=i+2){
            sum = nums[i] + sum;
        }
        return sum;
    }
}
