import java.util.*;

//Time: O(2^n) Space: O(n)
public class HW7_Q5 {
    public int maxLength(List<String> arr) {

        Set<Integer> optSet = new HashSet<>();
        for (String word : arr)
            wordToBitSet(optSet, word);

        int[] optArr = new int[optSet.size()];
        int i = 0;
        for (Integer num : optSet)
            optArr[i++] = num;
        return backtracking(optArr, 0, 0, 0);
    }

    private void wordToBitSet(Set<Integer> optSet, String word) {

        int charBitSet = 0;
        for (char c : word.toCharArray()) {

            int mask = 1 << c - 'a';
            if ((charBitSet & mask) > 0)
                return;
            charBitSet += mask;
        }

        optSet.add(charBitSet + (word.length() << 26));
    }

    private int backtracking(int[] optArr, int pos, int resChars, int resLen) {

        int best = resLen;
        for (int i = pos; i < optArr.length; i++) {
            int newChars = optArr[i] & ((1 << 26) - 1);
            int newLen = optArr[i] >> 26;

            if ((resChars & newChars) > 0)
                continue;

            resChars += newChars;
            resLen += newLen;
            best = Math.max(best, backtracking(optArr, i + 1, resChars, resLen));

            resChars -= newChars;
            resLen -= newLen;
        }
        return best;
    }
}
