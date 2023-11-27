package com.mylinkedlist.app;

public class minimumsumpath {

    public static int minSumPath(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        return minSumHelper(grid, 0, 0, n, m);
    }

    private static int minSumHelper(int[][] grid, int i, int j, int n, int m) {
        if (i >= n || j >= m) {
            return Integer.MAX_VALUE;
        }

        if (i == n - 1 && j == m - 1) {
            return grid[i][j];
        }

        int right = minSumHelper(grid, i, j + 1, n, m);
        int down = minSumHelper(grid, i + 1, j, n, m);

        int curSum = grid[i][j] + Math.min(right, down);
        return curSum;
    }
}

