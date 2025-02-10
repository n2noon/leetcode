// @leet start
class Solution {
    private void dfs(int m, int n, char[][] grid) {
        grid[m][n] = '0';
        if (m > 0 && grid[m-1][n] == '1') dfs(m-1, n, grid);
        if (n > 0 && grid[m][n-1] == '1') dfs(m, n-1, grid);
        if (m < grid.length - 1 && grid[m+1][n] == '1') dfs(m+1, n, grid);
        if (n < grid[0].length - 1 && grid[m][n+1] == '1') dfs(m, n+1, grid);
    }
    public int numIslands(char[][] grid) {
        int res = 0;
        for (int m = 0; m < grid.length; m++) {
            for (int n = 0; n < grid[0].length; n++) {
                if (grid[m][n] == '1') {
                    res++;
                    dfs(m, n, grid);
                }
            }
        }
        return res;
    }
}
// @leet end
