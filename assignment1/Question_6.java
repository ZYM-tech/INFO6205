public class Question_6 {
    //Time: O(n)  Space: O(1)
    public static int[] evenFirst(int[] nums){
     int len = nums.length;
     int left = 0;          //left pointer
     int right = len-1;     //right pointer
     int temp;

     while (left<=right){
         if(nums[left]%2 == 0 && nums[right]%2 == 0){
             left++;
         }else if(nums[left]%2 == 0 && nums[right]%2 != 0){
             left++;
             right--;
         }else if(nums[left]%2 != 0 && nums[right]%2 == 0){
             temp = nums[left];
             nums[left] = nums[right];
             nums[right] = temp;
             left++;
             right--;
         }else
             right--;
     }
     return nums;
    }
}
