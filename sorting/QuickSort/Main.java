import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] nums = new int[]{1,3,4,2,8,5,6,9,0,43};
        quicksort.quicksort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
