package com.myproblemset.app;

public class Wordsearch {
    private int maxr, maxc;
    private int checker;

    private boolean recfun(int r, int c, int index, String word, char[][] board) {
        if (index == checker) {
            return true;
        }
        if (r + 1 < maxr && board[r + 1][c] == word.charAt(index)) {
            char ch = board[r][c];
            board[r][c] = '!';
            if (recfun(r + 1, c, index + 1, word, board)) return true;
            board[r][c] = ch;
        }
        if (c - 1 >= 0 && board[r][c - 1] == word.charAt(index)) {
            char ch = board[r][c];
            board[r][c] = '!';
            if (recfun(r, c - 1, index + 1, word, board)) return true;
            board[r][c] = ch;
        }
        if (c + 1 < maxc && board[r][c + 1] == word.charAt(index)) {
            char ch = board[r][c];
            board[r][c] = '!';
            if (recfun(r, c + 1, index + 1, word, board)) return true;
            board[r][c] = ch;
        }
        if (r - 1 >= 0 && board[r - 1][c] == word.charAt(index)) {
            char ch = board[r][c];
            board[r][c] = '!';
            if (recfun(r - 1, c, index + 1, word, board)) return true;
            board[r][c] = ch;
        }
        return false;
    }

    public boolean Solution(char[][] board, String word) {
        maxr = board.length;
        maxc = board[0].length;
        checker = word.length();

        for (int i = 0; i < maxr; i++) {
            for (int j = 0; j < maxc; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (recfun(i, j, 1, word, board)) return true;
                }
            }
        }
        return false;
    }
}


    
