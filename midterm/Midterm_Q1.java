public class Midterm_Q1 {
    public static int[] movezero(int[] nums){
        if(nums.length == 0){
            return null;
        }
        int zero = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                //swap
                int temp = nums[i];
                nums[i] = nums[zero];
                nums[zero] = temp;

                zero++;
            }
        }
        return nums;
    }

}
