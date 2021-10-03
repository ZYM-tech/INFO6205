public class Question_5 {
    //Time: O(n) Space: O(1)
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] alphabet = new int[26];               //create spaces for each letter
        for (int i = 0; i < s.length(); i++) {      //put every letter in s into buckets
            alphabet[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {      //use every letter in t to compare with buckets
            alphabet[t.charAt(i) - 'a']--;
            if (alphabet[t.charAt(i) - 'a'] < 0)    // if one of the buckets is less than 0, return false earlier
                return false;
        }
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] != 0)                   //if one of the buckets is not equals to 0, return false
                return false;
        }return true;
    }
}
