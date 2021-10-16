public class HW5_Q1 {
    //Time: O(n) Space:O(1)
    public int myAtoi(String s) {
        long result = 0;
        boolean isNegative = false;
        int i = 0;
        int len = s.length();

        while(i < len && s.charAt(i) == ' ') {
            i++;
        }

        while((i < len) && (s.charAt(i) == '+'  || s.charAt(i) == '-')) {
            if(s.charAt(i) == '-') {
                isNegative = true;
            }
            i++;
            break;
        }

        int prev = 0;
        int base = 10;

        while(i < s.length()) {
            if(Character.isDigit(s.charAt(i))) {
                int add = s.charAt(i) - '0';
                result = (result * base) + add;

                if (result > Integer.MAX_VALUE) {
                    return isNegative ? -Integer.MAX_VALUE-1 : Integer.MAX_VALUE;
                }
            } else {
                break;
            }
            i++;
        }

        return isNegative ? (int)-result : (int)result;
    }
}
