package com.myproblemset.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Rule;

import org.junit.contrib.java.lang.system.SystemOutRule;

public class numberofislandstest 
{
    
    @Test
	public void testChange() 
    {
        numberofislands noi = new numberofislands() ;

        int[][] grid1 = {
            {1, 1, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 1, 1},
            {0, 0, 0, 1, 1}
        };
        assertEquals(1, noi.distinctIsland(grid1,5,5));

        int[][] grid2 = {
            {0, 0},
            {0, 0}
        };
        assertEquals(0, noi.distinctIsland(grid2,2,2));

        int[][] grid3 = {
            {0, 0, 0, 1, 1, 0},
            {0, 0, 0, 1, 0, 0},
            {1, 0, 1, 0, 0, 0},
            {0, 0, 0, 1, 1, 0},
            {1, 0, 0, 0, 0, 1}
        };
        assertEquals(3, noi.distinctIsland(grid3,5,6));
    }


}
