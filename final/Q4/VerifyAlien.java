public class VerifyAlien {

    public static void main(String[] args){

        String[] words = new String[]{"word","world","row"};
        String order = "worldabcefghijkmnpqstuvxyz";
        System.out.println(isSorted(words,order));
    }

    //Time:O(N) Space: O(1)
    public static boolean isSorted(String[] words, String order) {
        int[] bucket = new int[26];

        for (int i=0; i<order.length(); i++){
            bucket[order.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j<words[i].length(); j++) {
                if (j >=words[i+1].length()) {
                    return false;
                }

                if (words[i].charAt(j) != words[i+1].charAt(j)) {
                    int cur = words[i].charAt(j) - 'a';
                    int next = words[i+1].charAt(j) - 'a';

                    if (bucket[cur] > bucket[next]){
                        return false;
                    }
                    else break;
                }
            }
        }
        return true;
    }
}