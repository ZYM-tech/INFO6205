import java.util.HashSet;
import java.util.Set;

public class Midterm_Q2 {
    //self
    public static int findmissing(int[] nums){
        int n = nums.length;
        Set<Integer> set = new HashSet<Integer>();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for(int k=0;k<=n;k++){
            if(!set.contains(k)){
                return k;
            }
        }
        return -1;
    }
}
