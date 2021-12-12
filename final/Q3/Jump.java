public class Jump {
    public static void main(String[] args){

        int arr1[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int arr2[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(jump(arr1));
        System.out.println(jump(arr2));

    }
    //Time: O(n)  Space: O(1)
    public static int jump(int[] nums) {
        int curEnd = 0;
        int farest = 0;

        int count = 0;
        for (int i =0; i< nums.length-1; i++) {

            farest = Math.max(farest, i + nums[i]);

            if (i ==curEnd) {
                curEnd = farest;
                count++;
            }
        }
        return count;
    }
}