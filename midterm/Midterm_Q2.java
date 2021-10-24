import java.util.HashSet;
import java.util.Set;

public class Midterm_Q2 {
    public static int findmissing(int[] nums){
        Set<Integer> set = new HashSet<Integer>();
        int max = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int s=0;s<nums.length;s++){
            if(nums[s] >= max){
                max = nums[s];
            }
        }
        for(int k=0;k<=max;k++){
            if(!set.contains(k)){
                return k;
            }
        }
        return -1;
    }
}
