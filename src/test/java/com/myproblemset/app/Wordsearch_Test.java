package com.myproblemset.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Wordsearch_Test {

    @Test
	public void testChange() {
		Wordsearch ccs = new Wordsearch(); 
		
		// Test 1
        char[][]board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String  word = "ABCCED";
        assertEquals(true,ccs.Solution(board,word));

        char[][]board1 = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String  word1 = "SEE";
        assertEquals(true,ccs.Solution(board1,word1));

        char[][]board2 = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String  word2 = "ABCB";
        assertEquals(false,ccs.Solution(board2,word2));

        char[][]board3 = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String  word3 = "A";
        assertEquals(true,ccs.Solution(board3,word3));

        char[][] board4 = {{'a'}};
        String word4 = "a";
        assertEquals(true,ccs.Solution(board4,word4));

        char[][] board5 = {{'a','b'}};
        String word5 = "ba";
        assertEquals( true,ccs.Solution(board5,word5));

        char[][] board6 = {{'a','b'},{'c','d'}};
        String word6 = "acdb";
        assertEquals( true,ccs.Solution(board6,word6));


    }
    
}
