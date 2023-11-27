package com.mylinkedlist.app;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Rule;

import org.junit.contrib.java.lang.system.SystemOutRule;

public class sudokusolvertest 
{
    @Test
    public void sudoku()
    {
         sudokusolver ss  = new sudokusolver();
         int[][] matrix1 = {
            {3, 0, 5, 4, 2, 0, 8, 1, 0},
            {4, 8, 7, 9, 0, 1, 5, 0, 6},
            {0, 2, 9, 0, 5, 6, 3, 7, 4},
            {8, 5, 0, 7, 9, 3, 0, 4, 1},
            {6, 1, 3, 2, 0, 8, 9, 5, 7},
            {6, 1, 3, 2, 0, 8, 9, 5, 7},
            {0, 7, 4, 0, 6, 5, 2, 8, 0},
            {2, 4, 1, 3, 0, 9, 0, 6, 5},
            {5, 0, 8, 6, 7, 0, 1, 9, 2}
        };
        assertEquals(false, ss.sudokuSolver(matrix1));

        int[][] matrix2 = {
            {0, 6, 2, 0, 7, 4, 5, 9, 8},
            {8, 5, 4, 2, 1, 9, 0, 7, 3},
            {9, 7, 3, 0, 6, 8, 1, 2, 4},
            {3, 8, 5, 1, 4, 2, 7, 6, 9},
            {2, 4, 0, 9, 5, 6, 8, 3, 1},
            {6, 0, 9, 8, 3, 7, 2, 4, 5},
            {0, 3, 6, 0, 8, 1, 9, 5, 2},
            {7, 2, 1, 0, 9, 5, 3, 8, 6},
            {5, 0, 8, 6, 2, 3, 4, 1, 7}
        };
        assertEquals(true, ss.sudokuSolver(matrix2));

        int[][] matrix3 = {
            {0, 6, 2, 0, 7, 4, 5, 0, 8},
            {8, 5, 4, 2, 1, 9, 0, 7, 3},
            {9, 7, 3, 0, 6, 8, 1, 2, 4},
            {3, 8, 5, 0, 4, 2, 7, 6, 9},
            {0, 4, 0, 9, 5, 6, 8, 3, 1},
            {6, 0, 0, 8, 3, 7, 2, 4, 5},
            {0, 3, 6, 0, 8, 0, 9, 5, 2},
            {7, 2, 1, 0, 9, 5, 3, 8, 6},
            {5, 0, 8, 0, 2, 3, 4, 1, 7}
        };
        assertEquals(true, ss.sudokuSolver(matrix3));   
    }
}
