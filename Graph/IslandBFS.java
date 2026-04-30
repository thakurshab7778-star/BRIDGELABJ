import java.util.*;

class IslandBFS {

    static int countIslands(int[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 1) {
                    bfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    static void bfs(int[][] grid, int i, int j) {

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        grid[i][j] = 0;

        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

        while (!q.isEmpty()) {
            int[] curr = q.poll();

            for (int[] d : dir) {
                int x = curr[0] + d[0];
                int y = curr[1] + d[1];

                if (x >= 0 && y >= 0 && x < grid.length && y < grid[0].length
                        && grid[x][y] == 1) {

                    q.add(new int[]{x, y});
                    grid[x][y] = 0;
                }
            }
        }
    }
}