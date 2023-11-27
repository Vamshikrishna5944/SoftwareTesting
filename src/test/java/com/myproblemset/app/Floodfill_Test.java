package com.myproblemset.app;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

public class Floodfill_Test {

    @Test
	public void testChange() {
		Floodfill ccs = new Floodfill(); 

        int M[][]= {{1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 0, 0},
        {1, 0, 0, 1, 1, 0, 1, 1},
        {1, 2, 2, 2, 2, 0, 1, 0},
        {1, 1, 1, 2, 2, 0, 1, 0},
        {1, 1, 1, 2, 2, 2, 2, 0},
        {1, 1, 1, 1, 1, 2, 1, 1},
        {1, 1, 1, 1, 1, 2, 2, 1}};
        int ans[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 0, 0},
       {1, 0, 0, 1, 1, 0, 1, 1},
       {1, 3, 3, 3, 3, 0, 1, 0},
       {1, 1, 1, 3, 3, 0, 1, 0},
        {1, 1, 1, 3, 3, 3, 3, 0}, 
        {1, 1, 1, 1, 1, 3, 1, 1},
        {1, 1, 1, 1, 1, 3, 3, 1}};
        assertArrayEquals(ans,ccs.Solution(M,M.length,M[0].length,4,4,2,3));
        // [[1, 1, 1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1, 0, 0], [1, 0, 0, 1, 1, 0, 1, 1], [1, 3, 3, 3, 3, 0, 1, 0], [1, 1, 1, 3, 3, 0, 1, 0], [1, 1, 1, 3, 3, 3, 3, 0], [1, 1, 1, 1, 1, 3, 1, 1], [1, 1, 1, 1, 1, 3, 3, 1]]
	}
    
}
