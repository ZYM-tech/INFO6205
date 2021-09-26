public class Question7 {
    public static int findPeakElement(int[] num) {
        int n = num.length;
        if (n <= 1) return 0;
        // handle the first and last element in num[]
        if (num[0] > num[1]) return 0;
        if (num[n - 1] > num[n - 2]) return n - 1;
        int left = 1, right = n - 2;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (num[mid] > num[mid - 1] && num[mid] > num[mid + 1]) {
                return mid;
            } else if (num[mid] > num[mid + 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
