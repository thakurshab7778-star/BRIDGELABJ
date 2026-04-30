public class WordSearch {

    static int[][] directions = {
        {-1, 0}, {1, 0}, {0, -1}, {0, 1},   
        {-1, -1}, {-1, 1}, {1, -1}, {1, 1}  
    };

    public static boolean exists(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;

        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (backtrack(board, word, i, j, 0, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean backtrack(char[][] board, String word,
                                     int row, int col, int index,
                                     boolean[][] visited) {

        if (index == word.length()) return true;

        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length
                || visited[row][col]
                || board[row][col] != word.charAt(index)) {
            return false;
        }

        visited[row][col] = true;

        for (int[] dir : directions) {
            if (backtrack(board, word,
                    row + dir[0], col + dir[1],
                    index + 1, visited)) {
                return true;
            }
        }

        visited[row][col] = false; 
        return false;
    }
}