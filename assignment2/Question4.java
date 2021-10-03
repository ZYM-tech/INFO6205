import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question4 {
    public static List<Integer> majorityElement(int[] nums) {
        if(nums.length == 0 || nums == null){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            int end = getLastPosition(nums,i,nums.length-1,nums[i]);
            System.out.println(end);
            if((end - i+1) > (n/3)){
                result.add(nums[i]);
                i = end;
            }
        }
        return result;
    }

    private static int getLastPosition(int[] nums,int start,int end,int key){
        if(start>=end){
            return start;
        }
        int result = -1;
        while(start<=end){
            int middle = start + (end - start)/2;
            if(nums[middle] == key){
                result = middle;
                start = middle + 1;
            }else if(key>nums[middle]){
                start = middle + 1;
            }else{
                end = middle - 1;
            }
        }
        return result;
    }
}
