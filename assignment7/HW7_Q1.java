public class HW7_Q1 {
    //Time: O(n) Space: O(n)
    private static final int[][] DIRS = new int[][] { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0 || word == null || word.length() == 0) {
            return false;
        }

        int rows = board.length;
        int cols = board[0].length;
        if (rows * cols < word.length()) {
            return false;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == word.charAt(0) && dfsHelper(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfsHelper(char[][] board, String word, int x, int y, int wIdx) {
        if (wIdx == word.length()) {
            return true;
        }
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y] != word.charAt(wIdx)) {
            return false;
        }

        board[x][y] = '#';

        for (int[] d : DIRS) {
            if (dfsHelper(board, word, x + d[0], y + d[1], wIdx + 1)) {
                board[x][y] = word.charAt(wIdx);
                return true;
            }
        }
        board[x][y] = word.charAt(wIdx);
        return false;
    }
}
