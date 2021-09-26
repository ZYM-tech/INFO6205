import java.util.HashMap;

public class Question1 {
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> arr = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            arr.put(nums[i],i);
        }
        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if(arr.containsKey(diff)){
                return new int[] {arr.get(diff),i};
            }
        }
        return null;
    }
}
