public class MazePaths {
    static int N = 4;  // size of the grid
    static int[][] maze = {
        {1, 0, 1, 1},
        {1, 1, 1, 0},
        {0, 1, 0, 1},
        {1, 1, 1, 1}
    };

    public static void findPaths(int i, int j, String path, boolean[][] visited) {
        // Base case: reached destination
        if (i == N - 1 && j == N - 1) {
            System.out.println(path);
            return;
        }

        // Mark as visited
        visited[i][j] = true;

        // Move Down
        if (i + 1 < N && maze[i + 1][j] == 1 && !visited[i + 1][j]) {
            findPaths(i + 1, j, path + "D", visited);
        }

        // Move Right
        if (j + 1 < N && maze[i][j + 1] == 1 && !visited[i][j + 1]) {
            findPaths(i, j + 1, path + "R", visited);
        }

        // Move Up
        if (i - 1 >= 0 && maze[i - 1][j] == 1 && !visited[i - 1][j]) {
            findPaths(i - 1, j, path + "U", visited);
        }

        // Move Left
        if (j - 1 >= 0 && maze[i][j - 1] == 1 && !visited[i][j - 1]) {
            findPaths(i, j - 1, path + "L", visited);
        }

        // Backtrack (unmark)
        visited[i][j] = false;
    }

    public static void main(String[] args) {
        boolean[][] visited = new boolean[N][N];
        System.out.println("All paths from start to end:");
        findPaths(0, 0, "", visited);
    }
}
