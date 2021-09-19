public class Question_1 {
    private static void swap(int[] arr, int a,int b){
        if(a<0||a>arr.length-1||b<0||b>arr.length-1||arr==null){
            return;
        }else{
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }
    public static int[] sortColor(int[] nums) {
        int i = 0;
        int start = 0;
        int end = nums.length - 1;
        while (i <= end) {
            if (nums[i] == 2) {
                swap(nums, i, end);
                end--;
            } else if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 0) {
                swap(nums, i, start);
                start++;
                i++;
            }
        }
        return nums;
    }
}


