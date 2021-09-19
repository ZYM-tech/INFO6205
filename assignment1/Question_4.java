import java.util.Arrays;

public class Question_4 {
//use left and right pointers, compare the absolute value of left and right, bigger ones add to result array first.
    public static int[] sqnums(int[] nums){
        int i = 0;//left pointer
        int j = nums.length-1;//right pointer
        int a = nums.length-1;//result array pointer
        int[] sqnums = new int[nums.length];

        while(i<=j && a>=0){
            //left > right
            if(nums[i]+nums[j]<=0){
                sqnums[a] = nums[i]*nums[i];
                i++;
            }//left < right
            else if(nums[i]+nums[j]>0){
                sqnums[a] = nums[j]*nums[j];
                j--;
            }
            a--;
        }
        return sqnums;
    }
}
