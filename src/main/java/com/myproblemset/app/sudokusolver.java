package com.myproblemset.app;

public class sudokusolver 
{
    private static boolean check(int[][] board, int row, int col, int val) 
    {
        
        for (int k = 0; k < 9; k++) 
        {
            if (board[row][k] == val)
            {
                return false;
            }
            if (board[k][col] == val)
            {
                return false;
            }
        }

        int topRowIndice = row - row % 3;
        int topColIndice = col - col % 3;

        for (int c = topRowIndice; c < topRowIndice + 3; c++) 
        {
            for (int d = topColIndice; d < topColIndice + 3; d++) 
            {
                if (board[c][d] == val) 
                {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean helper(int[][] board, int row, int col) 
    {
    
        if (row == 9) 
        {
            return true;
        }

        if (col == 9) 
        {
            return helper(board, row + 1, 0);
        }

        if (board[row][col] != 0) 
        {
            return helper(board, row, col + 1);
        }

        for (int k = 1; k <= 9; k++) 
        {
            
            if (check(board, row, col, k)) 
            {
                board[row][col] = k;
                if (helper(board, row, col + 1)) 
                {
                    return true;
                }
            }
            board[row][col] = 0;
        }

        return false;
    }

    public static boolean sudokuSolver(int[][] board) 
    {
        return helper(board, 0, 0);
    }
}
