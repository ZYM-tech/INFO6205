public class quicksort {
    public static void quicksort(int nums[], int l, int r){
        // 递归结束条件
        if(l == r) return;

        // 逻辑部分
        // 确定分界点
        int pivot = nums[l];

        // 两个边界
        int i = l-1, j = r+1;

        while(i < j){
            //先执行一次do，再判断条件
            do i++; while(nums[i] < pivot);// 注意这里没有 =, 如果有 = 会导致栈溢出
            do j--; while(nums[j] > pivot);
            if(i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        // 进行递归, 注意取j时, p不能够取 arr[r],否则会有边界问题
        quicksort(nums, l, j);
        quicksort(nums,j+1,r);
    }
}
