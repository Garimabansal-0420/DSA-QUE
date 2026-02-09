package Recursion;
/*import java.util.*;

public class RatInaMaze {

    static void solve(int[][] maze, int n) {
        boolean[][] visited = new boolean[n][n];
        ArrayList<String> ans = new ArrayList<>();

        if (maze[0][0] == 1)
            dfs(0, 0, maze, n, visited, "", ans);

        System.out.println(ans);
    }

    static void dfs(int i, int j, int[][] maze, int n,
                    boolean[][] visited, String path, ArrayList<String> ans) {

        // reached destination
        if (i == n - 1 && j == n - 1) {
            ans.add(path);
            return;
        }

        visited[i][j] = true;

        // Down
        if (isSafe(i + 1, j, maze, n, visited))
            dfs(i + 1, j, maze, n, visited, path + "D", ans);

        // Left
        if (isSafe(i, j - 1, maze, n, visited))
            dfs(i, j - 1, maze, n, visited, path + "L", ans);

        // Right
        if (isSafe(i, j + 1, maze, n, visited))
            dfs(i, j + 1, maze, n, visited, path + "R", ans);

        // Up
        if (isSafe(i - 1, j, maze, n, visited))
            dfs(i - 1, j, maze, n, visited, path + "U", ans);

        visited[i][j] = false; // backtrack
    }

    static boolean isSafe(int i, int j, int[][] maze, int n, boolean[][] visited) {
        return i >= 0 && j >= 0 && i < n && j < n &&
                maze[i][j] == 1 && !visited[i][j];
    }

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };
        solve(maze, maze.length);
    }
}


*/



public class RatInaMaze {
    static int n = 4;
    public static void main(String[] args) {
        int[][] maze = {
                {1, 1, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };

        boolean[][] visited = new boolean[n][n];
        solve(maze, 0, 0, visited, "");
    }

    static void solve(int[][] maze, int row, int col, boolean[][] visited, String path) {
        if (row == n - 1 && col == n - 1) {
            System.out.println(path);
            return;
        }

        if (row < 0 || col < 0 || row >= n || col >= n)
            return;

        if (maze[row][col] == 0 || visited[row][col])
            return;

        visited[row][col] = true;

        solve(maze, row + 1, col, visited, path + "D");
        solve(maze, row, col - 1, visited, path + "L");
        solve(maze, row, col + 1, visited, path + "R");
        solve(maze, row - 1, col, visited, path + "U");

        visited[row][col] = false;
    }
}














